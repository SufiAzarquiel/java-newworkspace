package com.github.sufiazarquiel.workspace.empresa;

public class Staff extends Persona {
    // Attributes
    protected float sueldo;

    // Constructor
    public Staff(String nombre, String DNI, int edad, float sueldo) {
        super(nombre, DNI, edad);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "[sueldo=" + sueldo + ", nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "]";
    }
}
