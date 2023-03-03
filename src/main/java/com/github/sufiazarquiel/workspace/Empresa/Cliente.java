package com.github.sufiazarquiel.workspace.empresa;

public class Cliente extends Persona {
    // Attributes
    private int numeroSocio;

    // Constructor
    public Cliente(String nombre, String DNI, int edad, int numeroSocio) {
        super(nombre, DNI, edad);
        this.numeroSocio = numeroSocio;
    }

    // Methods
    public int getNumeroSocio() {
        return numeroSocio;
    }

    @Override
    public String toString() {
        return "Cliente [numeroSocio=" + numeroSocio + ", nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "]";
    }
}
