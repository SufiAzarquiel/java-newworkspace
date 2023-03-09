package com.github.sufiazarquiel.workspace.reloj;

import java.util.Calendar;

public class RelojDigital extends Reloj {
    // Constructors
    public RelojDigital() {
        super();
    }

    // Methods
    @Override
    public String getHora() {
        this.systemDate = Calendar.getInstance();
        this.hora = this.systemDate.get(Calendar.HOUR_OF_DAY);
        this.minuto = this.systemDate.get(Calendar.MINUTE);

        return this.format.format(this.hora) + ":" + this.format.format(this.minuto);
    }
}
