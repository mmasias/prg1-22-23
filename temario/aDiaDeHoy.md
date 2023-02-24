# A día de hoy, deberíamos saber:

# Requisitos

- [Conceptos básicos de consola](../docs/conceptosDeConsola.md)

# Java et al...

## Identificar

- El compilador de Java (javac) / el intérprete de Java (java)

## Programación

### Base: HolaMundo.java

> Ver, en el campus virtual, dentro de la sección materiales de clase el documento ***0030 - Java.pdf*** (páginas 3 y 4), así como el documento ***0031 - Java Prácticas 1. SECUENCIALES.pdf*** (página 1)

- Crear el código fuente de un programa Java (a partir de la [**plantilla**](plantilla.md) indicada en clase)
- Guardarlo en una carpeta
- Compilarlo (**javac nombreClase.java**)
- Ejecutarlo (**java nombreClase**)
- Utilizar la salida en pantalla: **println()** y **print()**

#### Micro-retos

* Desarrolle los retos incluidos en [esta página](../retos/001-MicroRetosASCIIart.md).

### Variables

> Presentación: En el campus virtual, sección **Materiales de Clase**, subsección **Ingeniería Informática,  materiales específicos** / **Presentaciones**: **P1 - S01E03 - Variables.pdf**

- Concepto de variable
- Declaración de una variable: tipo & nombre
- Inicialización y asignación de valores a una variable
- Proceso de casting
- Tipos de datos primitivos y objeto String
- Operadores aritméticos

#### Micro-retos

* Desarrolle los retos incluidos en [esta página](../retos/002-MicroRetosVariables.md).

### Estructuras de control alternativas

- Concepto de bloque de código
- Teorema del programa estructurado
- Concepto de estructuras de control: estructuras de control alternativas
- if() / if() else / if() else if() else if() ... else
- Operadores relacionales y operadores lógicos
- Errores comunes

#### Micro-retos

* Desarrolle los retos incluidos en [esta página](../retos/003-MicroRetosIf.md).

### Estructuras de control repetitivas

- for(){} para la gestión de bloques de código dónde se conoce a priori el número de repeticiones
- while() y do...while(); para la gestión de bloques de código mediante estados
- Concepto iniciatico de estado de un sistema y su uso para gestionar bucles. [Ejemplo con el reto de adivina un número](codigo/EstructurasControl.java).

### Métodos estáticos

- Necesidad de uso de métodos estáticos y el concepto de responsabilidad.
- Paso de parámetros.
- Devolución (o no) de valores.
- Ámbito de variables: variables locales & variables globales.
- Reparto de responsabilidades I
- [Ejemplo usando como base el examen parcial](codigo/UnaCarreraMetodos.java), dividiendo el código mediante métodos estáticos, trasladando la responsabilidad a métodos, una responsabilidad por método.

### Matrices

- Necesidad del uso de matrices
- Inicialización de matrices
- Uso de matrices
    - [Ejemplo basado lejanamente en el reto de las cajas](./codigo/JuegosConMatrices.java)
- Reparto de responsabilidades II
    - [Ejemplo usando como base el examen parcial, incluyendo arrays para extender el número de jugadores](codigo/UnaCarreraMetodosArray.java)
    - [Adivina el número](/retos/soluciones/AdivinaNumero.java), versión con métodos estáticos (incluyendo la pista de frío, tibio y caliente).
- Matrices bidimensionales
    - Recorrido de una matriz
    - Concepto de parseo o traducción
    - [Ejemplo que aborda ambos conceptos](./codigo/JuegosConMatrices2D.java)
