package com.github.sufiazarquiel.workspace.viviendasModulares;

public abstract class Estancia {
    // Attributes
    protected int metrosCuadrados;
    protected int numeroVentanas;
    protected int precio;

    // Constructors
    public Estancia() {
        this.metrosCuadrados = 0;
        this.numeroVentanas = 0;
        this.precio = 0;
    }
    
    public Estancia(int metrosCuadrados, int numeroVentanas, int precio) {
        this.metrosCuadrados = metrosCuadrados;
        this.numeroVentanas = numeroVentanas;
        this.precio = precio;
    }

    // Getters and setters
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumeroVentanas() {
        return numeroVentanas;
    }

    public void setNumeroVentanas(int numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Methods
    @Override
    public String toString() {
        return "metrosCuadrados=" + metrosCuadrados + ", numeroVentanas=" + numeroVentanas + ", precio="
                + precio;
    }
}
