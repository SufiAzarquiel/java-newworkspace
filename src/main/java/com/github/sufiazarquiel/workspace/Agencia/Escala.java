package com.github.sufiazarquiel.workspace.agencia;

import java.util.Date;

public abstract class Escala {
    // Attributes
    protected String ciudad;
    protected Date bajada;
    protected Date regreso;
    
    // Constructor
    public Escala(String ciudad, Date bajada, Date regreso) {
        this.ciudad = ciudad;
        this.bajada = bajada;
        this.regreso = regreso;
    }

    // Getters
    public String getCiudad() {
        return ciudad;
    }

    public Date getBajada() {
        return bajada;
    }

    public Date getRegreso() {
        return regreso;
    }

    // Setters
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setBajada(Date bajada) {
        this.bajada = bajada;
    }

    public void setRegreso(Date regreso) {
        this.regreso = regreso;
    }

    // Methods
    @Override
    public String toString() {
        return "escala \nciudad: " + ciudad + ", bajada: " + bajada + ", regreso: " + regreso + "\n";
    }
}
