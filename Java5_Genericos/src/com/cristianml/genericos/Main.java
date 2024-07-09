package com.cristianml.genericos;

import com.cristianml.genericos.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }
    // Con los genéricos podemos hacer que los argumentos sean de cualquier tipo en una función
    public static <T> List<T> fromArrayToList(T[] c) {
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