package com.github.sufiazarquiel.workspace;

import com.github.sufiazarquiel.workspace.Tienda.*;

public class Run {
    public static void main(String[] args) {
        Producto manzana = new Producto(1, "Manzana", 10.0f, 17, 5);
        Producto pera = new Producto(2, "Pera", 5.0f, 2, 1);
        Producto naranja = new Producto(3, "Naranja", 7.0f, 15, 4);

        Stock stock = new Stock();
        Factura factura = new Factura();

        stock.añadir(manzana);
        stock.añadir(pera);
        stock.añadir(naranja);

        // Buy 5 apples, 1 pear and 2 oranges
        System.out.println("Comprando 5 manzanas, 1 pera y 2 naranjas...");
        LineaFactura lineaFactura = new LineaFactura(1, manzana, 12, manzana.getPrecio());
        factura.addLineaFactura(lineaFactura);
        lineaFactura = new LineaFactura(2, pera, 2, pera.getPrecio());
        factura.addLineaFactura(lineaFactura);
        lineaFactura = new LineaFactura(3, naranja, 2, naranja.getPrecio());
        factura.addLineaFactura(lineaFactura);
        System.out.println(factura);

        // Print out of stock and low stock products
        stock.productosAgotados(); // Expected: Out of stock: Manzana
        stock.productosBajoMinimos(); // Expected: Bajo mínimos: Pera
    }

    public int getValue() {
        return 0;
    }
}
