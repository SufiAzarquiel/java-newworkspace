package com.github.sufiazarquiel.workspace.contador;

public class ContadorLetras implements Contador {
    // Attributes
    protected char valor;

    // Constructors
    public ContadorLetras() {
        this.valor = 'A';
    }

    public ContadorLetras(char valor) {
        this.valor = valor;
    }

    // Getters and Setters
    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    // Methods
    @Override
    public String toString() {
        return "ContadorLetras [valor=" + valor + "]";
    }

    @Override
    public void incrementar() {
        if (this.valor == 'Z') {
            this.valor = 'A';
        } else {
            this.valor++;
        }
    }

    @Override
    public void decrementar() {
        if (this.valor == 'A') {
            this.valor = 'Z';
        } else {
            this.valor--;
        }
    }

    @Override
    public void reset() {
        this.valor = 'A';
    }
}
