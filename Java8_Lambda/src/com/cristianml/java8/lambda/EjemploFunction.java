package com.cristianml.java8.lambda;

import java.util.function.BiFunction;
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

        // Ejemplo con referencia de método.
        // podemos hacer esto cuando sólo se recibe un parámetro.
        Function<String, String> funcion2 = String::toUpperCase;
        System.out.println(funcion2.apply("mayúscula"));

        // Ejemplo con BiFunction.
        // es igual que el Function solo que recibe 2 parámetros.
        BiFunction<String, String, String>  function3 = (a, b) -> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        String resultado2 = function3.apply("Monty", "Desho");
        System.out.println(resultado2);

        // Ejemplo cuando retorna un entero.
        // El compareTo retorna un entero, si es 0 quiere decir que son iguales y si es un nro distinto es que no son iguales.
        BiFunction<String, String, Integer> funcion4 = String::compareTo; // (a, b) -> a.compareTo(b);
        System.out.println(funcion4.apply("holap", "hola"));

        // Ejemplo con método concat
        BiFunction<String, String, String> funcion5 = String::concat; // (a, b) -> a.concat(b);
        System.out.println(funcion5.apply("Cristian", "Monty"));
    }

}
