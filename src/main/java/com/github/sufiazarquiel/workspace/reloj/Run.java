package com.github.sufiazarquiel.workspace.reloj;

public class Run {
    public static void main(String[] args) {
        RelojDigital relojDigital = new RelojDigital();
        RelojAnalogico relojAnalogico = new RelojAnalogico();
        
        System.out.println(relojDigital.getHora());
        System.out.println(relojAnalogico.getHora());
    }
}
