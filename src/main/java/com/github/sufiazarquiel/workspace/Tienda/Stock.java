package com.github.sufiazarquiel.workspace.tienda;

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

    public Producto get(int codigoProducto) {
        for (Producto elemento : productos) {
            if (elemento.getCodigo() == codigoProducto) {
                return elemento;
            }
        }
        return null;
    }

    public ArrayList<Producto> productosAgotados() {
        ArrayList<Producto> agotados = new ArrayList<Producto>();
        for (Producto producto : productos) {
            if (producto.getCantidad() == 0) {
                agotados.add(producto);
            }
        }
        return agotados;
    }

    public ArrayList<Producto> productosBajoMinimos() {
        ArrayList<Producto> bajos = new ArrayList<Producto>();
        for (Producto producto : productos) {
            if (producto.getCantidad() <= producto.getMinimo() && producto.getCantidad() > 0) {
                bajos.add(producto);
            }
        }
        return bajos;
    }

    @Override
    public String toString() {
        return "Stock [productos=" + productos + "]";
    }
}
