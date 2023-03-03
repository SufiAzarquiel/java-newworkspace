package com.github.sufiazarquiel.workspace.restaurante;

import java.util.ArrayList;

public class Comanda {
    // Attributes
    private int numeroMesa;
    private int numeroComensales;
    private ArrayList<Plato> platos;

    // Constructor
    public Comanda(int numeroMesa, int numeroComensales) {
        this.numeroMesa = numeroMesa;
        this.numeroComensales = numeroComensales;
        this.platos = new ArrayList<Plato>();
    }

    // Getters
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    // Setters
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    // Methods
    public void addPlato(Plato plato) {
        this.platos.add(plato);
    }

    public void removePlato(Plato plato) {
        this.platos.remove(plato);
    }

    public double coste() {
        double precio = 0;
        for (Plato plato : platos) {
            precio += plato.getPrecio();
        }
        return precio;
    }

    public boolean hayDiabeticos() {
        for (Plato plato : platos) {
            if (plato instanceof Postre && (((Postre) plato).tieneAzucar())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "comanda \nnumeroMesa: " + numeroMesa + ", numeroComensales: " + numeroComensales + ", platos: " + platos
                + "\n";
    }
}
