package com.cristianml.ejercicio_carrito_de_supermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos;
    private int productMax = 5;

    public BolsaSupermercado() {
        productos = new ArrayList<>();
    }

    // add products
    public void addProducto(T product) {
        if(this.productos.size() < productMax) {
            productos.add(product);
        } else {
            throw new RuntimeException("There is no more space.");
        }
    }

    // getProductList
    public List<T> getProductos() {
        return productos;
    }
}
