package com.github.sufiazarquiel.workspace.examen;

import java.util.Date;

public abstract class Empleado extends Persona {
    // Atributos
    protected Date fechaIncorporacion;
    protected int numDespacho;

    // Constructor
    public Empleado(String nombre, String apellido, String dni, Date fechaIncorporacion, int numDespacho) {
        super(nombre, apellido, dni);
        this.fechaIncorporacion = fechaIncorporacion;
        this.numDespacho = numDespacho;
    }

    // Getters y Setters
    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
 
    // toString
    @Override
    public String toString() {
        return "fechaIncorporacion=" + fechaIncorporacion + ", numDespacho=" + numDespacho + ", " + super.toString();
    }
}
