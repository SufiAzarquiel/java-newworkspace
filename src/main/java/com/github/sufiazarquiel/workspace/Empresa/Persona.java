package com.github.sufiazarquiel.workspace.empresa;

public class Persona {
    // Attributes
    protected String nombre;
    protected String DNI;
    protected int edad;

    // Constructor
    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    // Methods
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "]";
    }
}
