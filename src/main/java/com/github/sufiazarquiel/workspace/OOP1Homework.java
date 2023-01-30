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
}
