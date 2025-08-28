# 📘 Proyecto Final – Compilador Remilang

Este proyecto implementa un **compilador completo** para el lenguaje **Remilang** usando **ANTLR4 y Java**.  

Incluye todas las fases clásicas de un compilador:  
1. **Análisis léxico** → generación de tokens.  
2. **Análisis sintáctico** → validación de la estructura y construcción del AST.  
3. **Análisis semántico** → verificación de tipos, variables y operaciones.  
4. **Generación de código** → traducción a Java ejecutable.  

---

## 📂 Estructura del proyecto
- `grammar/` → gramática ANTLR (`Juan.g4`)  
- `src/` → código fuente del compilador (Main, Semántico, Generador de código)  
- `gen/` → clases generadas automáticamente por ANTLR  
- `out/` → código Java generado (`JuanOut.java`)  
- `examples/` → ejemplos de programas `.remi`  
- `docs/` → documentación de cada fase + manuales  

---

## 📖 Documentación detallada
- [📑 Tokens (léxico)](docs/TOKENS.md)  
- [📘 Sintaxis](docs/README-Sintaxis.md)  
- [📘 Semántica](docs/README-Semantica.md)  
- [📘 Generación de código](docs/README-Codegen.md)  
- [⚙️ Manual Técnico](docs/Manual-Tecnico.md)  
- [🧑‍💻 Manual de Usuario](docs/Manual-Usuario.md)  

---

## ▶️ Ejecución básica
1. **Generar lexer/parser**  
   ```bash
   java -cp "tools\antlr-4.13.2-complete.jar" org.antlr.v4.Tool -Dlanguage=Java -visitor -o gen grammar\Juan.g4
   ```
2. **Compilar clases generadas por ANTLR**  
   ```bash
   javac -encoding UTF-8 -cp "tools\antlr-4.13.2-complete.jar" -d gen gen\grammar\*.java
   ```
1. **Compilar el modo léxico (NUEVO)**  
   ```bash
   javac -encoding UTF-8 -cp "tools\antlr-4.13.2-complete.jar;gen" -d gen src\Lexico.java
   ```
1. **Compilar tus clases (semántico + generador + main)**  
   ```bash
   javac -encoding UTF-8 -cp "tools\antlr-4.13.2-complete.jar;gen" -d gen src\GeneradorCodigo.java src\Semantico.java src\MainJuan.java
   ```
1. **Ejecutar modo léxico (NUEVO) — lista tokens**  
   ```bash
   java -cp "tools\antlr-4.13.2-complete.jar;gen" Lexico examples\juanExample.remi
   ```
1. **Ejecutar pipeline normal (genera out\JuanOut.java)**  
   ```bash
   java -cp "tools\antlr-4.13.2-complete.jar;gen" MainJuan examples\juanExample.remi
   ```
1. **Compilar el Java generado**  
   ```bash
   javac -encoding UTF-8 -d out out\JuanOut.java
   ```
1. **Ejecutar el Java generado**  
   ```bash
   java -cp out JuanOut
   ```
