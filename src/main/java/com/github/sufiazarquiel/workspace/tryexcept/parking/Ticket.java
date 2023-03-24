package com.github.sufiazarquiel.workspace.tryexcept.parking;

import java.util.Date;

public class Ticket {
    // Attributes
    private String matricula;
    private Date hora;
    private boolean pagado;
    public static final float precioMinuto = 0.03f;
    public static final float precioHora = 1.7f;
    public static final float precioDia = 17f; // More than 10 hours

    // Constructors
    public Ticket(String matricula, Date hora, boolean pagado) {
        this.matricula = matricula;
        this.hora = hora;
        this.pagado = pagado;
    }

    public Ticket(String matricula, Date hora) {
        this.matricula = matricula;
        this.hora = hora;
        this.pagado = false;
    }

    // Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    // Methods
    public float calcularPrecio() {
        Date ahora = new Date();
        float coste = 0;
        // El coste sera el precio de un dia si el tiempo de estancia es mayor de 10 horas
        // si no, sera el de las horas y minutos que haya estado
        if (ahora.getTime() - this.hora.getTime() > 10 * 60 * 60 * 1000) {
            coste = precioDia;
        } else {
            long minutos = (ahora.getTime() - this.hora.getTime()) / 1000 / 60;
            long horas = minutos / 60;
            minutos = minutos - (horas * 60);
            coste += minutos * precioMinuto;
            coste += horas * precioHora;
        }
        return coste;
    }

    @Override
    public String toString() {
        return "Ticket [matricula=" + matricula + ", hora=" + hora + ", pagado=" + pagado + "]";
    }
}
