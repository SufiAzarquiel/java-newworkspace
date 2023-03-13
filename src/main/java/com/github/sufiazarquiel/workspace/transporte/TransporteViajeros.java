package com.github.sufiazarquiel.workspace.transporte;

public class TransporteViajeros extends Transporte {
    // Attributes
    private int personasTransportadas;

    // Constructors
    public TransporteViajeros(String descripcion, int numeroHoras, int personasTransportadas) {
        super(descripcion, numeroHoras);
        this.personasTransportadas = personasTransportadas;
    }

    // Getters and setters
    public int getPersonasTransportadas() {
        return personasTransportadas;
    }

    public void setPersonasTransportadas(int personasTransportadas) {
        this.personasTransportadas = personasTransportadas;
    }

    // Methods
    @Override
    public String toString() {
        return "\nTransporteViajeros [personasTransportadas=" + personasTransportadas + super.toString()
                + "]";
    }
}
