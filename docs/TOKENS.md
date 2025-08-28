# 📑 Listado de Tokens – Proyecto Final (Remilang)

Este documento muestra los **tokens definidos en la gramática Juan.g4**, junto con su lexema ejemplo y descripción.

---

## 🔹 Palabras reservadas
| Token       | Lexema     | Descripción                           |
|-------------|-----------|---------------------------------------|
| `SI`        | `si`      | Inicio de condicional                 |
| `SINO`      | `sino`    | Rama alternativa en condicional        |
| `FIN`       | `fin`     | Cierre de bloque (`si`, `mientras`)   |
| `MIENTRAS`  | `mientras`| Inicio de bucle                       |
| `IMPRIMIR`  | `imprimir`| Imprimir valor en salida estándar      |

---

## 🔹 Tipos de variables
| Token      | Lexema    | Descripción              |
|------------|----------|--------------------------|
| `ENTERO`   | `entero` | Declaración de enteros    |
| `CADENA`   | `cadena` | Declaración de cadenas    |

---

## 🔹 Operadores
| Token         | Lexema | Descripción             |
|---------------|--------|-------------------------|
| `IGUAL`       | `=`    | Asignación              |
| `SUMAR`       | `+`    | Suma / concatenación    |
| `RESTAR`      | `-`    | Resta                   |
| `MULTIPLICAR` | `*`    | Multiplicación          |
| `DIVIDIR`     | `/`    | División                |
| `MAYOR`       | `>`    | Comparación mayor       |
| `MENOR`       | `<`    | Comparación menor       |
| `MAYORIGUAL`  | `>=`   | Comparación mayor/igual |
| `MENORIGUAL`  | `<=`   | Comparación menor/igual |
| `IGUALDAD`    | `==`   | Igualdad                 |
| `DIFERENTE`   | `!=`   | Distinto                 |

---

## 🔹 Símbolos de agrupación
| Token        | Lexema | Descripción         |
|--------------|--------|---------------------|
| `PAREN_IZQ`  | `(`    | Paréntesis izquierdo|
| `PAREN_DER`  | `)`    | Paréntesis derecho  |
| `PUNTOYCOMA` | `;`    | Fin de sentencia    |

---

## 🔹 Identificadores y literales
| Token    | Ejemplo       | Descripción             |
|----------|--------------|-------------------------|
| `ID`     | `x`, `s1`    | Identificadores         |
| `INT`    | `42`         | Números enteros         |
| `STRING` | `"hola"`     | Cadenas de texto        |

---

## 🔹 Espacios y comentarios
| Token     | Ejemplo                  | Acción   |
|-----------|--------------------------|----------|
| `WS`      | `" "`, `\n`, `\t`        | Ignorado |
| `COMMENT` | `# esto es un comentario`| Ignorado |

---

## 📷 Evidencia de ejecución
Ejemplo de listado de tokens con el archivo `demo1.remi`:

0 ENTERO "entero" (línea:1, col:1)
1 ID "x" (línea:1, col:8)
2 PUNTOYCOMA ";" (línea:1, col:9)
3 CADENA "cadena" (línea:2, col:1)
4 ID "s" (línea:2, col:8)
5 IGUAL "=" (línea:2, col:10)
6 STRING ""hola"" (línea:2, col:12)

---

✅ Con esto se demuestra que los **tokens son completos, correctos y bien documentados**.