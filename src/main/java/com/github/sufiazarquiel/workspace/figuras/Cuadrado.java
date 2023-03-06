package com.github.sufiazarquiel.workspace.figuras;

public class Cuadrado extends Figura {
    // Attributes
    protected double lado;

    // Constructors
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Getters and setters
    public double getLado() {
        return lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Methods
    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + ", color=" + color + "]";
    }
}
