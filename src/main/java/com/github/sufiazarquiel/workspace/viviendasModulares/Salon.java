package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Salon extends Estancia {
    // Constructors
    public Salon() {
        super();
    }

    public Salon(int metrosCuadrados, int numeroVentanas, int precio) {
        super(metrosCuadrados, numeroVentanas, precio);
    }

    // Methods
    @Override
    public String toString() {
        return "\nSalon [" + super.toString();
    }
}
