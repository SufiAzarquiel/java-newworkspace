package com.github.sufiazarquiel.workspace.transporte;

import java.util.ArrayList;

public class Ficha {
    // Attributes
    private ArrayList<Transporte> transportes;
    public static final double SUELDO_BASE = 700;
    public static final double EXTRA_HORA = 5;
    public static final double EXTRA_PASAJERO_GRUPO_REDUCIDO = 1;
    public static final double EXTRA_PASAJERO_GRUPO_AMPLIO = 0.5;
    public static final double EXTRA_TONELADA = 2;
    public static final double EXTRA_PELIGROSA = 50;
    public static final int LIMITE_GRUPO_REDUCIDO = 12;


    // Constructors
    public Ficha() {
        this.transportes = new ArrayList<Transporte>();
    }

    // Methods
    public void addTransporte(Transporte transporte) {
        this.transportes.add(transporte);
    }

    public void removeTransporte(Transporte transporte) {
        this.transportes.remove(transporte);
    }

    public void removeTransporte(int index) {
        this.transportes.remove(index);
    }

    public void getTransporte(int index) {
        this.transportes.get(index);
    }

    public double getSueldo() {
        double sueldo = SUELDO_BASE;
        for (Transporte transporte : transportes) {
            sueldo += transporte.getNumeroHoras() * EXTRA_HORA;
            if (transporte instanceof TransporteViajeros) {
                TransporteViajeros viajeros = (TransporteViajeros) transporte; 
                if (viajeros.getPersonasTransportadas() < LIMITE_GRUPO_REDUCIDO) {
                    sueldo += EXTRA_PASAJERO_GRUPO_REDUCIDO * viajeros.getPersonasTransportadas();
                } else {
                    sueldo += EXTRA_PASAJERO_GRUPO_AMPLIO * viajeros.getPersonasTransportadas();
                }
            } else if (transporte instanceof TransporteMercancia) {
                sueldo += EXTRA_TONELADA * ((TransporteMercancia) transporte).getToneladas();
                if (transporte instanceof TransporteMercanciaPeligrosa) {
                    sueldo += EXTRA_PELIGROSA;
                }
            }
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return "Ficha [\ntransportes=" + transportes + "\n]";
    }
}
