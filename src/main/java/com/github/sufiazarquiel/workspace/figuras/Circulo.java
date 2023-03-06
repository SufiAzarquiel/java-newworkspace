package com.github.sufiazarquiel.workspace.figuras;

public class Circulo extends Figura {
    // Attributes
    protected double radio;

    // Constructors
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Getters and setters
    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Methods
    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + "]";
    }
}
