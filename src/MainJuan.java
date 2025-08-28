import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.io.*;

public class MainJuan {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Uso: java -cp \"tools\\antlr-4.13.2-complete.jar;gen\" MainJuan <archivo.remi>");
            System.exit(1);
        }

        String inputPath = args[0];
        String source = Files.readString(Paths.get(inputPath));

        CharStream cs = CharStreams.fromString(source);
        JuanLexer lexer = new JuanLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuanParser parser = new JuanParser(tokens);

        // Parser en modo "fail-fast" con mensaje claro
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> r, Object sym, int line, int col, String msg, RecognitionException e) {
                throw new RuntimeException("Error de sintaxis en línea " + line + ":" + col + " -> " + msg);
            }
        });

        ParseTree tree = parser.program();

        // ---- Fase 3: Análisis semántico
        Semantico sem = new Semantico();
        sem.visit(tree);

        if (sem.tieneErrores()) {
            System.err.println("Errores semánticos:");
            for (String e : sem.getErrores()) {
                System.err.println("  - " + e);
            }
            System.exit(2);
        }

        // Mostrar advertencias si las hay (no bloquean)
        if (!sem.getAdvertencias().isEmpty()) {
            System.out.println("Advertencias:");
            for (String w : sem.getAdvertencias()) {
                System.out.println("  - " + w);
            }
        }

        // ---- Fase 4: Generación de código
        String outDir = "out";
        Files.createDirectories(Paths.get(outDir));
        String outFile = outDir + File.separator + "JuanOut.java";

        GeneradorCodigo gen = new GeneradorCodigo(inputPath);  // pasar fuente para documentar
        String javaCode = gen.generar(tree);
        Files.writeString(Paths.get(outFile), javaCode);

        System.out.println("[OK] Generado: " + outFile);
        System.out.println("Compila con:  javac -d out out\\JuanOut.java");
        System.out.println("Ejecuta con:  java -cp out JuanOut");
    }
}
