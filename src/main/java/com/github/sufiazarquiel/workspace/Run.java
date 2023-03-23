package com.github.sufiazarquiel.workspace;

import java.util.ArrayList;

public class Run {
    // Main method
    public static void main(String[] args) {
       System.out.println("Hi");
    }

    // Attributes
    private int a, b;
    private ArrayList<Integer> arraylist;
    private int[] array;

    // Constructors
    public Run() {
        this.a = 0;
        this.b = 0;
        this.arraylist = new ArrayList<Integer>();
        this.array = new int[8];
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

    
    public ArrayList<Integer> getArraylist() {
        return arraylist;
    }
    
    public void setArraylist(ArrayList<Integer> arraylist) {
        this.arraylist = arraylist;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getIntAtArrayList(int index) {
        return this.arraylist.get(index);
    }

    public int getIntAtArray(int index) {
        return this.array[index];
    }
    
    // Methods
    public void addToArrayList(int a) {
        this.arraylist.add(a);
    }

    public void addToArray(int a, int index) {
        this.array[index] = a;
    }

    public void removeFromArrayList(int a) {
        this.arraylist.remove(a);
    }

    // ToString
    @Override
    public String toString() {
        return "Run object [a=" + a + ", b=" + b + "]";
    }
}
