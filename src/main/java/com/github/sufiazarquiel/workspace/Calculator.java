package com.github.sufiazarquiel.workspace;

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value += number;
    }

    public void subtract(int number) {
        this.value -= number;
    }

    public void resetValue() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }
}
