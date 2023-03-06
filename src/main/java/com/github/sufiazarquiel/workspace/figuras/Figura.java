package com.github.sufiazarquiel.workspace.figuras;

public abstract class Figura {
    // Attributes
    protected String color;

    // Constructors
    public Figura(String color) {
        this.color = color;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "figura [color=" + color + "]";
    }
}
