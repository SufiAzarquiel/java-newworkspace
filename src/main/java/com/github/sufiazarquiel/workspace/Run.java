package com.github.sufiazarquiel.workspace;

public class Run {

    private int value;

    public Run() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    // Array homework
    public static void main(String[] args) {
        // Run method
        StringBuilder str = new StringBuilder("Buenos dias");
        StringBuilder resultado;
        resultado = SufiOOP1.endDot(str);
        System.out.println(resultado);
        System.out.println(str);

    }

    // // String homework
    // public static void main(String[] args) {
    //     StringHomework.runStr();
    // }

    // // Array demonstrations
    // public static void main(String[] args) {
    //     // Run method
    //     grades2DArray();
    // }
}
