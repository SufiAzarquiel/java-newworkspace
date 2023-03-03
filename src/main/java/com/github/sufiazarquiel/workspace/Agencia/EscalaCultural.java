package com.github.sufiazarquiel.workspace.agencia;

import java.util.Date;

public class EscalaCultural extends Escala {
    // Attributes
    protected int precioGuia;

    // Constructor
    public EscalaCultural(String ciudad, Date bajada, Date regreso, int precioGuia) {
        super(ciudad, bajada, regreso);
        this.precioGuia = precioGuia;
    }

    // Getters
    public int getPrecioGuia() {
        return precioGuia;
    }

    // Setters
    public void setPrecioGuia(int precioGuia) {
        this.precioGuia = precioGuia;
    }

    // Methods
    @Override
    public String toString() {
        return "escala cultural \n" + super.toString() + "precioGuia: " + precioGuia + "\n";
    }
}
