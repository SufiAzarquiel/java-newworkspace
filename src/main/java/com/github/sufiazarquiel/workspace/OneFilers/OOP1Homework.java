package com.github.sufiazarquiel.workspace.oneFilers;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OOP1Homework {
    public static boolean esVocal(String s) {
        if ("AIUEOaiueo".contains(String.valueOf(s.charAt(0)))) {
            return true;
        } else {
            return false;
        }
        // Can also be done like this:
        /*
         * "AIUEOaiueo".indexOf(s.charAt(0)) >= 0
         */
    }

    public static double grados(double celsius) {
        return 9 * celsius / 5 + 32;
    }

    public static double redondear(double num, int decimalPlaces) {
        return Math.round(num * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }

    public static long factorial(int num) {
        if (num == 0) {
            return -2;
        } else if (num < 0) {
            return -1;
        } else {
            long result = 1;
            for (int i = num; i > 0; i--) {
                result *= i;
            }
            return result;
        }
    }

    public static int fecha(int dia, int mes) {
        int[][] mesesDias = {
                { 1, 31 },
                { 2, 28 },
                { 3, 31 },
                { 4, 30 },
                { 5, 31 },
                { 6, 30 },
                { 7, 31 },
                { 8, 31 },
                { 9, 30 },
                { 10, 31 },
                { 11, 30 },
                { 12, 31 }
        };
        if (dia < 0 || mes < 0 || mes > 12) {
            System.out.println("No existe un dia o mes correspondiente a ese numero.");
            return -1;
        } else if (mesesDias[mes - 1][1] < dia) {
            System.out.println("No existe un dia correspondiente a ese numero.");
            return -1;
        }
        int total = 0;
        for (int[] par : mesesDias) {
            if (par[0] < mes) {
                total += par[1];
            } else if (par[0] == mes) {
                if (dia > par[1]) {
                    System.out.println("El mes que has introducido no tiene tantos días.");
                    return -1;
                } else {
                    total += dia;
                }
            } else {
                return total;
            }
        }
        return total;
    }

    public static StringBuilder repite(String cadena, int repeticiones) {
        if (repeticiones < 0) {
            System.out.println("No puede haber un numero negativo de repeticiones");
        }
        StringBuilder cadenaStringBuilder = new StringBuilder(cadena);
        for (int i = 1; i < repeticiones; i++) {
            cadenaStringBuilder.append(cadena);
        }
        return cadenaStringBuilder;
    }

    public static String cifrar(String cadena) {
        String resultado = "";
        String letras = "abcdefghijklmnñopqrstuvwxyzabABCDEFGHIJKLMNÑOPQRSTUVWXYZAB";
        for (int i = 0; i < cadena.length(); i++) {
            if (letras.indexOf(cadena.charAt(i)) > 0) {
                resultado += letras.charAt(letras.indexOf(cadena.charAt(i)) + 2);
            } else {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    public static String descifrar(String cadena) {
        String resultado = "";
        String letras = "yzabcdefghijklmnñopqrstuvwxyzYZABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; i < cadena.length(); i++) {
            if (letras.indexOf(cadena.charAt(i)) > 0) {
                resultado += letras.charAt(letras.indexOf(cadena.charAt(i)) - 2);
            } else {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    // Search for dots in a string. Make the first word after it start with an
    // uppercase letter
    public static String quitaFaltas(String inputString) {
        String[] words = inputString.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(".") && i + 1 < words.length) {
                words[i + 1] = words[i + 1].substring(0, 1).toUpperCase() + words[i + 1].substring(1);
            }
        }
        return String.join(" ", words);
    }

    // Given a number return it reversed
    public static int reversed(int number) {
        String numberString = String.valueOf(number);
        int resultado = 0;
        for (int i = numberString.length() - 1; i >= 0; i--) {
            resultado += Integer.valueOf(numberString.substring(i, i + 1)) * Math.pow(10, i);
        }
        return resultado;
    }

    // Find the greatest common divisor of two ints
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    // Transform a number from decimal to roman
    public static String toRoman(int number) {
        String resultado = "";
        if (number > 99 || number < 1) {
            return "El numero debe estar entre 1 y 99";
        }

        // IVXLC
        while (number > 0) {
            if (number >= 90) {
                resultado += "XC";
                number -= 90;
            } else if (number >= 50) {
                resultado += "L";
                number -= 50;
            } else if (number >= 40) {
                resultado += "XL";
                number -= 40;
            } else if (number >= 10) {
                resultado += "X";
                number -= 10;
            } else if (number >= 9) {
                resultado += "IX";
                number -= 9;
            } else if (number >= 5) {
                resultado += "V";
                number -= 5;
            } else if (number == 4) {
                resultado += "IV";
                number -= 4;
            } else if (number >= 1) {
                resultado += "I";
                number -= 1;
            }
        }
        return resultado;
    }

    // Generic Fibonnaci method
    public static int Fibonnaci(int i) {
        if (i == 0 || i == 1) {
            return i;
        } else {
            return Fibonnaci(i - 1) + Fibonnaci(i - 2);
        }
    }

    // Create 2d array like this:
    // 11 12 13 14 15
    // 21 22 23 24 25
    // 31 32 33 34 35
    public static int[][] array3x5() {
        int[][] array3x5 = new int[3][5];
        for (int i = 0; i < array3x5.length; i++) {
            for (int j = 0; j < array3x5[i].length; j++) {
                array3x5[i][j] = 10 * (i + 1) + (j + 1);
            }
        }
        return array3x5;
    }

    // Insert a given value at a given position on a given array, move the other
    // elements to the right
    public static int[] insert(int value, int[] array, int position) {
        int[] result = new int[array.length + 1];
        result[position] = value;
        for (int i = 0; i < position; i++) {
            result[i] = array[i];
        }
        for (int i = position + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }

    // Do the same as the above, but keeping the original length
    public static int[] pushInsert(int value, int[] array, int position) {
        int[] result = insert(value, array, position);
        result = Arrays.copyOf(result, result.length - 1);
        return result;
    }

    /*
     * Performs a method called "sequence" that performs a search for the longest
     * increasing
     * sequence in increasing order within an array of integers. The
     * method shall return both the position of the first component of the sequence
     * and its size.
     */
    public static int[] sequence(int[] array) {
        int maxSize = 1;
        int currentSize = 0;
        int chainStart = 0;
        for (int i = 1; i < array.length; i++) {
            while (i < array.length && array[i - 1] < array[i]) {
                currentSize++;
                i++;
            }
            if (currentSize >= maxSize) {
                maxSize = currentSize + 1;
                chainStart = i - currentSize - 1;
            }
            currentSize = 0;
        }
        int[] result = { chainStart, maxSize };
        return result;
    }

    /*
     * Given a vector of integers, write a method that orders the
     * elements of the vector in such a way that the even numbers appear before the
     * the odd numbers. Also, the even numbers must be ordered accordingly in
     * ascending order, while odd numbers should be
     * sorted in descending order.
     */
    public static int[] sortEvenOdd(int[] array) {
        ArrayList<Integer> evenIntegers = new ArrayList<Integer>(3);
        ArrayList<Integer> oddIntegers = new ArrayList<Integer>(3);
        int evens = 0, odds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenIntegers.add(evens, array[i]);
                evens++;
            } else {
                oddIntegers.add(odds, array[i]);
                odds++;
            }
        }
        // Sort even array normally and odd array reversed
        evenIntegers.sort(null);
        Collections.sort(oddIntegers, Collections.reverseOrder());

        // Create an array that has the combined length of the even and odd arrays
        // Note that j = evenIntegers.size and k = oddIntegers.size
        int combinedSize = evens + odds;
        int[] result = new int[combinedSize];
        for (int i = 0; i < evens; i++) {
            result[i] = evenIntegers.get(i);
        }
        int odd_i = 0;
        for (int i = evens; i < combinedSize; i++) {
            // Need a new index to start adding from position 0 of odd array
            result[i] = oddIntegers.get(odd_i);
            odd_i++;
        }
        return result;
    }

    public static int[][] flipDiag(int[][] squareArray) {
        ArrayList<Integer> diagonal = new ArrayList<Integer>(squareArray.length);
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (i == j) {
                    diagonal.add(squareArray[i][j]);
                }
            }
        }
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (i == j) {
                    squareArray[i][j] = diagonal.get(3 - i);
                }
            }
        }
        return squareArray;
    }

    public static int[] flipHalfs(int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length / 2; i++) {
            result[i] = array[array.length / 2 - i - 1];
        }
        int j = 0;
        int middle = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        for (int i = middle; i < array.length; i++) {
            result[i] = array[array.length - j - 1];
            j++;
        }
        return result;
    }

    public static void sieteYMedia() {
        System.out.println("Juguemos a las siete y media");
        int[] cartas = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] baraja = new int[40];
        for (int i = 0; i < baraja.length; i++) {
            baraja[i] = cartas[(int) (Math.random()*10)];
        }
        System.out.println(Arrays.toString(baraja));
        System.out.println("¿Quieres una carta? (s/n)");
        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.nextLine();
        int suma = 0;
        while (respuesta.equals("s")) {
            int carta = baraja[(int) (Math.random()*40)];
            System.out.println("Has sacado un " + carta);
            suma += carta;
            if (suma > 7.5) {
                System.out.println("Te has pasado");
                break;
            }
            System.out.println("¿Quieres otra carta? (s/n)");
            respuesta = teclado.nextLine();
        }
        System.out.println("Tu puntuación es " + suma);
        teclado.close();
    }

    public static boolean has4DigitsFrom(String str, int startIndex) {
        for (int i = startIndex; i < 4; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasN_LettersFrom(String str, int startIndex, int n) {
        for (int i = startIndex; i < n; i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean compruebaMatricula(String matricula) {
        if (matricula.length() == 6) {

            // One letter followed by four digits followed by one letter
            return (hasN_LettersFrom(matricula, 0, 1) &&
                    has4DigitsFrom(matricula, 1) &&
                    hasN_LettersFrom(matricula, 5, 1));

        } else if (matricula.length() == 7) {

            // Four digits followed by three letters
            if (has4DigitsFrom(matricula, 0) &&
                    hasN_LettersFrom(matricula, 4, 3)) {
                return true;
            }

            // One letter followed by four digits followed by two letters
            if (hasN_LettersFrom(matricula, 0, 1) &&
                    has4DigitsFrom(matricula, 1) &&
                    hasN_LettersFrom(matricula, 5, 2)) {
                return true;
            }

            // Two letters followed by four digits followed by one letter
            if (hasN_LettersFrom(matricula, 0, 2) &&
                    has4DigitsFrom(matricula, 2) &&
                    hasN_LettersFrom(matricula, 6, 1)) {
                return true;
            }

        } else if (matricula.length() == 8) {

            // Two letters followed by four digits followed by two letters
            return (hasN_LettersFrom(matricula, 0, 2) &&
                    has4DigitsFrom(matricula, 2) &&
                    hasN_LettersFrom(matricula, 6, 2));

        } else {
            return false;
        }

        return true;
    }

    public static boolean adnChain(String adnString1, String adnString2) {
        // For every index in the first string check if the second string matches
        for (int i = 0; i < adnString2.length(); i++) {
            String substr = adnString2.substring(i, adnString2.length());
            substr += adnString2.substring(0, i);
            if (substr.equals(adnString1)) {
                System.out.println("Match found at index " + i + " of the second DNA chain.");
                return true;
            }
        }
        return false;
    }
}
