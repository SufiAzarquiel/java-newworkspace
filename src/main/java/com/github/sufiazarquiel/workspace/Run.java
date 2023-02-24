package com.github.sufiazarquiel.workspace;

import java.util.ArrayList;

import com.github.sufiazarquiel.workspace.Empresa.*;

public class Run {
    public static void main(String[] args) {
        // Cliente
        Cliente cl = new Cliente("Pedro", "654987L", 45, 12365);
        // Empleados
        Empleado em = new Empleado("Paco", "654997K", 28, 1200);
        Empleado em2 = new Empleado("Jesus", "656987S", 40, 1236);
        // Jefe
        Jefe jf = new Jefe("Julio", "665987Y", 55, 1600, "S65487TM");

        // Arraylist containing all people
        ArrayList<Persona> gente = new ArrayList<Persona>();
        gente.add(cl);
        gente.add(em);
        gente.add(em2);
        gente.add(jf);

        for (Persona persona : gente) {
            System.out.println(persona);
        }
    }

    public int getValue() {
        return 0;
    }
}
