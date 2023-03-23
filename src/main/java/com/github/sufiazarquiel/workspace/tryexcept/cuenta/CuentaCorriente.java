package com.github.sufiazarquiel.workspace.tryexcept.cuenta;

public class CuentaCorriente {
    // Attributes
    String numeroCuenta;
    String titular;
    float saldo;

    // Constructor
    public CuentaCorriente(String numeroCuenta, String titular, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Methods
    public void ingresar(float cantidad) {
        saldo += cantidad;
    }

    public void reintegro(float cantidad) throws SaldoInsuficienteException {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente, busca curro xd");
        }
    }

    // Main method
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("123456789", "Sufi", 1000);
        cuenta.ingresar(500);
        try {
            cuenta.reintegro(2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}