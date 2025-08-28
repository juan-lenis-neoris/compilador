import java.util.*;
import org.antlr.v4.runtime.Token;

public class Semantico extends JuanBaseVisitor<String> {

    // Tabla de símbolos (global para el proyecto). Si quieres scopes, se puede migrar a un stack<Map<>>
    private final Map<String, String> tabla = new LinkedHashMap<>();
    private final Set<String> inicializadas = new HashSet<>();

    // Reporte
    private final List<String> errores = new ArrayList<>();
    private final List<String> advertencias = new ArrayList<>();

    public boolean tieneErrores() { return !errores.isEmpty(); }
    public List<String> getErrores() { return errores; }
    public List<String> getAdvertencias() { return advertencias; }

    // -------- Utilidades de ubicación y mensajes --------
    private int linea(org.antlr.v4.runtime.ParserRuleContext ctx) {
        Token t = ctx.getStart();
        return t != null ? t.getLine() : -1;
    }

    private int columna(org.antlr.v4.runtime.ParserRuleContext ctx) {
        Token t = ctx.getStart();
        return (t != null ? t.getCharPositionInLine() : 0) + 1;
    }

    private void err(org.antlr.v4.runtime.ParserRuleContext ctx, String mensaje) {
        errores.add("[SEMÁNTICO] Línea " + linea(ctx) + ", Col " + columna(ctx) + ": " + mensaje);
    }

    private void warn(org.antlr.v4.runtime.ParserRuleContext ctx, String mensaje) {
        advertencias.add("[ADVERTENCIA] Línea " + linea(ctx) + ", Col " + columna(ctx) + ": " + mensaje);
    }

    // -------- Programa / Sentencias --------

    @Override
    public String visitProgram(JuanParser.ProgramContext ctx) {
        for (JuanParser.SentenciaContext s : ctx.sentencia()) {
            visit(s);
        }
        return null;
    }

    @Override
    public String visitSentencia(JuanParser.SentenciaContext ctx) {
        // delega en las subreglas
        return super.visitSentencia(ctx);
    }

    @Override
    public String visitDeclararVariable(JuanParser.DeclararVariableContext ctx) {
        String nombre = ctx.ID().getText();
        String tipo = visit(ctx.tipoVariable()); // "int" | "String"

        if (tabla.containsKey(nombre)) {
            err(ctx, "variable '" + nombre + "' ya declarada. Sugerencia: usa otro nombre o elimina la declaración previa.");
        } else {
            tabla.put(nombre, tipo);
        }

        if (ctx.expresion() != null) {
            String tExpr = visit(ctx.expresion());
            if (!compatiblesAsignacion(tipo, tExpr)) {
                err(ctx, "no se puede asignar '" + tExpr + "' a '" + tipo + "'. Sugerencia: ajusta el tipo del lado derecho o cambia el tipo de la variable.");
            } else {
                inicializadas.add(nombre); // quedó con un valor inicial
            }
        }

        return null;
    }

    @Override
    public String visitAsignarValor(JuanParser.AsignarValorContext ctx) {
        String nombre = ctx.ID().getText();

        if (!tabla.containsKey(nombre)) {
            err(ctx, "variable '" + nombre + "' no declarada. Sugerencia: declara 'entero " + nombre + ";' o 'cadena " + nombre + ";' antes de usarla.");
            // continuamos para visitar la expresión y reportar más
        }

        String tExpr = visit(ctx.expresion());
        String tVar = tabla.get(nombre);

        if (tVar != null && !compatiblesAsignacion(tVar, tExpr)) {
            err(ctx, "no se puede asignar '" + tExpr + "' a '" + tVar + "'. Sugerencia: corrige los tipos o realiza conversión explícita.");
        } else if (tVar != null) {
            inicializadas.add(nombre); // ya tiene valor
        }
        return null;
    }

    @Override
    public String visitImprimirValor(JuanParser.ImprimirValorContext ctx) {
        // cualquier tipo es imprimible
        visit(ctx.expresion());
        return null;
    }

    @Override
    public String visitCondicional(JuanParser.CondicionalContext ctx) {
        String t = visit(ctx.expresion());
        if (!"boolean".equals(t)) {
            err(ctx, "la condición de 'si' debe ser booleana (recibido: " + t + "). Sugerencia: usa una comparación, p. ej. x > 0.");
        }
        visit(ctx.bloque(0));
        if (ctx.SINO() != null) visit(ctx.bloque(1));
        return null;
    }

