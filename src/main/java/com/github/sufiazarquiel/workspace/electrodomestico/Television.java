package com.github.sufiazarquiel.workspace.electrodomestico;

public class Television extends Electrodomestico {
    // Attributes
    protected float resolucion; // En pulgadas
    protected boolean smartTV;

    // Constructor
    public Television() {
        super();
        this.resolucion = 20;
        this.smartTV = false;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.smartTV = false;
    }

    public Television(float precioBase, colores color, char consumoEnergetico, float peso, float resolucion,
            boolean smartTV) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    // Getters
    public float getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    // Methods
    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal *= 1.30;
        }
        if (smartTV) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
