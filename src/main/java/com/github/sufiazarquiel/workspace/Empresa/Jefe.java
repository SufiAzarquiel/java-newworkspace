package com.github.sufiazarquiel.workspace.empresa;

public class Jefe extends Staff {
    // Attributes
    protected String matricula;

    // Constructor
    public Jefe(String nombre, String DNI, int edad, float sueldo, String matricula) {
        super(nombre, DNI, edad, sueldo);
        this.matricula = matricula;
    }

    // Methods
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Jefe [matricula=" + matricula + ", sueldo=" + sueldo + ", nombre=" + nombre + ", DNI=" + DNI + ", edad="
                + edad + "]";
    }
}
