package com.cristianml.ejercicio_carrito_de_supermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productList;
    private int productMax = 5;

    public BolsaSupermercado() {
        productList = new ArrayList<>();
    }

    // add products
    public void addProduct(T product) {
        if(this.productList.size() < productMax) {
            productList.add(product);
        } else {
            throw new RuntimeException("There is no more space.");
        }
    }

    // getProductList
    public List<T> getProductList() {
        return productList;
    }
}
