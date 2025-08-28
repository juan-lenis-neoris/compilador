# 🧪 Manual de Pruebas – Compilador Remilang

---

## 🎯 Objetivo
**-** Validar el correcto funcionamiento del compilador en todas sus fases:  
   léxico, sintaxis, semántica y generación de código.  
**-** Contar con un conjunto de programas de ejemplo que permitan reproducir
   errores y verificar que se reportan con mensajes amigables.  

---

## 📂 Organización de pruebas
**-** `examples/ok/` → Programas válidos que deben compilar y ejecutarse correctamente.  
**-** `examples/error/` → Programas con errores sintácticos o semánticos.  
**-** `examples/mixed/` → Programas que generan advertencias pero siguen funcionando.  

---

## ✅ Casos correctos
Ejemplo: `examples/ok/demo1.remi`
```remi
entero x;
cadena msg = "hola";
x = 5 + 3 * 2;
imprimir(x);
si x > 5
    imprimir("mayor");
sino
    imprimir("no mayor");
fin
```

Resultado esperado:
- Se genera `JuanOut.java`.
- Al ejecutarse imprime:
```
11
mayor
```
---

## ❌ Casos de error sintáctico
Ejemplo: `examples/error/sintaxis.remi`
```remi
entero x
imprimir(x)
```

Resultado esperado:
- Error de sintaxis: falta de `;`.
- Mensaje en consola:
```
Error de sintaxis en línea 1:9 -> mismatched input 'imprimir' expecting ';'
```