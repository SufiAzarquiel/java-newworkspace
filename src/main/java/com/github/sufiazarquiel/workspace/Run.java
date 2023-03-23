package com.github.sufiazarquiel.workspace;

public class Run {
    // Main method
    public static void main(String[] args) {
       System.out.println("Hi");
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Run(int a) {
        this.a = a;
    }

    public Run() {
        this.a = 0;
    }
}
