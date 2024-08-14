package com.cristianml.clasesgenericas;

public class Main {
    public static void main(String[] args) {
        Camion<Animal> transAnimales = new Camion<>(5);

        transAnimales.add(new Animal("Peregrino", "Caballo"));
        transAnimales.add(new Animal("Tontin", "Caballo"));
        transAnimales.add(new Animal("Godoysin", "Caballo"));
        transAnimales.add(new Animal("Hercules", "Caballo"));
        transAnimales.add(new Animal("Tunquen", "Caballo"));

        // Iteramos e imprimimos nuestro camión
        imprimirElementos(transAnimales);

        // Camión de transporte de Maquinaria
        Camion<Maquinaria> transMaquinaria = new Camion<>(3);

        transMaquinaria.add(new Maquinaria("Bulldozer"));
        transMaquinaria.add(new Maquinaria("Grúa Horquilla"));
        transMaquinaria.add(new Maquinaria("Perforadora"));

        // Iteramos e imprimimos nuestro camión transMaquinaria
        imprimirElementos(transMaquinaria);

        // Camión de transporte de Automoviles
        Camion<Automovil> transAutomovil = new Camion<>(3);

        transAutomovil.add(new Automovil("Mazda"));
        transAutomovil.add(new Automovil("Toyota"));
        transAutomovil.add(new Automovil("Nissan"));

        // Iteramos e imprimimos nuestro camión transAutomoviles
        imprimirElementos(transAutomovil);
    }

    // Creamos nuestro método para imprimir los elementos de cada camión
    // Con el primer <T> definimos que nuestro parámetro será genérico.
    public static <T> void imprimirElementos(Camion<T> camion) {
        for (T a : camion) {
            if ( a instanceof Animal) {
                System.out.println(((Animal) a).getNombre() + " Tipo: " + ((Animal) a).getTipo());
            } else if ( a instanceof Maquinaria) {
                System.out.println("tipo de maquinaria: " + ((Maquinaria) a).getTipo());
            } else if (a instanceof Automovil) {
                System.out.println("Marca: " + ((Automovil) a).getMarca());
            }
        }
    }
}
