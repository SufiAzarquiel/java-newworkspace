package com.github.sufiazarquiel.workspace.Empresa;

public class Empleado extends Staff {
    // Attributes
    // TODO: Add attributes

    // Constructor
    public Empleado(String nombre, String DNI, int edad, float sueldo) {
        super(nombre, DNI, edad, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado " + super.toString();
    }
}
