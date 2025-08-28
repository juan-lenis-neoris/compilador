# ⚙️ Manual Técnico – Compilador Remilang

---

## 🎯 Objetivo
**-** Documentar las decisiones técnicas y la arquitectura del compilador implementado.  
**-** Servir como referencia para desarrolladores que quieran mantener o extender el proyecto.  

---

## 🏗️ Arquitectura del compilador
El compilador se organiza en **cuatro fases principales**:

**1. Léxico**  
**-** Definido en `grammar/Juan.g4` (tokens).  
**-** Implementación automática de `JuanLexer.java` mediante ANTLR.  

**2. Sintaxis**  
**-** Reglas sintácticas en `grammar/Juan.g4`.  
**-** Parser (`JuanParser.java`) y AST generado automáticamente.  
**-** Uso de `JuanBaseVisitor` para recorrer el árbol.  

**3. Semántica**  
**-** Implementada en `src/Semantico.java`.  
**-** Maneja tabla de símbolos, inicialización y validaciones de tipos.  
**-** Reporta errores con línea y columna + sugerencias.  

**4. Generación de código**  
**-** Implementada en `src/GeneradorCodigo.java`.  
**-** Traduce el AST a un archivo `out/JuanOut.java` (Java ejecutable).  
**-** Incluye optimizaciones simples (constant folding).  
**-** Helpers para comparación de cadenas (`eq`, `neq`).  

---

## 📂 Estructura de carpetas
**-** `grammar/` → gramática `.g4`  
**-** `gen/` → clases generadas por ANTLR  
**-** `src/` → código Java del compilador  
**-** `examples/` → ejemplos de entrada `.remi`  
**-** `out/` → código generado (`JuanOut.java`)  
**-** `docs/` → documentación y manuales  

---

## 🔧 Dependencias
**-** Java 17+  
**-** ANTLR 4.13.2 (incluido en `tools/`)  

---

## 🔄 Flujo de ejecución
**1.** ANTLR genera lexer/parser → `gen/`  
**2.** Se compila el compilador (`javac`)  
**3.** `MainJuan` ejecuta las fases en orden:  
   **-** Léxico  
   **-** Sintaxis  
   **-** Semántica  
   **-** Generación de código  
**4.** Se guarda `JuanOut.java` en `out/`  
**5.** Usuario compila y ejecuta con `javac` y `java`  

---

## 🚀 Posibles mejoras
**-** Soporte de más tipos (`decimal`, `booleano`)  
**-** Alcance de variables por bloque (scopes anidados)  
**-** Optimización intermedia (CFG, dead-code elimination)  
**-** Backend alternativo (ej. generación de Python)  
