package com.github.sufiazarquiel.workspace.examen;

import java.util.Date;

public class Profesor extends Empleado {
    // Atributos
    public enum Departamento {
        LENGUAJES, MATEMATICAS, ARQUITECTURA, SISTEMAS
    }
    private Departamento departamento;

    // Constructor
    public Profesor(String nombre, String apellido, String dni, Date fechaIncorporacion, int numDespacho, Departamento departamento) {
        super(nombre, apellido, dni, fechaIncorporacion, numDespacho);
        this.departamento = departamento;
    }

    // Getters y Setters
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // toString
    @Override
    public String toString() {
        return "\nProfesor: departamento=" + departamento + ", " + super.toString();
    }
}
