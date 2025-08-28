import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Genera un archivo Java (JuanOut.java) desde el árbol de la gramática 'Juan'.
 * - Declara variables (ENTERO -> int, CADENA -> String)
 * - Asignaciones, imprimir, if/else (SI/SINO/FIN), while (MIENTRAS/FIN)
 * - Expresiones aritméticas y comparaciones
 *
 * Mejoras:
 * - Cabecera documentada (fuente .remi y fecha/hora)
 * - Comparación de cadenas correcta: '=='/'!=' se traducen a helpers eq/neq
 * - Constant folding seguro para aritmética con literales int
 */
public class GeneradorCodigo extends JuanBaseVisitor<String> {

    private final String IND = "    ";

    // Acumuladores por secciones
    private final StringBuilder decls = new StringBuilder();  // declaraciones (int x; String s;)
    private final StringBuilder body  = new StringBuilder();  // cuerpo (sentencias)

    // Tabla de símbolos mínima: nombre -> tipo ("int" | "String")
    private final Map<String, String> tipos = new LinkedHashMap<>();

    // Nombre del archivo fuente para documentar en la salida
    private final String fuente;

    public GeneradorCodigo(String nombreFuente) {
        this.fuente = nombreFuente;
    }

    public String generar(ParseTree tree) {
        // Visitar programa
        visit(tree);

        // Armar clase Java
        StringBuilder sb = new StringBuilder();

        // Cabecera documentada
        sb.append("/*\n");
        sb.append(" * JuanOut.java - generado por Remilang\n");
        sb.append(" * Fuente: ").append(fuente == null ? "<desconocido>" : fuente).append("\n");
        sb.append(" * Fecha:  ").append(new java.util.Date().toString()).append("\n");
        sb.append(" */\n");

        sb.append("import java.util.*;\n");
        sb.append("public class JuanOut {\n");

        // Helpers de igualdad (int/String)
        sb.append(IND).append("// Helpers de igualdad para int y String\n");
        sb.append(IND).append("private static boolean eq(int a, int b){ return a == b; }\n");
        sb.append(IND).append("private static boolean eq(String a, String b){ return Objects.equals(a, b); }\n");
        sb.append(IND).append("private static boolean neq(int a, int b){ return a != b; }\n");
        sb.append(IND).append("private static boolean neq(String a, String b){ return !Objects.equals(a, b); }\n\n");

        sb.append(IND).append("public static void main(String[] args) {\n");

        // Declaraciones primero
        if (decls.length() > 0) {
            sb.append(IND).append("// Declaraciones\n");
            sb.append(decls);
            sb.append("\n");
        }

        // Luego el cuerpo
        sb.append(IND).append("// Sentencias\n");
        sb.append(body);

        sb.append(IND).append("}\n");
        sb.append("}\n");

        return sb.toString();
    }

    // ---------- Reglas de alto nivel ----------

    @Override
    public String visitProgram(JuanParser.ProgramContext ctx) {
        for (JuanParser.SentenciaContext s : ctx.sentencia()) {
            visit(s);
        }
        return null;
    }

    @Override
    public String visitSentencia(JuanParser.SentenciaContext ctx) {
        if (ctx.declararVariable() != null) {
            visit(ctx.declararVariable());
        } else if (ctx.asignarValor() != null) {
            body.append(IND).append(visit(ctx.asignarValor())).append(";\n");
        } else if (ctx.imprimirValor() != null) {
            body.append(IND).append(visit(ctx.imprimirValor())).append(";\n");
        } else if (ctx.condicional() != null) {
            body.append(visit(ctx.condicional()));
        } else if (ctx.bucle() != null) {
            body.append(visit(ctx.bucle()));
        }
        return null;
    }

    // ---------- Declaraciones / Asignaciones / Imprimir ----------

    @Override
    public String visitDeclararVariable(JuanParser.DeclararVariableContext ctx) {
        String tipo = visit(ctx.tipoVariable());        // "int" | "String"
        String nombre = ctx.ID().getText();

        // Registrar tipo
        tipos.put(nombre, tipo);

        if (ctx.expresion() != null) {
            String expr = visit(ctx.expresion());
            decls.append(IND).append(tipo).append(" ").append(nombre).append(" = ").append(expr).append(";\n");
        } else {
            // sin inicializador
            String def = tipo.equals("int") ? "0" : "null";
            decls.append(IND).append(tipo).append(" ").append(nombre).append(" = ").append(def).append(";\n");
        }
        return null;
    }

    @Override
    public String visitAsignarValor(JuanParser.AsignarValorContext ctx) {
        String id = ctx.ID().getText();
        String expr = visit(ctx.expresion());
        return id + " = " + expr;
    }

    @Override
    public String visitImprimirValor(JuanParser.ImprimirValorContext ctx) {
        String expr = visit(ctx.expresion());
        return "System.out.println(" + expr + ")";
    }

    // ---------- Control de flujo ----------

