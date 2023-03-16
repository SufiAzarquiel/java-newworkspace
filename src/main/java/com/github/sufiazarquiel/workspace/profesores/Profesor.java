package com.github.sufiazarquiel.workspace.profesores;

public abstract class Profesor {
    // Attributes
    protected String DNI;
    protected String nombre;
    protected enum Departamento {
        MATEMATICAS, INGLES, LENGUA, INFORMATICA, FILOSOFIA
    }
    protected Departamento departamento;

    // Constructors
    public Profesor() {
        this.DNI = "";
        this.nombre = "";
        this.departamento = null;
    }

    public Profesor(String DNI, String nombre, Departamento departamento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Getters and setters
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    // Methods
    public abstract String toString();
}
