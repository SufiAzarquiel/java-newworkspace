package com.github.sufiazarquiel.workspace.contador;

public class ContadorEntero implements Contador {
    // Attributes
    protected int valor;

    // Constructors
    public ContadorEntero() {
        this.valor = 0;
    }

    public ContadorEntero(int valor) {
        this.valor = valor;
    }

    // Getters and Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Methods
    @Override
    public String toString() {
        return "ContadorEntero [valor=" + valor + "]";
    }

    @Override
    public void incrementar() {
        this.valor++;
    }

    @Override
    public void decrementar() {
        this.valor--;
    }

    @Override
    public void reset() {
        this.valor = 0;
    }
}
