package com.github.sufiazarquiel.workspace.oneFilers;

import java.util.Scanner;

public class DataStructures {
    
    /*
     * Cuenta: Dado un texto contar cuantas veces se encuentra esa letra.
     */
    public int cuenta(String input) {
        // Variables
        String frase = ""; // Texto introducido por el usuario.
        char letra = 'a';
        int total = 0; // El número que se usará en el bucle

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce una frase: ");
            frase = teclado.nextLine();
            System.out.print(frase + "\n");
            System.out.print("Introduce una letra: ");
            letra = teclado.nextLine().charAt(0);
            System.out.print(letra + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Un bucle hasta n = longitud de la cadenaa.
        for (int i = 0; i < frase.length(); i++) {
            // String fLetra = String.valueOf(letra);
            // String fChar = String.valueOf(frase.charAt(i));
            if (letra == frase.charAt(i)) {
                total++;
            }
        }

        System.out.printf("La letra %c aparece %d veces.", letra, total);

        // Valor final usado para el test unitario.
        return total;
    }
}
