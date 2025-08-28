# 📘 README – Fase de Generación de Código

## 🎯 Objetivo
Traducir programas escritos en **Remilang** a **Java funcional**, optimizado y documentado.

---

## 🔎 Estrategia
Se implementó un visitor (`GeneradorCodigo.java`) que:
- Recorre el AST y produce un archivo `JuanOut.java`.
- Traduce cada constructo:
  - Declaraciones → `int x = 0;` o `String s = null;`
  - Asignaciones → `x = 5 + 3;`
  - Impresión → `System.out.println(expr);`
  - Condicionales → `if (...) { ... } else { ... }`
  - Bucles → `while (...) { ... }`

### Mejoras implementadas
- **Cabecera documentada** en `JuanOut.java` (fuente `.remi`, fecha de generación).
- **Comentarios de sección** (declaraciones, sentencias).
- **Helpers eq/neq** para comparar `int` y `String` correctamente:
  ```java
  private static boolean eq(String a, String b){ return Objects.equals(a,b); }
  private static boolean neq(String a, String b){ return !Objects.equals(a,b); }
  ```

- Constant folding: expresiones con literales int se evalúan en tiempo de compilación:
  - `5 + 3 * 2` → `11`
  - `(4 / 2)` → `2`
  - (se evita división entre cero).