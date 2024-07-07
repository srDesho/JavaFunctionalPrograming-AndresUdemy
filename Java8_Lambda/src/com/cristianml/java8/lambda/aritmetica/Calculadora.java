package com.cristianml.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    // Esta clase es la que va a consumir nuestra expresión lambda propia
    public double computar(double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    // El método computar es parecido a la expresión lambda BiFunction, así que vamos a replicarla.
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}
