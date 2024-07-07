package com.cristianml.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {

    // ¿Qué es una expresión lambda?
    // Es implementar un método sin necesidad de implementar una clase. Es una función anónima o método al vuelo.
    public static void main(String[] args) {

        // Vamos a empezar con nuestra primera expresión lambda que será un consumer.
        // Consumer es una expresión lambda que nos permite pasar por argumento un solo parámetro del tipo del genérico.
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        // Para usarla hacemos lo siguiente:
        consumidor.accept(new Date());
        // Por defecto un consumer solo acepta un argumento en el método y no devuelve, pero también podemos tener un
        // consumer con 2 argumentos que se le conoce como BiConsumer
        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años.");
        };

        biConsumer.accept("Cristian", 25);
    }
}