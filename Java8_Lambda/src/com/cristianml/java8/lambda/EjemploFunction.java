package com.cristianml.java8.lambda;

import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        // Un function es una expresión que recibe un argumento como parámetro y también devuelve un valor.
        // Es como una combinación del Consumer que hace un procedimiento y el Supplier que sólo retorna algo sin
        // recibir argumentos.

        // El primer argumento es lo que recibe y el segundo es el tipo de dato que va a retornar,
        // pero podemos usar cualquier tipo de objetos.
        Function<String, String> funcion1 = param -> "Hola qué tal! " + param; // Esto está simplificado.
        String resultado = funcion1.apply("Cristian");
        System.out.println(resultado);

        // Ejemplo con referencia de método
        // podemos hacer esto cuando sólo se recibe un parámetro
        Function<String, String> funcion2 = String::toUpperCase;
        System.out.println(funcion2.apply("mayúscula"));
    }

}
