package com.github.sufiazarquiel.workspace.transporte;

public class Conductor {
    // Attributes
    private String nombre;
    private String DNI;
    private Ficha ficha;

    // Constructors
    public Conductor(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.ficha = new Ficha();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    // Methods
    @Override
    public String toString() {
        return "Conductor [DNI=" + DNI + ", nombre=" + nombre
                + ", ficha=" + ficha + "]";
    }
}
