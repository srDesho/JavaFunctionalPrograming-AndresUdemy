package com.cristianml.java8.lambda;

import com.cristianml.java8.lambda.aritmetica.Aritmetica;
import com.cristianml.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(5, 15, suma));
        System.out.println(cal.computar(20, 15, resta));
        System.out.println(cal.computar(10, 5, (a, b) -> a * b));

        // Ejemplo con lambda existente, BiFunction
        System.out.println(cal.computarConBiFunction(5, 15, (a, b) -> a + b));
    }
}
