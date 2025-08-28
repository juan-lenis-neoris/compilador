grammar Juan;

// -------------------------
// Reglas de PARSER
// -------------------------

program
    : sentencia+ EOF
    ;

sentencia
    : declararVariable PUNTOYCOMA
    | asignarValor    PUNTOYCOMA
    | imprimirValor   PUNTOYCOMA
    | condicional
    | bucle
    ;

declararVariable
    : tipoVariable ID (IGUAL expresion)?
    ;

asignarValor
    : ID IGUAL expresion
    ;

imprimirValor
    : IMPRIMIR PAREN_IZQ expresion PAREN_DER
    ;

condicional
    : SI expresion bloque (SINO bloque)? FIN
    ;

bucle
    : MIENTRAS expresion bloque FIN
    ;

bloque
    : sentencia*
    ;

// Precedencia: comparaciones < suma/resta < mult/div
expresion
    // Comparaciones
    : expresion op=(MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL | IGUALDAD | DIFERENTE) expresion  #comparacionOp
    // Suma / Resta
    | expresion op=(SUMAR | RESTAR) expresion                                                    #sumaOp
    // Multiplicación / División
    | expresion op=(MULTIPLICAR | DIVIDIR) expresion                                             #multiplicacionOp
    // Paréntesis
    | PAREN_IZQ expresion PAREN_DER                                                              #expresionParentesis
    // Literales e identificadores
    | literal                                                                                    #expresionLiteral
    | ID                                                                                         #idExpresion
    ;

literal
    : INT
    | STRING
    ;

tipoVariable
    : ENTERO
    | CADENA
    ;

// -------------------------
// Reglas de LEXER (tokens)
// -------------------------

// Palabras clave (si quieres que en consola aparezca "CONDICIONAL" en vez de "SI",
// puedes mapearlo al imprimir; mantener "SI"/"SINO" evita romper el parser/semántico)
SI        : 'si' ;
SINO      : 'sino' ;
IMPRIMIR  : 'imprimir' ;
MIENTRAS  : 'mientras' ;
FIN       : 'fin' ;

// Tipos (ver nota arriba para mostrar "TIPO" en consola)
ENTERO    : 'entero' ;
CADENA    : 'cadena' ;

// Operadores aritméticos
SUMAR         : '+' ;
RESTAR        : '-' ;
MULTIPLICAR   : '*' ;
DIVIDIR       : '/' ;

// Operadores de comparación
MENOR         : '<' ;
MAYOR         : '>' ;
MENOR_IGUAL   : '<=' ;
MAYOR_IGUAL   : '>=' ;
IGUALDAD      : '==' ;
DIFERENTE     : '!=' ;

// Asignación
IGUAL         : '=' ;

// Paréntesis y separadores
PAREN_IZQ     : '(' ;
PAREN_DER     : ')' ;
PUNTOYCOMA    : ';' ;

// Identificadores y literales
ID        : [a-zA-Z_][a-zA-Z_0-9]* ;
INT       : [0-9]+ ;
STRING    : '"' ( '\\"' | ~["\r\n] )* '"' ;

// Espacios y comentarios
WS        : [ \t\r\n]+      -> skip ;
COMMENT   : '#' ~[\r\n]*    -> skip ;
