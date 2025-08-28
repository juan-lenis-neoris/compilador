import org.antlr.v4.runtime.*;
import java.nio.file.*;
import java.io.*;

public class Lexico {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Uso: java -cp \"tools\\antlr-4.13.2-complete.jar;gen\" Lexico <archivo.remi>");
            System.exit(1);
        }

        String inputPath = args[0];
        String source = Files.readString(Paths.get(inputPath));

        CharStream cs = CharStreams.fromString(source);
        JuanLexer lexer = new JuanLexer(cs);
        Vocabulary vocab = lexer.getVocabulary();

        int i = 0;
        while (true) {
            Token t = lexer.nextToken();
            if (t.getType() == Token.EOF) {
                System.out.printf("# %d EOF <EOF>%n", i);
                break;
            }
            String name = vocab.getSymbolicName(t.getType());
            if (name == null) name = vocab.getDisplayName(t.getType());
            name = mostrarNombre(name);

            // línea/columna son base-1 en línea y base-0 en columna en ANTLR; mostramos ambos +1 por claridad
            int line = t.getLine();
            int col = t.getCharPositionInLine() + 1;

            System.out.printf("# %d %-12s %-20s (línea:%d, col:%d)%n",
                    i, name, quoteLexeme(t.getText()), line, col);
            i++;
        }

        // Nota: WS y COMMENT no aparecen porque tu gramática los ignora con `-> skip`.
    }

    private static String mostrarNombre(String name) {
          if (name == null) return null;
          switch (name) {
               case "SI":       return "CONDICIONAL_SI";
               case "SINO":     return "CONDICIONAL_NO";
               case "ENTERO":
               case "CADENA":   return "TIPO_VARIABLE";
               default:         return name;
          }
     }

    private static String quoteLexeme(String s) {
        if (s == null) return "<null>";
        // mostrar controladamente (escapar saltos de línea y comillas)
        return "\"" + s.replace("\\", "\\\\")
                       .replace("\"", "\\\"")
                       .replace("\r", "\\r")
                       .replace("\n", "\\n") + "\"";
    }
}
