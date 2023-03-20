package com.github.sufiazarquiel.workspace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    // Attributes
    private int a, b;

    // Constructors
    public Run() {
        this.a = 0;
        this.b = 0;
    }

    public Run(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Getters and Setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // ToString
    @Override
    public String toString() {
        return "Run object [a=" + a + ", b=" + b + "]";
    }

    // Main method
    public static void main(String[] args) {
        Run obj = new Run();
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            obj.setA(Integer.parseInt(teclado.readLine()));
            teclado.close();
        } catch (NumberFormatException e) {
            System.out.println("Formato numérico incorrecto\n" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error en el teclado\n" + e.getMessage());
        } finally {
            System.out.println("Final value: " + obj.getA());
        }
    }
}
