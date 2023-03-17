package com.github.sufiazarquiel.workspace.examen;

import java.util.Date;

public class PersonalDeServicio extends Empleado {
    // Atributos
    private String seccion;

    // Constructor
    public PersonalDeServicio(String nombre, String apellido, String dni, Date fechaIncorporacion, int numDespacho, String seccion) {
        super(nombre, apellido, dni, fechaIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    // Getters y Setters
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    // toString
    @Override
    public String toString() {
        return "\nPersonalDeServicio: seccion=" + seccion + ", " + super.toString();
    }
}
