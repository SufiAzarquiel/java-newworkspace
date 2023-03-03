package com.github.sufiazarquiel.workspace.restaurante;

public class Postre extends Plato {
    // Attributes
    protected boolean azucar;

    // Constructor
    public Postre(String nombre, double precio, boolean azucar) {
        super(nombre, precio);
        this.azucar = azucar;
    }

    // Getters
    public boolean tieneAzucar() {
        return azucar;
    }

    // Setters
    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }

    // Methods
    @Override
    public String toString() {
        return "postre \n" + super.toString() + "azucar: " + azucar + "\n";
    }
}
