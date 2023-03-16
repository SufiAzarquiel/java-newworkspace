package com.github.sufiazarquiel.workspace.profesores;

import java.util.ArrayList;

import com.github.sufiazarquiel.workspace.profesores.Profesor.Departamento;

public class Claustro {
    // Attributes
    private ArrayList<Profesor> profesores;

    // Constructors
    public Claustro() {
        this.profesores = new ArrayList<Profesor>();
    }

    // Getters and setters
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void getProfesor(int index) {
        this.profesores.get(index);
    }

    // Methods
    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void removeProfesor(Profesor profesor) {
        this.profesores.remove(profesor);
    }

    public void removeProfesor(int index) {
        this.profesores.remove(index);
    }

    @Override
    public String toString() {
        return "Claustro [profesores=" + profesores + "]";
    }

    public ArrayList<Profesor> getProfesoresInterinos() {
        ArrayList<Profesor> profesoresInterinos = new ArrayList<Profesor>();
        for (Profesor profesor : profesores) {
            if (profesor instanceof Interino && ((Interino) profesor).getFechaFin() == null) {
                profesoresInterinos.add(profesor);
            }
        }
        return profesoresInterinos;
    }

    public ArrayList<Profesor> getProfesoresDepartamento(Departamento departamento) {
        ArrayList<Profesor> profesoresDepartamento = new ArrayList<Profesor>();
        for (Profesor profesor : profesores) {
            if (profesor.getDepartamento() == departamento) {
                // Can be done in the same line but this way is more readable
                if (profesor instanceof Interino && ((Interino) profesor).getFechaFin() == null) {
                    profesoresDepartamento.add(profesor);
                } else if (profesor instanceof Fijo && !((Fijo) profesor).isJubilado()) {
                    profesoresDepartamento.add(profesor);
                }
            }
        }
        return profesoresDepartamento;
    }
}
