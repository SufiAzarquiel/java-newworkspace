package com.github.sufiazarquiel.workspace.tryexcept.amigos;

public class Amigo {
    // Attributes
    private String nombre;
    private String apodo;

    // Constructors
    public Amigo() {
    }

    public Amigo(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    // Methods
    @Override
    public String toString() {
        return "Amigo [apodo=" + apodo + ", nombre=" + nombre + "]";
    }
}
