package com.github.sufiazarquiel.workspace.tryexcept.amigos;

import java.util.ArrayList;

public class Pandilla {
    // Attributes
    private int capacidad;
    private ArrayList<Amigo> lista;

    // Constructors
    public Pandilla() {
        this.capacidad = 5;
        this.lista = new ArrayList<Amigo>();
    }

    public Pandilla(int capacidad) {
        this.capacidad = capacidad;
        this.lista = new ArrayList<Amigo>();
    }

    // Getters and Setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Amigo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Amigo> lista) {
        this.lista = lista;
    }

    // Methods
    public void add(Amigo amigo) throws PandillaCompletaException, NoMeGustaTuNombreException {
        if (this.lista.size() >= this.capacidad) {
            throw new PandillaCompletaException("Pandilla completa");
        } else if (amigo.getNombre().charAt(amigo.getNombre().length() - 1) == 's') {
            throw new NoMeGustaTuNombreException("No me gusta tu nombre");
        } else {
            this.lista.add(amigo);
        }
    }

    @Override
    public String toString() {
        String resultado = "Pandilla [capacidad=" + capacidad + ", lista=" + "\n";
        for (Amigo amigo : lista) {
            resultado += amigo.getNombre() + "\n";
        }
        resultado += "]";
        return resultado;
    }

    // Main method
    public static void main(String[] args) {
        Pandilla pandilla = new Pandilla(6);
        try {
            pandilla.add(new Amigo("Pedro", "P"));
            pandilla.add(new Amigo("Juan", "J"));
            pandilla.add(new Amigo("Roberto", "R"));
            pandilla.add(new Amigo("Carlos", "C"));
            pandilla.add(new Amigo("Miguel", "M"));
        } catch (PandillaCompletaException e) {
            System.out.println(e.getMessage());
        } catch (NoMeGustaTuNombreException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(pandilla);
        }
    }
}
