package com.github.sufiazarquiel.workspace.examen;

public class Estudiante extends Persona {
    // Atributos
    private int curso;

    // Constructor
    public Estudiante(String nombre, String apellido, String dni, int curso) {
        super(nombre, apellido, dni);
        this.curso = curso;
    }

    // Getters y Setters
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    // toString
    @Override
    public String toString() {
        // Pongo el nombre solo en el toString de las clases hijas
        return "\nAlumno: curso=" + curso + ", " + super.toString();
    }
}
