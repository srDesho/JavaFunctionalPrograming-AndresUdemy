package com.cristianml.java8.lambda;

import com.cristianml.java8.lambda.models.UsuarioModel;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {

    // ¿Qué es una expresión lambda?
    // Es implementar un método sin necesidad de implementar una clase. Es una función anónima o método al vuelo.
    public static void main(String[] args) {

        // Vamos a empezar con nuestra primera expresión lambda que será un Consumer.
        // Consumer es una expresión lambda que nos permite pasar por argumento un solo parámetro del tipo del genérico,
        // un consumer no devuelve nada, solo ejecuta un código de hace procedimiento.
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

        // Uso de referencia de método
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hello Everyone.");

        // Estos consumer se utilizan mucho en el Api Stream de Java esta api usa mucho el Consumer, BiConsumer,
        // Supplier, Predicate, Function, BiFunction,
        // también en el forEach, ejemplo donde vamos a imprimir cada nombre de una lista con nuestra función lanbda:
        List<String> nombres = Arrays.asList("Melsi", "Daniel", "Godoy", "Calebsin");
        nombres.forEach(consumidor2);


        // Ejemplo de un BiConsumer con método de referencia
        UsuarioModel usuario = new UsuarioModel();
        // Esto es normal
        /*BiConsumer<UsuarioModel, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        };*/

        // Con método de referencia
        // Asumimos el primer parámetro como la clase principal la cual llama al método que tiene definido y asignamos
        // el segundo argumento como parámetro para el método de la clase UsuarioModel.
        BiConsumer<UsuarioModel, String> asignarNombre = UsuarioModel::setNombre;

        asignarNombre.accept(usuario, "Diogo");
        System.out.println("Nombre de usuario: " + usuario.getNombre());
    }
}