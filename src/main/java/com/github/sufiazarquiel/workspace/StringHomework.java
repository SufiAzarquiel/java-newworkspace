package com.github.sufiazarquiel.workspace;

import java.util.Scanner;

public class StringHomework {
    /*
     * Ejercicio 1: Programa que pase un String a mayúsculas y diga cuantas letras
     * han cambiado.
     */
    public static String strEjer1(String input) {
        // Variables
        String frase = "";
        int total = 0;

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce una frase: ");
            frase = teclado.nextLine();
            System.out.print(frase + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.
        String uppercase = frase.toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != uppercase.charAt(i)) {
                total++;
            }
        }

        System.out.printf("\"%s\" %d cambios\n", uppercase, total);

        // Valor final usado para el test unitario.
        return uppercase;
    }

    /*
     * Ejercicio 2: Programa que reciba una cadena y diga cuantas palabras contiene.
     * (Las palabras pueden estar separadas por espacios, puntos o comas).
     */
    public static String strEjer2(String input) {
        // Variables
        String frase = "";

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce una frase: ");
            frase = teclado.nextLine();
            System.out.print(frase + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.
        String[] palabras = frase.split("[., ]");

        // Salida del programa
        System.out.println("Palabras encontradas: " + palabras.length);

        // Valor final usado para el test unitario.
        return frase;
    }

    /*
     * Ejercicio 3: Programa que codifique una cadena cambiando cada letra por la
     * siguiente en el código ASCII.
     */
    public static String strEjer3(String input) {
        // Variables
        String frase = "";
        String resultado = "";

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce una cadena: ");
            frase = teclado.nextLine();
            System.out.print(frase + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.
        for (int i = 0; i < frase.length(); i++) {
            resultado += (char) (Character.valueOf(frase.charAt(i)) + 1);
        }

        // Salida del programa
        System.out.println(resultado);

        // Valor final usado para el test unitario.
        return frase;
    }

    /*
     * Ejercicio 4: Programa que rote una cadena tantas veces como se le diga.
     * Introduciendo: “Lunes”
     * Rotaciones: 3
     * Da como salida: “nesLu”
     */
    public static StringBuilder strEjer4(String input) {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(input);

        System.out.print("Introduce una cadena: ");
        StringBuilder frase = new StringBuilder(teclado.nextLine());
        System.out.print(frase + "\n");

        System.out.print("Rotaciones: ");
        int rotaciones = teclado.nextInt();
        System.out.print(rotaciones + "\n");

        teclado.close();

        // Código principal.
        int j = frase.length() - 1;
        for (int i = 0; i < rotaciones; i++) {
            char c = frase.charAt(frase.length() - 1);
            frase.deleteCharAt(j);
            frase.insert(0, c);
        }

        // Salida del programa
        System.out.println(frase);

        // Valor final usado para el test unitario.
        return frase;
    }

    /*
     * Ejercicio 5: Programa que lea un numero double, lo convierta a una cadena y
     * le añada las comas separadoras de los miles.
     */
    public static StringBuilder strEjer5(String input) {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(input);

        System.out.print("Introduce un número: ");
        double num = teclado.nextDouble();
        StringBuilder cadena = new StringBuilder(String.valueOf(num));
        System.out.print(num + "\n");

        teclado.close();

        // Código principal.
        int punto = cadena.indexOf(".");
        StringBuilder resultado = new StringBuilder(cadena.toString());
        if (punto != -1) {
            for (int i = punto - 3; i > 0; i -= 3) {
                resultado.insert(i, ",");
            }
        }

        // Salida del programa
        System.out.println(resultado);

        // Valor final usado para el test unitario.
        return resultado;
    }

    /*
     * Ejercicio 6: Programa que descubra si una palabra es o no palíndroma, es
     * decir se lee igual del derecho que del revés.
     */
    public static boolean strEjer6(String input) {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(input);

        System.out.print("Introduce una palabra: ");
        StringBuilder palabra = new StringBuilder(teclado.nextLine());
        System.out.print(palabra + "\n");

        teclado.close();

        // Código principal.
        StringBuilder inv = new StringBuilder(palabra.reverse().toString());
        boolean palindromo = palabra.equals(inv);

        // Salida del programa
        System.out.println(palindromo);

        // Valor final usado para el test unitario.
        return palindromo;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        String input = "";

        // Ejecutar función del ejercicio.
        input = "Hola a Todos\n";
        strEjer1(input);

        // Ejercicio 1
        input = "Hola a Todos.Adios\n";
        strEjer2(input);

        // Ejercicio 3
        input = "Lunes\n";
        strEjer3(input);

        // Ejercicio 4
        input += "3\n";
        strEjer4(input);

        // Ejercicio 5
        input = "2388432,34";
        strEjer5(input);

        // Ejercicio 6
        input = "oso";
        strEjer6(input);
        input = "paco";
        strEjer6(input);
    }
}
