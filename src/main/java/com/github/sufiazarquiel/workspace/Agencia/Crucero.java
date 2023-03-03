package com.github.sufiazarquiel.workspace.agencia;

import java.util.ArrayList;
import java.util.Date;

public class Crucero {
    // Attributes
    private int codigo;
    private String nombreCrucero;
    private String nombreBarco;
    private Date fechaPartida;
    private Date fechaRegreso;
    private ArrayList<Escala> escalas;

    // Constructor
    public Crucero(int codigo, String nombreCrucero, String nombreBarco, Date fechaPartida, Date fechaRegreso) {
        this.codigo = codigo;
        this.nombreCrucero = nombreCrucero;
        this.nombreBarco = nombreBarco;
        this.fechaPartida = fechaPartida;
        this.fechaRegreso = fechaRegreso;
        this.escalas = new ArrayList<Escala>();
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombreCrucero() {
        return nombreCrucero;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public Date getFechaPartida() {
        return fechaPartida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public ArrayList<Escala> getEscalas() {
        return escalas;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreCrucero(String nombreCrucero) {
        this.nombreCrucero = nombreCrucero;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public void setFechaPartida(Date fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public void setEscalas(ArrayList<Escala> escalas) {
        this.escalas = escalas;
    }

    // Methods
    public int coste() {
        int coste = 600;
        for (Escala escala : escalas) {
            coste += 100;
            if (escala instanceof EscalaCultural) {
                coste += ((EscalaCultural) escala).getPrecioGuia();
            }
        }
        return coste;
    }

    public void addEscala(Escala escala) {
        this.escalas.add(escala);
    }

    public void removeEscala(Escala escala) {
        this.escalas.remove(escala);
    }

    @Override
    public String toString() {
        return "crucero \nnombreCrucero: " + nombreCrucero + ", fechaPartida: " + fechaPartida + ", fechaRegreso: "
                + fechaRegreso + ", duracion:" + (fechaRegreso.getTime() - fechaPartida.getTime()) +
                ", escalas: " + escalas + "\n";
    }
}
