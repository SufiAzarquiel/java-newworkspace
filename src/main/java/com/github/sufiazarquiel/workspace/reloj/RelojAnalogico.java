package com.github.sufiazarquiel.workspace.reloj;

import java.util.Calendar;

public class RelojAnalogico extends Reloj {
    // Constructors
    public RelojAnalogico() {
        super();
    }

    // Methods
    @Override
    public String getHora() {
        this.systemDate = Calendar.getInstance();
        this.hora = this.systemDate.get(Calendar.HOUR_OF_DAY);
        this.minuto = this.systemDate.get(Calendar.MINUTE);
        String hora = "Son las " + this.hora;
        if (minuto == 0) {
            hora += " en punto";
        } else if (minuto < 15 || minuto > 15 && minuto < 30) {
            hora += " y " + this.minuto;
        } else if (minuto == 15) {
            hora += " y cuarto";
        } else if (minuto == 30) {
            hora += " y media";
        } else if (minuto == 45) {
            hora += " menos cuarto";
        } else {
            hora += " menos" + (60 - this.minuto);
        }
        return hora;
    }
}
