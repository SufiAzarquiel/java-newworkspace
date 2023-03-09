package com.github.sufiazarquiel.workspace.reloj;

import java.text.DecimalFormat;
import java.util.Calendar;
public abstract class Reloj {
    // Attributes
    protected Calendar systemDate;
    protected int hora;
    protected int minuto;
    protected DecimalFormat format;

    // Constructors
    public Reloj() {
        // Initialize attributes with default values
        this.systemDate = null;
        this.hora = 0;
        this.minuto = 0;
        this.format = new DecimalFormat("00");
    }

    // Methods
    public abstract String getHora();
}
