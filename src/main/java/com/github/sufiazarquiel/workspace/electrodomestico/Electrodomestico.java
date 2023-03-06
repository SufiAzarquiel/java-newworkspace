package com.github.sufiazarquiel.workspace.electrodomestico;

public class Electrodomestico {
    // Attributes
    protected float precioBase;
    protected colores color;
    protected char consumoEnergetico; // A, B, C, D, E, F
    protected float peso;
    protected enum colores {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }

    // Constructors
    public Electrodomestico() {
        this.color = colores.BLANCO;
        this.consumoEnergetico = 'F';
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(float precioBase, float peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(float precioBase, colores color, char consumoEnergetico, float peso) {
        this(precioBase, peso);
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }
    
    // Getters
    public float getPrecioBase() {
        return precioBase;
    }

    public colores getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    // Methods
    public boolean comprobarConsumoEnergetico(char letra) {
        return letra >= 'A' && letra <= 'F';
    }

    public boolean comprobarColor(colores color) {
        for (colores colorIterable : colores.values()) {
            if (color == colorIterable) {
                return true;
            }
        }
        return false;
    }

    public float precioFinal() {
        float precioFinal = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }
        if (this.peso >= 0 && this.peso < 19) {
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso < 49) {
            precioFinal += 50;
        } else if (this.peso >= 50 && this.peso < 79) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }
        return precioFinal;
    }
}