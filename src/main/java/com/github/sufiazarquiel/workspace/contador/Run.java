package com.github.sufiazarquiel.workspace.contador;

public class Run {
    public static void main(String[] args) {
        ContadorEntero contadorEntero = new ContadorEntero();
        ContadorDecimales contadorDecimales = new ContadorDecimales();
        ContadorLetras contadorLetras = new ContadorLetras();
        
        for (int i = 0; i < 5; i++) {
            contadorDecimales.incrementar();
            for (int j = 0; j < 12; j++) {
                contadorEntero.incrementar();
                contadorLetras.incrementar();
            }
        }
        
        System.out.println(contadorDecimales);
        System.out.println(contadorEntero);
        System.out.println(contadorLetras);
    }
}
