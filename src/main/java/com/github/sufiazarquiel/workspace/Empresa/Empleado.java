package com.github.sufiazarquiel.workspace.empresa;

public class Empleado extends Staff {
    // Constructor
    public Empleado(String nombre, String DNI, int edad, float sueldo) {
        super(nombre, DNI, edad, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado " + super.toString();
    }
}
