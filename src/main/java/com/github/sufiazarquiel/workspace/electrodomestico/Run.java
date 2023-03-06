package com.github.sufiazarquiel.workspace.electrodomestico;

import java.util.ArrayList;

import com.github.sufiazarquiel.workspace.electrodomestico.Electrodomestico.colores;

public class Run {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>(10);
        lista.add(new Electrodomestico(100, colores.ROJO, 'A', 10));
        lista.add(new Lavadora(200, colores.AZUL, 'B', 20, 10));
        lista.add(new Television(150, colores.NEGRO, 'C', 15, 20, true));
        lista.add(new Lavadora(125, colores.BLANCO, 'D', 25, 15));
        lista.add(new Television(175, colores.GRIS, 'E', 30, 30, false));
        lista.add(new Electrodomestico(300, colores.AZUL, 'F', 35));
        lista.add(new Lavadora(150, 30));
        lista.add(new Television(200, 40));
        lista.add(new Electrodomestico(250, 45));
        lista.add(new Lavadora(300, 50));

        float televisiones = 0;
        float lavadoras = 0;
        float electrodomesticos = 0;
        for (Electrodomestico electrodomestico : lista) {
            if (electrodomestico instanceof Television) {
                televisiones += ((Television) electrodomestico).precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                lavadoras += ((Lavadora) electrodomestico).precioFinal();
            } else {
                electrodomesticos += electrodomestico.precioFinal();
            }
        }
        electrodomesticos += televisiones + lavadoras;
        
        // Resultado
        System.out.println("Televisiones: " + televisiones);
        System.out.println("Lavadoras: " + lavadoras);
        System.out.println("Electrodomesticos: " + electrodomesticos);
    }
}
