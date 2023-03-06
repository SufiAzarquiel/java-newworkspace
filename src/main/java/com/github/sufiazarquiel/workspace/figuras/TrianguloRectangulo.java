package com.github.sufiazarquiel.workspace.figuras;

public class TrianguloRectangulo extends Figura {
    // Attributes
    protected double base;
    protected double altura;

    // Constructors
    public TrianguloRectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    // Methods
    @Override
    public String toString() {
        return "TrianguloRectangulo [base=" + base + ", altura=" + altura + ", color=" + color + "]";
    }
}
