package com.github.sufiazarquiel.workspace.contador;

public class ContadorDecimales implements Contador {
    // Attributes
    protected double valor;

    // Constructors
    public ContadorDecimales() {
        this.valor = 0;
    }

    public ContadorDecimales(double valor) {
        this.valor = valor;
    }

    // Getters and Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Methods
    @Override
    public String toString() {
        return "ContadorDecimales [valor=" + valor + "]";
    }

    @Override
    public void incrementar() {
        this.valor += 0.1;
    }

    @Override
    public void decrementar() {
        this.valor -= 0.1;
    }

    @Override
    public void reset() {
        this.valor = 0;
    }
}
