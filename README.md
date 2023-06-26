# Compiladores II - Proyecto MiniPascal 
- Catedratico: Ing. Roman Arturo Pineda. 
- Alumnos: Alejandro Davila, Julio David y Oscar Sanchez.

## Contenido
- Archivos generados para ANTLR4 con la gramática desarollada ya compilada.
- Implementacion de analisis semantico y sintactico.
- Codigo generado LLVM

## Ejecución de Gramática
- Se debe ubicar en la carpeta raiz del proyecto y posteriormente hacer uso de los siguientes comandos:

- Identificar el archivo que contiene las reglas gramaticales:
```bash
antlr4 MiniPascalGrammar.g4 
```

- Compilar la gramatica
```bash
javac MiniPascalGrammar*.java
```
- O su variante
```bash
compile MiniPascalGrammar*.java
```
- Ejecutar el entorno grafico del arbol generado:
```bash
grun MiniPascalGrammar program -gui {archivo_test}
```
## Comandos para ver detalles de la gramatica tanto visitores como AST grafico
- Analizar los visitores se realiza con el comando:
```bash
antlr4 MiniPascal.g4 -visitor -no-listener
```
- Compilamos nuevamente todos los recursos JAVA:
```bash
javac*.java
```
- Ejecutamos:
```bash
java MiniPascalCompiler [file_name]
```
- Para analizar el AST de manera grafica:
```bash
grun MiniPascal prog -gui [test_file] &
```
