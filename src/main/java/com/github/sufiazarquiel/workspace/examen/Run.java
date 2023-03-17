package com.github.sufiazarquiel.workspace.examen;

import java.util.Date;

public class Run {
    public static void main(String[] args) {
        // Estudiantes
        Estudiante pedro = new Estudiante("Pedro", "García", "165189148X", 1);
        Estudiante maria = new Estudiante("María", "González", "87654321B", 2);
        Estudiante juan = new Estudiante("Juan", "López", "289484861L", 3);
        Estudiante antonio = new Estudiante("Antonio", "Martínez", "24681357D", 2);
        Estudiante ana = new Estudiante("Ana", "Sánchez", "35792468E", 1);

        // Personal de servicio
        PersonalDeServicio juanito = new PersonalDeServicio("Juanito", "Juan", "12345678A", new Date(), 1, "Cocina");
        PersonalDeServicio mariajo = new PersonalDeServicio("María", "González", "98465184N", new Date(), 2, "Limpieza");
        PersonalDeServicio juanita = new PersonalDeServicio("Juana", "López", "13579546C", new Date(), 1, "Cocina");
        
        // Profesores
        Profesor lenguajes = new Profesor("Paco", "García", "12345678C", new Date(), 1, Profesor.Departamento.LENGUAJES);
        Profesor matematicas = new Profesor("María", "Pérez", "87654321B", new Date(), 2, Profesor.Departamento.MATEMATICAS);

        // Facultad
        Facultad facultad = new Facultad();
        facultad.añadirPersona(pedro);
        facultad.añadirPersona(maria);
        facultad.añadirPersona(juan);
        facultad.añadirPersona(antonio);
        facultad.añadirPersona(ana);
        facultad.añadirPersona(juanito);
        facultad.añadirPersona(mariajo);
        facultad.añadirPersona(juanita);
        facultad.añadirPersona(lenguajes);
        facultad.añadirPersona(matematicas);
        
        System.out.println("Alumnos de primero: " + facultad.getAlumnoPorCurso(1) + "\n");
        System.out.println("Alumnos de segundo: " + facultad.getAlumnoPorCurso(2) + "\n");
        System.out.println("Alumnos de tercero: " + facultad.getAlumnoPorCurso(3) + "\n");
        System.out.println("Empleados del despacho 1" + facultad.getPersonalPorDespacho(1) + "\n");
        System.out.println("Empleados del despacho 2" + facultad.getPersonalPorDespacho(2) + "\n");

        // Despido y echo a los que se llaman juan o alguna variante
        facultad.quitarPersona(juanito);
        facultad.quitarPersona(juanita);
        facultad.quitarPersona(juan);
        System.out.println("Empleados del despacho 1" + facultad.getPersonalPorDespacho(1) + "\n");
        System.out.println("Empleados del despacho 2" + facultad.getPersonalPorDespacho(2) + "\n");
    }
}
