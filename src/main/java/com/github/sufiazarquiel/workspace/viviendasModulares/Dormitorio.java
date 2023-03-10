package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Dormitorio extends Estancia {
    // Attributes
    private int numeroCamas;

    // Constructors
    public Dormitorio() {
        super();
        this.numeroCamas = 0;
    }

    public Dormitorio(int metrosCuadrados, int numeroVentanas, int precio, int numeroCamas) {
        super(metrosCuadrados, numeroVentanas, precio);
        this.numeroCamas = numeroCamas;
    }

    // Getters and setters
    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    // Methods
    @Override
    public String toString() {
        return "\nDormitorio [numeroCamas=" + numeroCamas + ", " + super.toString() + "]";
    }
}
