package com.github.sufiazarquiel.workspace.Tienda;

import java.util.ArrayList;

public class Stock {
    // Attributes
    private ArrayList<Producto> productos;

    // Constructor
    public Stock() {
        this.productos = new ArrayList<Producto>();
    }

    // Methods
    public void addProduct(Producto producto) {
        productos.add(producto);
    }

    public void removeProduct(Producto producto) {
        productos.remove(producto);
    }

    public int searchProduct(Producto producto) {
        return productos.indexOf(producto);
    }

    public Producto searchProduct(int index) {
        return productos.get(index);
    }

    public void outOfStock() {
        for (Producto elemento : productos) {
            if (elemento.getCantidad() == 0) {
                System.out.println("Out of stock: " + elemento.getDescripcion());
            }
        }
    }

    public void underMinimum() {
        for (Producto elemento : productos) {
            if (elemento.getCantidad() <= elemento.getMinimo()) {
                System.out.println("Bajo mínimos: " + elemento.getDescripcion());
            }
        }
    }

    @Override
    public String toString() {
        return "Stock [productos=" + productos + "]";
    }
}
