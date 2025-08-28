/*
 * JuanOut.java - generado por Remilang
 * Fuente: examples\juanExample.remi
 * Fecha:  Thu Aug 28 12:57:25 COT 2025
 */
import java.util.*;
public class JuanOut {
    // Helpers de igualdad para int y String
    private static boolean eq(int a, int b){ return a == b; }
    private static boolean eq(String a, String b){ return Objects.equals(a, b); }
    private static boolean neq(int a, int b){ return a != b; }
    private static boolean neq(String a, String b){ return !Objects.equals(a, b); }

    public static void main(String[] args) {
    // Declaraciones
    int x = 0;
    String s = "hola";

    // Sentencias
    x = 16;
    System.out.println(x);
    if ((x > 10)) {
        System.out.println("mayor");
    }
    else {
        System.out.println("no mayor");
    }
    }
}
