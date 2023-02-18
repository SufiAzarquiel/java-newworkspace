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
    public void añadir(Producto producto) {
        productos.add(producto);
    }

    public void borrar(Producto producto) {
        productos.remove(producto);
    }

    public int buscar(Producto producto) {
        return productos.indexOf(producto);
    }

    public Producto buscar(int index) {
        return productos.get(index);
    }

    public void productosAgotados() {
        for (Producto elemento : productos) {
            if (elemento.getCantidad() == 0) {
                System.out.println("Out of stock: " + elemento.getDescripcion());
            }
        }
    }

    public void productosBajoMinimos() {
        for (Producto elemento : productos) {
            if (elemento.getCantidad() <= elemento.getMinimo() && elemento.getCantidad() > 0) {
                System.out.println("Bajo mínimos: " + elemento.getDescripcion());
            }
        }
    }

    @Override
    public String toString() {
        return "Stock [productos=" + productos + "]";
    }
}
