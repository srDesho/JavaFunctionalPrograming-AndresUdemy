package com.cristianml.clasesgenericas;

public class Main {
    public static void main(String[] args) {
        Camion transAnimales = new Camion(5);

        transAnimales.add(new Animal("Peregrino", "Caballo"));
        transAnimales.add(new Animal("Tontin", "Caballo"));
        transAnimales.add(new Animal("Godoysin", "Caballo"));
        transAnimales.add(new Animal("Hercules", "Caballo"));
        transAnimales.add(new Animal("Tunquen", "Caballo"));

        // Iteramos e imprimimos nuestro camión
        for (Object o : transAnimales) {
            // Casteamos
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " Tipo: " + a.getTipo());
        }

        // Camión de transporte de Maquinaria
        Camion transMaquinaria = new Camion(3);

        transMaquinaria.add(new Maquinaria("Bulldozer"));
        transMaquinaria.add(new Maquinaria("Grúa Horquilla"));
        transMaquinaria.add(new Maquinaria("Perforadora"));

        // Iteramos e imprimimos nuestro camión transMaquinaria
        for (Object o : transMaquinaria) {
            // Casteamos
            Maquinaria m = (Maquinaria) o;
            System.out.println("tipo de maquinaria: " + m.getTipo());
        }

        // Camión de transporte de Automoviles
        Camion transAutomovil = new Camion(3);

        transAutomovil.add(new Automovil("Mazda"));
        transAutomovil.add(new Automovil("Toyota"));
        transAutomovil.add(new Automovil("Nissan"));

        // Iteramos e imprimimos nuestro camión transAutomoviles
        for (Object o : transAutomovil) {
            // Casteamos
            Automovil au = (Automovil) o;
            System.out.println("marca: " + au.getMarca());
        }
    }
}
