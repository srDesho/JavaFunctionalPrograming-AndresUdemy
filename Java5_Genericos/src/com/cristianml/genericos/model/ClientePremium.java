package com.cristianml.genericos.model;

// Implementamos la interface Comparable para que cumpla el trato y así funcione en nuestro método concrétamente
// limitado fromArrayToList() que recibe genéricos con la interface Comparable
public class ClientePremium extends Cliente implements Comparable<ClientePremium>{

    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremium o) {
        return 0;
    }
}
