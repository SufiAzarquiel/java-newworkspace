package com.github.sufiazarquiel.workspace.restaurante;

public abstract class Plato {
    // Attributes
    protected String nombre;
    protected double precio;

    // Constructor
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Methods
    @Override
    public String toString() {
        return "plato \nnombre: " + nombre + ", precio: " + precio + "\n";
    }
}
