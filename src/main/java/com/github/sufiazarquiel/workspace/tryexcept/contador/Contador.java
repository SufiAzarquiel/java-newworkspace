package com.github.sufiazarquiel.workspace.tryexcept.contador;

public interface Contador {
    // Methods
    public void incrementar() throws ValorMaximoContadorException;
    public void decrementar() throws ValorMinimoContadorException;
    public void reset();
}
