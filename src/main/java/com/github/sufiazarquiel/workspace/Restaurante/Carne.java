package com.github.sufiazarquiel.workspace.restaurante;

public class Carne extends Plato {
    // Types of meat
    public enum gradoCoccion {
        POCO_HECHO, AL_PUNTO, MUY_HECHO, CARBONIZADO
    }

    // Attributes
    protected gradoCoccion grado;

    // Constructor
    public Carne(String nombre, double precio, gradoCoccion grado) {
        super(nombre, precio);
        this.grado = grado;
    }

    // Getters
    public gradoCoccion getGrado() {
        return grado;
    }

    // Setters
    public void setGrado(gradoCoccion grado) {
        this.grado = grado;
    }

    // Methods
    @Override
    public String toString() {
        return "carne \n" + super.toString() + "grado: " + grado + "\n";
    }
}
