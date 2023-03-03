package com.github.sufiazarquiel.workspace.restaurante;

public class Primero extends Plato {
    // Attributes
    protected boolean paraCompartir;

    // Constructor
    public Primero(String nombre, double precio, boolean paraCompartir) {
        super(nombre, precio);
        this.paraCompartir = paraCompartir;
    }

    // Getters
    public boolean isParaCompartir() {
        return paraCompartir;
    }

    // Setters
    public void setParaCompartir(boolean paraCompartir) {
        this.paraCompartir = paraCompartir;
    }

    // Methods
    @Override
    public String toString() {
        return "primero \n" + super.toString() + "paraCompartir: " + paraCompartir + "\n";
    }
}
