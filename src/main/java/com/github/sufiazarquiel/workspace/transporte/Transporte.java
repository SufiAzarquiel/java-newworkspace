package com.github.sufiazarquiel.workspace.transporte;

public abstract class Transporte {
    // Attributes
    protected String descripcion;
    protected int numeroHoras;

    // Constructors
    public Transporte(String descripcion, int numeroHoras) {
        this.descripcion = descripcion;
        this.numeroHoras = numeroHoras;
    }

    // Getters and setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    // Methods
    @Override
    public String toString() {
        return ", descripcion=" + descripcion + ", numeroHoras=" + numeroHoras;
    }
}
