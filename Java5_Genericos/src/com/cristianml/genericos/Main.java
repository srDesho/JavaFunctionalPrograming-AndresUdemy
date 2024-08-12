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

        // Ejemplo sin uso de genéricos:
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

        // Ejemplo para comodines
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        // Vemos que no podemos imprimir objetos hijos y para esto son necesarios los comodines.
        // No se puede imprimir porque una Lista de una clase hija no es hija de una lista de una clase padre.
        // Para poder imprimir debemos agregar el comodín que es representado por un signo "?"
        // De la siguiente manera: public static void imprimirClientes(List<? extends Cliente> c)
        imprimirClientes(clientePremiumList);

        // Ejemplo para el método que calcula el mayor de 3 objetos
        System.out.println("Máximo de 5, 4 y 10 es: " + maximo(5,4,10));
        System.out.println("Máximo de 8.5, 2.4 y 3.8 es: " + maximo(8.5,2.4,3.8));
        System.out.println("Máximo de Mariana, Camila y Zamira es: " + maximo(
                "Mariana" , "Camila", "Zamira"
        ));
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

    // Comodines(Wildcards) sólo se pueden utilizar en listas
    // Para agregar el comodín lo hacemos de la siguiente manera: (List<? extends Cliente> c)
    public static void imprimirClientes(List<? extends Cliente> c) {
        c.forEach(System.out::println);
    }

    // Método para calcular el mayor de 3 objetos haciendo uso de la interfaz Comparable
    // la palabra reservada extends no es solo para definir clases hijas, sino que también se puede hacer uso
    // haciendo referencias que se va a extender de una Interfaz como Comparable.
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}