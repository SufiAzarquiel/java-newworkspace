package com.github.sufiazarquiel.workspace.examen;

public abstract class Persona {
    // Atributos
    protected String nombre;
    protected String apellido;
    protected String dni;

    // Constructor
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    // toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni;
    }
}
