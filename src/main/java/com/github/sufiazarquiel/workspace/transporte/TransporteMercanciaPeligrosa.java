package com.github.sufiazarquiel.workspace.transporte;

public class TransporteMercanciaPeligrosa extends TransporteMercancia {
    // Constructors
    public TransporteMercanciaPeligrosa(String descripcion, int numeroHoras, int toneladas) {
        super(descripcion, numeroHoras, toneladas);
    }

    // Methods
    @Override
    public String toString() {
        return "\nTransporteMercanciaPeligrosa" + super.toString();
    }
}
