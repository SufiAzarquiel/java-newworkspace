package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Dormitorio extends Estancia {
    // Attributes
    private int numeroCamas;

    // Constructors
    public Dormitorio() {
        super();
        this.numeroCamas = 0;
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
        return "Dormitorio [numeroCamas=" + numeroCamas + super.toString() + "]";
    }
}
