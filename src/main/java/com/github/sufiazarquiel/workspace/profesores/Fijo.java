package com.github.sufiazarquiel.workspace.profesores;

import java.util.Date;

public class Fijo extends Profesor {
    // Attributes
    private Date fechaIncorporacion;
    private boolean jubilado;

    // Constructors
    public Fijo() {
        super();
        this.fechaIncorporacion = null;
        this.jubilado = false;
    }

    public Fijo(String DNI, String nombre, Departamento departamento, Date fechaIncorporacion, boolean jubilado) {
        super(DNI, nombre, departamento);
        this.fechaIncorporacion = fechaIncorporacion;
        this.jubilado = jubilado;
    }

    // Getters and setters
    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public boolean isJubilado() {
        return jubilado;
    }

    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    // Methods
    @Override
    public String toString() {
        return "Fijo [DNI=" + DNI + ", departamento=" + departamento + ", fechaIncorporacion=" + fechaIncorporacion
                + ", jubilado=" + jubilado + ", nombre=" + nombre + "]";
    }
}
