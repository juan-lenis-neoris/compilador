# 📘 README – Fase de Sintaxis

## 🎯 Objetivo
Definir una gramática robusta y optimizada que valide la **estructura del lenguaje Remilang**, generando un **AST claro**.

---

## 📄 Gramática utilizada
Archivo: `grammar/Juan.g4`

- Regla principal: `program : sentencia+ EOF`
- Soporte de:
  - Declaraciones (`entero x;`, `cadena s="hola";`)
  - Asignaciones (`x = 5 + 2;`)
  - Impresión (`imprimir(x);`)
  - Condicionales (`si ... sino ... fin`)
  - Bucles (`mientras ... fin`)
- Expresiones con precedencia:
  - `* /` > `+ -` > `comparadores`

---

## 🌳 Representación del AST
ANTLR genera automáticamente el árbol. Ejemplo:

Entrada:
```remi
entero x;
x = 5 + 3 * 2;
imprimir(x);

program
 ├── declararVariable: ENTERO x ;
 ├── asignarValor: x = (5 + (3 * 2)) ;
 └── imprimirValor: imprimir(x) ;
