package com.github.sufiazarquiel.workspace;

public class OOP1Homework {
    public static boolean esVocal(String s) {
        if ("AIUEOaiueo".contains(String.valueOf(s.charAt(0)))) {
            return true;
        } else {
            return false;
        }
    }

    public static double grados(double celsius) {
        return 9 * celsius / 5 + 32;
    }

    public static double redondear(float num, int decimalPlaces) {
        return Double.parseDouble(String.format("%.3f", num));
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
    // uppercase letter;
    
}
