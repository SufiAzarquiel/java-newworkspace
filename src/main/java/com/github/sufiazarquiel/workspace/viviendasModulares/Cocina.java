package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Cocina extends Estancia {
    // Attributes
    private int numeroElectrodomesticos;

    // Constructors
    public Cocina() {
        super();
        this.numeroElectrodomesticos = 0;
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
        return "cocina [numeroElectrodomesticos=" + numeroElectrodomesticos + super.toString() + "]";
    }
}
