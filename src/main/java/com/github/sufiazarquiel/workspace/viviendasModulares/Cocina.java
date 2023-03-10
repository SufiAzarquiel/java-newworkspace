package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Cocina extends Estancia {
    // Attributes
    private int numeroElectrodomesticos;

    // Constructors
    public Cocina() {
        super();
        this.numeroElectrodomesticos = 0;
    }

    public Cocina(int metrosCuadrados, int numeroVentanas, int precio, int numeroElectrodomesticos) {
        super(metrosCuadrados, numeroVentanas, precio);
        this.numeroElectrodomesticos = numeroElectrodomesticos;
    }

    // Getters and setters
    public int getNumeroElectrodomesticos() {
        return numeroElectrodomesticos;
    }

    public void setNumeroElectrodomesticos(int numeroElectrodomesticos) {
        this.numeroElectrodomesticos = numeroElectrodomesticos;
    }

    // Methods
    @Override
    public String toString() {
        return "\ncocina [numeroElectrodomesticos=" + numeroElectrodomesticos+ ", " + super.toString() + "]";
    }
}
