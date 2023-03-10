package com.github.sufiazarquiel.workspace.viviendasModulares;

import java.util.ArrayList;

public class Vivienda {
    // Attributes
    private ArrayList<Estancia> estancias;

    // Constructors
    public Vivienda() {
        this.estancias = new ArrayList<Estancia>();
    }

    public Vivienda(Vivienda vivienda) {
        this.estancias = vivienda.getEstancias();
    }

    // Getters and setters
    public ArrayList<Estancia> getEstancias() {
        return estancias;
    }

    public void setEstancias(ArrayList<Estancia> estancias) {
        this.estancias = estancias;
    }

    // Methods
    public void addEstancia(Estancia estancia) {
        estancias.add(estancia);
    }

    public void removeEstancia(Estancia estancia) {
        estancias.remove(estancia);
    }

    public Estancia getEstancia(int index) {
        return estancias.get(index);
    }

    public String imprimirVivienda() {
        return "Vivienda [estancias=" + estancias + "]";
    }

    public int getNumeroCamas() {
        int numeroCamas = 0;
        for (Estancia estancia : estancias) {
            if (estancia instanceof Dormitorio) {
                numeroCamas += ((Dormitorio) estancia).getNumeroCamas();
            }
        }
        return numeroCamas;
    }

    public double costeTotal() {
        double costeTotal = 0;
        // Every window increases the price by 5%
        for (Estancia estancia : estancias) {
            costeTotal += estancia.getPrecio();
            costeTotal +=  estancia.getPrecio() * estancia.getNumeroVentanas() *  0.05;
        }

        return costeTotal;
    }
}