    @Override
    public String visitCondicional(JuanParser.CondicionalContext ctx) {
        StringBuilder sb = new StringBuilder();
        String cond = visit(ctx.expresion());
        sb.append(IND).append("if (").append(cond).append(") {\n");
        sb.append(visit(ctx.bloque(0)));
        sb.append(IND).append("}\n");
        if (ctx.SINO() != null) {
            sb.append(IND).append("else {\n");
            sb.append(visit(ctx.bloque(1)));
            sb.append(IND).append("}\n");
        }
        return sb.toString();
    }

    @Override
    public String visitBucle(JuanParser.BucleContext ctx) {
        StringBuilder sb = new StringBuilder();
        String cond = visit(ctx.expresion());
        sb.append(IND).append("while (").append(cond).append(") {\n");
        sb.append(visit(ctx.bloque()));
        sb.append(IND).append("}\n");
        return sb.toString();
    }

    @Override
    public String visitBloque(JuanParser.BloqueContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (JuanParser.SentenciaContext s : ctx.sentencia()) {
            // Para que respete indentación dentro de if/while:
            int baseLen = body.length();
            visit(s);
            String added = body.substring(baseLen);
            // Re-indentar con 1 nivel adicional
            String reind = Arrays.stream(added.split("\n", -1))
                    .map(line -> line.isEmpty() ? line : IND + line)
                    .collect(Collectors.joining("\n"));
            // Consumir lo agregado y escribirlo localmente
            body.setLength(baseLen);
            sb.append(reind);
            if (!reind.endsWith("\n")) sb.append("\n");
        }
        return sb.toString();
    }

    // ---------- Expresiones ----------

    @Override
    public String visitComparacionOp(JuanParser.ComparacionOpContext ctx) {
        String l = visit(ctx.expresion(0));
        String r = visit(ctx.expresion(1));
        String op = ctx.op.getText();

        if ("==".equals(op)) {
            return "eq(" + l + ", " + r + ")";
        } else if ("!=".equals(op)) {
            return "neq(" + l + ", " + r + ")";
        } else {
            // <, >, <=, >= se emiten tal cual (semántica ya validó tipos int)
            return "(" + l + " " + op + " " + r + ")";
        }
    }

    @Override
    public String visitSumaOp(JuanParser.SumaOpContext ctx) {
        String l = visit(ctx.expresion(0));
        String r = visit(ctx.expresion(1));

        // Constant folding para enteros
        String folded = foldArit("+", l, r);
        if (folded != null) return folded;

        return "(" + l + " + " + r + ")";
    }

    @Override
    public String visitMultiplicacionOp(JuanParser.MultiplicacionOpContext ctx) {
        String l = visit(ctx.expresion(0));
        String r = visit(ctx.expresion(1));
        String op = ctx.op.getText();

        // Constant folding para enteros
        String folded = foldArit(op, l, r);
        if (folded != null) return folded;

        return "(" + l + " " + op + " " + r + ")";
    }

    @Override
    public String visitExpresionParentesis(JuanParser.ExpresionParentesisContext ctx) {
        String sub = visit(ctx.expresion());
        // Paréntesis mínimos: si el sub ya es literal o ID, podemos omitirlos
        if (esIntLiteral(sub) || esStringLiteral(sub) || esIdentificador(sub)) {
            return sub;
        }
        return "(" + sub + ")";
    }

    @Override
    public String visitExpresionLiteral(JuanParser.ExpresionLiteralContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public String visitIdExpresion(JuanParser.IdExpresionContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitLiteral(JuanParser.LiteralContext ctx) {
        if (ctx.INT() != null) return ctx.INT().getText();
        return ctx.STRING().getText(); // ya viene con comillas
    }

    // ---------- tipos ----------

    @Override
    public String visitTipoVariable(JuanParser.TipoVariableContext ctx) {
        if (ctx.ENTERO() != null) return "int";
        if (ctx.CADENA() != null) return "String";
        throw new RuntimeException("Tipo no soportado: " + ctx.getText());
    }

    // ---------- Helpers de codegen ----------

    private boolean esIntLiteral(String s) {
        return s != null && s.matches("-?\\d+");
    }

    private boolean esStringLiteral(String s) {
        return s != null && s.length() >= 2 && s.startsWith("\"") && s.endsWith("\"");
    }

    private boolean esIdentificador(String s) {
        return s != null && s.matches("[a-zA-Z_][a-zA-Z_0-9]*");
    }

    /**
     * Constant folding para aritmética de enteros: +, -, *, /
     * Devuelve el resultado como String si se puede; si no, null.
     */
    private String foldArit(String op, String l, String r) {
        if (!esIntLiteral(l) || !esIntLiteral(r)) return null;
        long a = Long.parseLong(l);
        long b = Long.parseLong(r);
        switch (op) {
            case "+": return String.valueOf(a + b);
            case "-": return String.valueOf(a - b);
            case "*": return String.valueOf(a * b);
            case "/":
                if (b == 0) return null; // no fold para ÷0
                return String.valueOf(a / b);
            default: return null;
        }
    }
}
