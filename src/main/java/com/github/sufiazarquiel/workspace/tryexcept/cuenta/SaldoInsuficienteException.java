package com.github.sufiazarquiel.workspace.tryexcept.cuenta;

public class SaldoInsuficienteException extends Exception {
    // Constructors
    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(Throwable arg0) {
        super(arg0);
    }

    public SaldoInsuficienteException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public SaldoInsuficienteException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}
