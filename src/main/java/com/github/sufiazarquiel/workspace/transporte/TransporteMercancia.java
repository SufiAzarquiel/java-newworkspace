package com.github.sufiazarquiel.workspace.transporte;

public class TransporteMercancia extends Transporte {
    // Attributes
    protected int toneladas;

    // Constructors
    public TransporteMercancia(String descripcion, int numeroHoras, int toneladas) {
        super(descripcion, numeroHoras);
        this.toneladas = toneladas;
    }

    // Getters and setters
    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    // Methods
    @Override
    public String toString() {
        return "\nTransporteMercancia [toneladas=" + toneladas + super.toString() + "]";
    }
}
