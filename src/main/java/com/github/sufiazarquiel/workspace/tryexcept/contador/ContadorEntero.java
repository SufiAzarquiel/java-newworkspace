package com.github.sufiazarquiel.workspace.tryexcept.contador;

public class ContadorEntero implements Contador {
    // Attributes
    private int valor;
    private int valorMaximo;
    private int valorMinimo;

    // Constructors
    public ContadorEntero() {
        this.valor = 0;
        this.valorMaximo = 100;
        this.valorMinimo = -100;
    }

    public ContadorEntero(int valor, int valorMaximo, int valorMinimo) {
        this.valor = valor;
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
    }

    // Getters and Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    // Methods
    @Override
    public String toString() {
        return "ContadorEntero [valor=" + valor + ", valorMaximo=" + valorMaximo + ", valorMinimo=" + valorMinimo + "]";
    }

    @Override
    public void incrementar() throws ValorMaximoContadorException {
        if (this.valor + 1 <= this.valorMaximo) {
            this.valor++;
        } else {
            throw new ValorMaximoContadorException("Valor máximo alcanzado");
        }
    }

    @Override
    public void decrementar() throws ValorMinimoContadorException {
        if (this.valor - 1 >= this.valorMinimo) {
            this.valor--;
        } else {
            throw new ValorMinimoContadorException("Valor mínimo alcanzado");
        }
    }

    @Override
    public void reset() {
        this.valor = 0;
    }

    // Main method
    public static void main(String[] args) {
        ContadorEntero contador = new ContadorEntero(0, 10, -10);
        try {
            for (int i = 0; i < 15; i++) {
                contador.incrementar();
            }
        } catch (ValorMaximoContadorException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(contador);
    }
}
