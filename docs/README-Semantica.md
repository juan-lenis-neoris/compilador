# 📘 README – Fase de Semántica

## 🎯 Objetivo
Verificar que los programas escritos en **Remilang** sean **semánticamente correctos**:
- Variables declaradas antes de usarse.
- Tipos de datos consistentes en asignaciones y operaciones.
- Condiciones en `si` y `mientras` sean booleanas.
- Reporte de errores y advertencias claras con número de línea y columna.

---

## 🔎 Estrategia
Se implementó un **visitor** (`Semantico.java`) que:
- Mantiene una **tabla de símbolos** con nombre → tipo.
- Registra **variables inicializadas** para advertir usos antes de asignación.
- Valida operaciones según tipos:
  - `+` admite `int+int` y `String+String`.
  - `*`, `/`, `-` admiten solo `int`.
  - Comparadores `<,>,<=,>=` solo con `int`.
  - `==, !=` admiten `int` o `String`, pero siempre del mismo tipo.

---

## ⚠️ Ejemplos de errores
Entrada:
```remi
entero x;
x = "hola";
```

Salida:
```
[SEMÁNTICO] Línea 2, Col 1: no se puede asignar 'String' a 'int'. 
Sugerencia: ajusta el tipo del lado derecho o cambia el tipo de la variable.
```

Entrada:
```
cadena s;
si s + 2
   imprimir("ok");
fin
```

Salida:
```
[SEMÁNTICO] Línea 2, Col 4: '+' inválido entre String y int. 
Sugerencia: alinea los tipos o usa conversión a String si buscas concatenar.
[SEMÁNTICO] Línea 2, Col 1: la condición de 'si' debe ser booleana (recibido: int).
```

---

## ⚠️ Ejemplos de advertencias

Entrada:
```
entero y;
imprimir(y);
```

Salida:
```
[ADVERTENCIA] Línea 2, Col 10: la variable 'y' podría no estar inicializada. 
Sugerencia: asígnale un valor antes de leerla.
```

Entrada:
```
entero z;
z = 5 / 0;
```

Salida:
```
[ADVERTENCIA] Línea 2, Col 5: posible división entre cero. 
Sugerencia: valida el denominador antes de dividir.
```