package com.cristianml.java8.lambda.aritmetica;

@FunctionalInterface // Esto es sólo para indicar que es una expresión lambda, si queremos no lo ponemos
public interface Aritmetica {

    // Definimos un método abstracto que sea de operación, podríamos tener más métodos pero solamente defaults o
    // estáticos y debemos tener uno sólo abstracto que es el siguiente:
    double operacion(double a, double b); // también pueden ser enteros.

}
