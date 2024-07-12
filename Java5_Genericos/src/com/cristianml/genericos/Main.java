package com.cristianml.genericos;

import com.cristianml.genericos.model.Cliente;
import com.cristianml.genericos.model.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // Definición: Los genéricos permiten definir clases, interfaces y métodos con tipos de datos parametrizados.
        // Uso de Parámetros de Tipo: Se utilizan parámetros de tipo (como <T>, <E>, <K, V>) en lugar de tipos concretos.

        // Beneficios:
        // Seguridad de Tipos: Previenen errores de tipo en tiempo de compilación, reduciendo la necesidad de casting.
        // Reusabilidad: Permiten escribir código más general y reutilizable.
        // Legibilidad y Mantenimiento: Hacen que el código sea más claro y fácil de mantener.

        // Ejemplo si uso de genéricos:
        /*List clientes = new ArrayList();
        clientes.add(new Cliente("Cristian", "Montaño"));

        Cliente cristian = (Cliente) clientes.get(0);
        Cliente cristianIterator = (Cliente) clientes.iterator().next();*/

        // Usando genéricos.
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Cristian", "Montaño"));
        // No hay necesidad de castear
        Cliente cristian = clientes.get(0);

        Cliente[] clientesArreglo = {new Cliente("Cristian", "Montaño"),
                new Cliente("Cristian", "Montaño")};

        Integer[] enterosArreglo = {1, 2, 3};

        // Convertimos a list
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        // Iteramos
        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        // Hacemos uso de nuestro método fromArrayList con sobrecarga, o sea el que recibe 2 argumentos.
        List<String> nombres = fromArrayToList(new String[]{"Cristian", "Daniel", "Hector","Juan",
                "Pepe"}, enterosArreglo); // El segundo argumento es el que solo se va a imprimir en pantalla.

        nombres.forEach(System.out::println);

        // Creamos otra lista pero con el model ClientePremium
        List<ClientePremium> clientePremiumList = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Mario", "Arce"),
                new ClientePremium("Pedro", "Pérez"),
                new ClientePremium("Mariano", "Molina")
        });
        clientePremiumList.forEach(System.out::println);
    }
    // Con los genéricos podemos hacer que los argumentos sean de cualquier tipo en una función
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Hacemos una sobrecarga para hacer una limitación de tipo de dato para el genérico, en este caso solo vamos a
    // permitir que sea de tipo numérico, extendemos de la clase abstracta Number.
    public static <T extends Number> List<T>fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Ejemplo con otra sobrecarga donde permitiremos solo objetos Cliente.
    /*public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }*/

    // También podemos ser mucho más específicos con el límite, o sea limitar mucho más, esto podemos hacerlo
    // implementando interfaces como el siguiente ejemplo, lo hacemos con un ampersand(&)
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Podemos tener muchos más parámetros en nuestros métodos genéricos.
    // Por convención debemos usar letras mayúsculas para los genéricos.
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        // El tipo G va a ser solo para imprimir en consola y lo que vamos a retornar será una lista de tipo T.
        for(G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}