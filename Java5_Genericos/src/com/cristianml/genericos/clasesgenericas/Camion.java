package com.cristianml.genericos.clasesgenericas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable{

    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        // Instanciamos nuestra list
        objetos = new ArrayList();
    }

    // Método para agregar objetos a la lista
    public void add(Object objeto) {
        if(this.objetos.size() <= max) {
            objetos.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
