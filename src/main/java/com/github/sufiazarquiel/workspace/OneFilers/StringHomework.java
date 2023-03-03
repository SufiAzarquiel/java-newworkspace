package com.github.sufiazarquiel.workspace.oneFilers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class StringHomework {
    /*
     * Ejercicio 1: Programa que pase un String a mayúsculas y diga cuantas letras
     * han cambiado.
     */
    public static String strEjer1() {
        // Variables
        String frase = "";
        int total = 0;

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
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
    public static String strEjer2() {
        // Variables
        String frase = "";

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
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
    public static String strEjer3() {
        // Variables
        String frase = "";
        String resultado = "";

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
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
    public static StringBuilder strEjer4() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

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
            char c = frase.charAt(j);
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
    public static StringBuilder strEjer5() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

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
    public static boolean strEjer6() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        StringBuilder palabra = new StringBuilder(teclado.nextLine());
        System.out.print(palabra + "\n");

        teclado.close();

        // Código principal.
        StringBuilder inv = new StringBuilder(palabra);
        inv.reverse();
        boolean palindromo = palabra.toString().equals(inv.toString());

        // Salida del programa
        System.out.println(palindromo);

        // Valor final usado para el test unitario.
        return palindromo;
    }

    /*
     * Ejercicio 7: Programa que sume todas las cifras de los números que aparecen
     * en una cadena de caracteres.
     */
    public static int strEjer7() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());
        System.out.print(cadena + "\n");

        teclado.close();

        // Código principal.
        int total = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                String c = String.valueOf(cadena.charAt(i));
                total += Integer.parseInt(c);
            }
        }

        // Salida del programa
        System.out.println(total);

        // Valor final usado para el test unitario.
        return total;
    }

    /*
     * Ejercicio 8: Igual al anterior, pero sumando los números completos.
     */
    public static int strEjer8() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());
        System.out.print(cadena + "\n");

        teclado.close();

        // Código principal.
        int total = 0;
        int i = 0;
        do {
            String n = "";
            if (Character.isDigit(cadena.charAt(i))) {
                while (i < cadena.length() && Character.isDigit(cadena.charAt(i))) {
                    n += cadena.charAt(i);
                    i++;
                }
                total += Integer.parseInt(n);
            }
            i++;
        } while (i < cadena.length());

        // Salida del programa
        System.out.println(total);

        // Valor final usado para el test unitario.
        return total;
    }

    /*
     * Ejercicio 9: Programa que recibe dos cadenas de caracteres y comprueba
     * cuantas veces aparece la primera en la segunda.
     */
    public static int strEjer9() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cadena a buscar: ");
        StringBuilder clave = new StringBuilder(teclado.nextLine());
        System.out.print(clave + "\n");

        System.out.print("Introduce la frase donde se buscará: ");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());
        System.out.print(cadena + "\n");

        teclado.close();

        // Código principal.
        int total = 0;
        while (cadena.indexOf(clave.toString()) != -1) {
            int pos = cadena.indexOf(clave.toString());
            total++;
            cadena.delete(pos,
                    pos + clave.length());
            cadena.insert(pos, "_");
        }

        // Salida del programa
        System.out.println(total);
        System.out.println(cadena);

        // Valor final usado para el test unitario.
        return total;
    }

    /*
     * Ejercicio 10: Programa que simule el juego del ahorcado. Elegimos una palabra
     * y vamos pidiendo letras al usuario. Cada vez mostramos la palabra solo con
     * las letras acertadas. Si no acierta todas las letras en 8 intentos, se da el
     * juego por perdido.
     */
    public static int strEjer10() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Juguemos al ahorcado!");

        JPasswordField jpf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, jpf,
                "Palabra secreta", JOptionPane.CLOSED_OPTION);
        String secret = String.valueOf(jpf.getPassword());

        // Código principal.
        int total = 0;
        StringBuilder palabra = new StringBuilder(secret);
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            salida.append("_");
        }
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce una letra: ");
            String str = teclado.nextLine();
            if (str.length() == 1) {
                char letra = str.charAt(0);
                for (int j = 0; j < palabra.length(); j++) {
                    if (letra == palabra.charAt(j)) {
                        salida.delete(j,
                                j + 1);
                        salida.insert(j, palabra.charAt(j));
                    }
                }
            } else {
                if (str.equals(palabra.toString())) {
                    System.out.println("Has ganado!");
                    System.exit(0);
                } else {
                    System.out.println("Palabra incorrecta.");
                }
            }
            System.out.println(salida);
        }

        teclado.close();

        // Valor final usado para el test unitario.
        return total;
    }

    /*
     * Ejercicio 11: Programa que recibe dos cadenas de caracteres y comprueba
     * cuantas veces aparece la primera en la segunda.
     */
    public static StringBuilder strEjer11() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        StringBuilder frase = new StringBuilder(teclado.nextLine());
        System.out.print(frase + "\n");

        teclado.close();

        // Código principal.
        for (int i = 0; i < frase.length(); i++) {
            if ("AEIOUaeiou".contains(String.valueOf(frase.charAt(i)))) {
                frase.delete(i, i + 1);
            }
        }

        // Salida del programa
        System.out.println(frase);

        // Valor final usado para el test unitario.
        return frase;
    }

    /*
     * Ejercicio 12: Realiza un programa que lea un String y elimine las palabras de
     * menos de
     * tres letras. Una vez eliminadas esas palabras, no deben existir espacios
     * duplicados.
     */
    public static String strEjer12() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        StringBuilder frase = new StringBuilder(teclado.nextLine());
        System.out.print(frase + "\n");

        teclado.close();

        // Código principal.
        String[] palabras = frase.toString().split(" ");
        ArrayList<String> palabrazas = new ArrayList<String>(); // Palabras de menos de 3 letras
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= 3) {
                palabrazas.add(palabras[i]);
            }
        }

        String resultado = String.join(" ", palabrazas);

        // Salida del programa
        System.out.println(resultado);

        // Valor final usado para el test unitario.
        return resultado;
    }

    /*
     * Ejercicio 13: Realiza un programa que averigüe cual es la palabra que mas
     * letras tiene de
     * un String. El String solo contendrá letras y espacios de separación, nada
     * más.
     */
    public static String strEjer13() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();
        System.out.print(frase + "\n");

        teclado.close();

        // Código principal.
        StringTokenizer st = new StringTokenizer(frase);
        String maxStr = "";
        while (st.hasMoreTokens()) {
            String trozo = st.nextToken();
            if (trozo.length() > maxStr.length()) {
                maxStr = trozo;
            }
        }
        // String[] palabras = frase.split(" ");
        // for (int i = 0; i < palabras.length; i++) {
        // if (palabras[i].length() > maxStr.length()) {
        // maxStr = palabras[i];
        // }
        // }

        // Salida del programa
        System.out.println("La palabra que más letras tiene es: " + maxStr);

        // Valor final usado para el test unitario.
        return maxStr;
    }

    /*
     * Ejercicio 14: Realiza un programa que intercale las letras de dos palabras.
     * El programa debe pedir 2 palabras y luego dar otra
     * palabra resultado con las letras de las dos palabras intercaladas.
     */
    public static String strEjer14() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra1 = teclado.nextLine();
        System.out.print(palabra1 + "\n");

        System.out.print("Introduce otra palabra: ");
        String palabra2 = teclado.nextLine();
        System.out.print(palabra2 + "\n");

        teclado.close();

        // Código principal.
        // Hacer que palabra1 sea la mayor cadena
        if (palabra1.length() < palabra2.length()) {
            String tmp = palabra1;
            palabra1 = palabra2;
            palabra2 = tmp;
        }

        // Poner la palabra mayor en mayúscula
        palabra1 = palabra1.toUpperCase();
        palabra2 = palabra2.toLowerCase();

        // Intercalar las letras
        String resultado = "";

        // Propuesta A
        // for (int i = 0; i < palabra1.length(); i++) {
        // resultado += palabra1.charAt(i);
        // if (i < palabra2.length()) {
        // resultado += palabra2.charAt(i);
        // }
        // } p s a u l s a b r a

        // Propuesta B
        StringBuilder palabra1StringBuilder = new StringBuilder(palabra1);
        int charInsertPosition = 1;
        for (int i = 0; i < palabra2.length(); i++) {
            palabra1StringBuilder.insert(charInsertPosition, palabra2.charAt(i));
            charInsertPosition += 2;
        }

        resultado = palabra1StringBuilder.toString();

        // Salida del programa
        System.out.println(resultado);

        // Valor final usado para el test unitario.
        return resultado;
    }

    /*
     * Ejercicio 15: Realiza un programa que pida al usuario que escriba varias
     * palabras. El programa debe contar cuantas vocales tiene cada palabra y dará
     * como resultado la palabra que más vocales tenga. Se deben ir pidiendo
     * palabras al usuario hasta que este escriba la palabra “FIN”.
     */
    public static String strEjer15() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        // Código principal.
        String palabra = "";
        int vocales = 0;
        String resultado = "";
        int maxVocales = 0;

        while (!palabra.equals("FIN")) {
            System.out.print("Introduce una palabra: ");
            palabra = teclado.nextLine();
            for (int j = 0; j < palabra.length(); j++) {
                if ("AEIOUaeiou".contains(String.valueOf(palabra.charAt(j)))) {
                    vocales++;
                }
            }
            if (vocales > maxVocales) {
                resultado = palabra;
                maxVocales = vocales;
            }
            vocales = 0;
        }

        // Cerrar objeto Scanner
        teclado.close();

        // Salida del programa
        System.out.println("La palabra con más vocales es: " + resultado);
        System.out.printf("Y tiene %d vocales", maxVocales);

        // Valor final usado para el test unitario.
        return resultado;
    }

    /*
     * Ejercicio 16: Realiza un programa que compruebe si en una palabra se repite
     * alguna vocal
     * más de 2 veces. El programa pedirá que se teclee una palabra y comprobará
     * la vocales que contiene, cuando compruebe que una vocal aparece mas de
     * dos veces emitirá un mensaje en la pantalla y terminará. El programa debe
     * terminar en el mismo instante en que encuentre mas de dos vocales iguales,
     * no esperará a comprobar toda la palabra.
     */
    public static boolean strEjer16() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String word = teclado.nextLine();
        System.out.print(word + "\n");

        teclado.close();

        // Código principal.
        int j = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        boolean vocalRepetida = a >= 3 || e >= 3 || i >= 3 || o >= 3 || u >= 3;

        while (!vocalRepetida && j < word.length()) {
            switch (word.charAt(j)) {
                case 'a':
                case 'A':
                    a++;
                    break;
                case 'e':
                case 'E':
                    e++;
                    break;
                case 'i':
                case 'I':
                    i++;
                    break;
                case 'o':
                case 'O':
                    o++;
                    break;
                case 'u':
                case 'U':
                    u++;
                    break;
                default:
                    break;
            }

            j++;
        }

        // Salida del programa
        if (vocalRepetida) {
            System.out.println("Tiene mas de dos vocales iguales");
        } else {
            System.out.println("No tiene mas de dos vocales iguales");
        }

        // Valor final usado para el test unitario.
        return vocalRepetida;
    }

    /*
     * Ejercicio 17: Realiza un programa que averigüe cuantas asignaturas tiene
     * aprobadas un
     * alumno. El programa debe leer un String con el nombre de las asignaturas y
     * después otro String con la lista de sus notas. Debe dar como resultado el
     * nombre de las asignaturas aprobadas. Tanto la lista de asignaturas como la
     * lista de notas utilizan el símbolo ‘:’ como separador.
     * Ejemplo de funcionamiento del programa:
     * Escribe la lista de asignaturas: “Matemáticas:Literatura:Historia:Inglés”
     * Escribe la lista de notas: 7:4:10:3
     * Las asignaturas aprobadas son: Matemáticas Historia
     * Suponemos que las listas de asignaturas y de notas están bien formadas, es
     * decir siempre habrá unos ‘:’ entre una asignatura y otra o una nota y otra.
     * Además siempre existirá el mismo número de notas que de asignaturas. El
     * número de asignaturas no es fijo, pueden ser 4, 5, 6 o más.
     */
    public static String strEjer17() {
        // Objeto para leer lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe la lista de asignaturas: ");
        String asignaturasString = teclado.nextLine();
        System.out.print(asignaturasString + "\n");

        System.out.print("Escribe la lista de notas: ");
        String notasString = teclado.nextLine();
        System.out.print(notasString + "\n");

        teclado.close();

        // Código principal.
        StringTokenizer asignaturas = new StringTokenizer(asignaturasString, ":");
        StringTokenizer notas = new StringTokenizer(notasString, ":");
        String aprobadas = "";

        while (asignaturas.hasMoreTokens()) {
            String asignatura = asignaturas.nextToken();
            int nota = Integer.parseInt(notas.nextToken());
            if (nota > 4) {
                aprobadas += asignatura + " ";
            }
        }

        // Salida del programa
        if (aprobadas.length() > 0) {
            System.out.println("Las asignaturas aprobadas son: " + aprobadas);
        } else {
            System.out.println("No tiene asignaturas aprobadas.");
        }

        // Valor final usado para el test unitario.
        return aprobadas;
    }

    // Introduce un número -> ejecuta el ejercicio correspondiente.
    public static void runStr() {
        System.out.println("String, StringBuilder");

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué ejercicio quieres ejecutar?");

        int num = teclado.nextInt();

        switch (num) {
            case 1:
                strEjer1();
                break;
            case 2:
                strEjer2();
                break;
            case 3:
                strEjer3();
                break;
            case 4:
                strEjer4();
                break;
            case 5:
                strEjer5();
                break;
            case 6:
                strEjer6();
                break;
            case 7:
                strEjer7();
                break;
            case 8:
                strEjer8();
                break;
            case 9:
                strEjer9();
                break;
            case 10:
                strEjer10();
                break;
            case 11:
                strEjer11();
                break;
            case 12:
                strEjer12();
                break;
            case 13:
                strEjer13();
                break;
            case 14:
                strEjer14();
                break;
            case 15:
                strEjer15();
                break;
            case 16:
                strEjer16();
                break;
            case 17:
                strEjer17();
                break;

            default:
                System.out.println("Ese ejercicio no existe.");
                break;
        }

        teclado.close();

        /*
         * String input = "";
         * // Ejecutar función del ejercicio.
         * input = "Hola a Todos\n";
         * strEjer1(input);
         * 
         * // Ejercicio 1
         * input = "Hola a Todos.Adios\n";
         * strEjer2(input);
         * 
         * // Ejercicio 3
         * input = "Lunes\n";
         * strEjer3(input);
         * 
         * // Ejercicio 4
         * input += "3\n";
         * strEjer4(input);
         * 
         * // Ejercicio 5
         * input = "2388432,34";
         * strEjer5(input);
         * 
         * // Ejercicio 6
         * input = "oso";
         * strEjer6(input);
         * input = "paco";
         * strEjer6(input);
         * 
         * // Ejercicio 7
         * input = "15 de Noviembre de 2022";
         * strEjer7(input);
         * 
         * // Ejercicio 8
         * strEjer8(input);
         *
         * // Ejercicio 9
         * input = "la\n" + "La calle de la plaza\n";
         * strEjer9(input);
         *
         * // Ejercicio 10
         * ahorcado();
         *
         * // Ejercicio 11
         * input = "Hola a Todos";
         * strEjer11(input);
         * 
         * // Ejercicio 12
         * input = "El bar de la plaza";
         * strEjer12(input);
         * 
         * // Ejercicio 13
         * input = "Este Mp3 lo conecto al puerto usb";
         * strEjer13(input);
         * 
         * // Ejercicio 14
         * input = "internet\n" + "correo\n";
         * strEjer14(input);
         * 
         * // Ejercicio 15
         * input = "JUEGO\n" + "INVIERNO\n" + "AJEDREZ\n" + "FIN\n";
         * strEjer15(input);
         * 
         * // Ejercicio 16
         * input = "Instintivo\n";
         * strEjer16(input);
         * 
         * // Ejercicio 17
         * input = "Matemáticas:Literatura:Historia:Inglés\n";
         * input += "7:4:10:3\n";
         * strEjer17(input);
         */
    }
}
