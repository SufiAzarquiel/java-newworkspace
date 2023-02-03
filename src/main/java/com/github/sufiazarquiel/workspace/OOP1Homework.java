package com.github.sufiazarquiel.workspace;

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

    public static boolean has4DigitsFrom(String str, int startIndex) {
        for (int i = startIndex; i < 4; i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean esMatriculaValida(String matricula) {
        // Si la matricula empieza por una cifra
        if (Character.isDigit(matricula.charAt(0))) {
            // Comprobar que tiene longitud válida
            if (matricula.length() != 7) {
                return false;
            }
            // Comprobar que empieza con cuatro cifras
            if (!has4DigitsFrom(matricula, 0)) {
                return false;
            }
            // Comprobar que termina con tres letras
            for (int i = 1; i <= 3; i++) {
                if (Character.isDigit(matricula.charAt(matricula.length() - i))) {
                    return false;
                }
            }
        } else {
            // El resto de condiciones se resumen en que es una matricula valida si:
            // Empieza por una o dos letras, seguida(s) de 4 cifras | no empieza por tres
            // letras
            // Acaba en una o dos letras | no acaba en 3 letras

            if (Character.isAlphabetic(matricula.charAt(2))) {
                return false;
            }
            if (Character.isAlphabetic(matricula.charAt(matricula.length() - 3))) {
                return false;
            }
            if (Character.isDigit(matricula.charAt(1))) {
                if (!has4DigitsFrom(matricula, 1)) {
                    return false;
                }
            }
            if (Character.isDigit(matricula.charAt(2))) {
                if (!has4DigitsFrom(matricula, 2)) {
                    return false;
                }
            }
        }

        return true;
    }

    /*
     * Create a method that checks if a given string is a valid car plate number.
     * Valid car plate numbers are of the form:
     * 4 digits followed by 3 letters
     * 1 or 2 letters followed by 4 digits followed by 1 or 2 letters
     */
    public static boolean checkPlate(String plate) {
        // Check if the plate is valid
        if (plate.length() != 7 && plate.length() != 8) {
            return false;
        }
        // Check if the first 4 characters are digits
        if (has4DigitsFrom(plate, 0)) {
            // Check if the last 3 characters are letters
            for (int i = 4; i < plate.length(); i++) {
                if (Character.isDigit(plate.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        // Check if the first 2 characters are letters
        if (Character.isAlphabetic(plate.charAt(0)) && Character.isAlphabetic(plate.charAt(1))) {
            // Check if the next 4 characters are digits
            if (has4DigitsFrom(plate, 2)) {
                // Check if the last 2 characters are letters
                for (int i = 6; i < plate.length(); i++) {
                    if (Character.isDigit(plate.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        // Check if the first character is a letter
        if (Character.isAlphabetic(plate.charAt(0))) {
            // Check if the next 4 characters are digits
            if (has4DigitsFrom(plate, 1)) {
                // Check if the last character is a letter
                if (Character.isAlphabetic(plate.charAt(5))) {
                    return true;
                }
            }
        }
        return false;
    }
}