    @Override
    public String visitBucle(JuanParser.BucleContext ctx) {
        String t = visit(ctx.expresion());
        if (!"boolean".equals(t)) {
            err(ctx, "la condición de 'mientras' debe ser booleana (recibido: " + t + "). Sugerencia: usa una comparación, p. ej. i != 0.");
        }
        visit(ctx.bloque());
        return null;
    }

    @Override
    public String visitBloque(JuanParser.BloqueContext ctx) {
        for (JuanParser.SentenciaContext s : ctx.sentencia()) {
            visit(s);
        }
        return null;
    }

    // -------- Expresiones: devuelven "int" | "String" | "boolean" --------

    @Override
    public String visitComparacionOp(JuanParser.ComparacionOpContext ctx) {
        String L = visit(ctx.expresion(0));
        String R = visit(ctx.expresion(1));
        String op = ctx.op.getText();

        if (op.equals("==") || op.equals("!=")) {
            if (!(L.equals(R) && (L.equals("int") || L.equals("String")))) {
                err(ctx, "'" + op + "' requiere operandos del mismo tipo int o String (recibidos: " + L + " y " + R + ").");
            }
        } else { // <, >, <=, >=
            if (!(L.equals("int") && R.equals("int"))) {
                err(ctx, "'" + op + "' solo admite int (recibidos: " + L + " y " + R + ").");
            }
        }
        return "boolean";
    }

    @Override
    public String visitSumaOp(JuanParser.SumaOpContext ctx) {
        String L = visit(ctx.expresion(0));
        String R = visit(ctx.expresion(1));
        if (L.equals("int") && R.equals("int")) return "int";
        if (L.equals("String") && R.equals("String")) return "String";
        err(ctx, "'+' inválido entre " + L + " y " + R + ". Sugerencia: alinea los tipos o usa conversión a String si buscas concatenar.");
        return "int"; // continuar análisis
    }

    @Override
    public String visitMultiplicacionOp(JuanParser.MultiplicacionOpContext ctx) {
        String L = visit(ctx.expresion(0));
        String R = visit(ctx.expresion(1));
        String op = ctx.op.getText();
        if (L.equals("int") && R.equals("int")) {
            // Warning estático para división por cero si RHS es literal 0
            if (op.equals("/") && esCeroLiteral(ctx.expresion(1))) {
                warn(ctx, "posible división entre cero. Sugerencia: valida el denominador antes de dividir.");
            }
            return "int";
        }
        err(ctx, "'" + op + "' solo admite int (recibidos: " + L + " y " + R + ").");
        return "int";
    }

    @Override
    public String visitExpresionParentesis(JuanParser.ExpresionParentesisContext ctx) {
        return visit(ctx.expresion());
    }

    @Override
    public String visitExpresionLiteral(JuanParser.ExpresionLiteralContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public String visitIdExpresion(JuanParser.IdExpresionContext ctx) {
        String nombre = ctx.ID().getText();
        if (!tabla.containsKey(nombre)) {
            err(ctx, "variable '" + nombre + "' no declarada. Sugerencia: declara la variable antes de usarla.");
            return "int"; // para seguir reportando
        }
        if (!inicializadas.contains(nombre)) {
            warn(ctx, "la variable '" + nombre + "' podría no estar inicializada. Sugerencia: asígnale un valor antes de leerla.");
        }
        return tabla.get(nombre);
    }

    @Override
    public String visitLiteral(JuanParser.LiteralContext ctx) {
        if (ctx.INT() != null) return "int";
        return "String";
    }

    @Override
    public String visitTipoVariable(JuanParser.TipoVariableContext ctx) {
        if (ctx.ENTERO() != null) return "int";
        if (ctx.CADENA() != null) return "String";
        return "int";
    }

    // -------- Helpers --------

    private boolean compatiblesAsignacion(String lhs, String rhs) {
        // Sin casting implícito en esta versión
        return lhs.equals(rhs);
    }

    private boolean esCeroLiteral(JuanParser.ExpresionContext e) {
        if (e instanceof JuanParser.ExpresionLiteralContext) {
            JuanParser.LiteralContext lit = ((JuanParser.ExpresionLiteralContext) e).literal();
            return lit != null && lit.INT() != null && "0".equals(lit.INT().getText());
        }
        return false;
    }
}
