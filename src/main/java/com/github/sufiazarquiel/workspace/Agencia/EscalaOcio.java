package com.github.sufiazarquiel.workspace.agencia;

import java.util.Date;

public class EscalaOcio extends Escala {
    // Constructor
    public EscalaOcio(String ciudad, Date bajada, Date regreso) {
        super(ciudad, bajada, regreso);
    }

    // Methods
    @Override
    public String toString() {
        return "escala ocio \n" + super.toString();
    }
}
