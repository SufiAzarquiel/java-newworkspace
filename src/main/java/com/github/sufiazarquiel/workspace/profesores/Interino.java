package com.github.sufiazarquiel.workspace.profesores;

import java.util.Date;

public class Interino extends Profesor {
    // Attributes
    private Date fechaInicio;
    private Date fechaFin;

    // Constructors
    public Interino() {
        super();
        this.fechaInicio = null;
        this.fechaFin = null;
    }

    public Interino(String DNI, String nombre, Departamento departamento, Date fechaInicio) {
        super(DNI, nombre, departamento);
        this.fechaInicio = fechaInicio;
        this.fechaFin = null;
    }

    // Getters and setters
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Methods
    @Override
    public String toString() {
        return "Interino [DNI=" + DNI + ", departamento=" + departamento + ", fechaFin=" + fechaFin + ", fechaInicio="
                + fechaInicio + ", nombre=" + nombre + "]";
    }
}
