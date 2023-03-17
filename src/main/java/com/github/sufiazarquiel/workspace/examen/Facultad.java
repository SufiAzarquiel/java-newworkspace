package com.github.sufiazarquiel.workspace.examen;

import java.util.ArrayList;

public class Facultad {
    // Atributos
    private ArrayList<Persona> personas;

    // Constructor
    public Facultad() {
        this.personas = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public Persona getPersona(int index) {
        return personas.get(index);
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    // toString
    @Override
    public String toString() {
        return "Facultad: personas=" + personas;
    }

    // Métodos
    public void añadirPersona(Persona persona) {
        personas.add(persona);
    }

    public void quitarPersona(Persona persona) {
        personas.remove(persona);
    }

    public void quitarPersona(int index) {
        personas.remove(index);
    }

    public ArrayList<Estudiante> getAlumnoPorCurso(int curso) {
        ArrayList<Estudiante> mismoCurso = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                // Se puede hacer en la misma línea, pero así se lee mejor
                if (((Estudiante) persona).getCurso() == curso) {
                    mismoCurso.add((Estudiante) persona);
                }
            }
        }
        return mismoCurso;
    }

    public ArrayList<Empleado> getPersonalPorDespacho(int numDespacho) {
        ArrayList<Empleado> mismoDespacho = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                if (((Empleado) persona).getNumDespacho() == numDespacho) {
                    // Añadir a la lista de empleados con la clase correspondiente
                    if (persona instanceof PersonalDeServicio) {
                        mismoDespacho.add((PersonalDeServicio) persona);
                    } else if (persona instanceof Profesor) {
                        mismoDespacho.add((Profesor) persona);
                    }
                }
            }
        }
        return mismoDespacho;
    }
}
