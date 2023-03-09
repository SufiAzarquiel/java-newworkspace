package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Bano extends Estancia {
    // Attributes
    private boolean tieneDucha;

    // Constructors
    public Bano() {
        super();
        this.tieneDucha = false;
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
        return "Bano [tieneDucha=" + tieneDucha + super.toString() + "]";
    }
}
