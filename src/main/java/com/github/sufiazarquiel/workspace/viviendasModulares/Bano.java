package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Bano extends Estancia {
    // Attributes
    private boolean tieneDucha;

    // Constructors
    public Bano() {
        super();
        this.tieneDucha = false;
    }

    public Bano(int metrosCuadrados, int numeroVentanas, int precio, boolean tieneDucha) {
        super(metrosCuadrados, numeroVentanas, precio);
        this.tieneDucha = tieneDucha;
    }

    // Getters and setters
    public boolean isTieneDucha() {
        return tieneDucha;
    }

    public void setTieneDucha(boolean tieneDucha) {
        this.tieneDucha = tieneDucha;
    }

    // Methods
    @Override
    public String toString() {
        return "\nBano [tieneDucha=" + tieneDucha + ", " + super.toString() + "]";
    }
}
