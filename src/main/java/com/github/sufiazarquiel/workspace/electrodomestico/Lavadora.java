package com.github.sufiazarquiel.workspace.electrodomestico;

public class Lavadora extends Electrodomestico {
    // Attributes
    protected int carga;
    private final int CARGA_DEFECTO = 5;

    // Constructors
    public Lavadora() {
        super();
        this.carga = CARGA_DEFECTO;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFECTO;
    }

    public Lavadora(float precioBase, colores color, char consumoEnergetico, float peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Getters
    public int getCarga() {
        return carga;
    }

    // Methods
    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
