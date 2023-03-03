package com.github.sufiazarquiel.workspace.oneFilers;

public class SufiOOP1 {
    // Sum of two double values
    public static double sumOf(double a, double b) {
        return a + b;
    }

    // Sum of two integer values
    public static int sumOf(int a, int b) {
        return a + b;
    }

    // Sum of any number of integer values
    public static int sumOf(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    // Average of any number of double values
    public static double averageOf(double... values) {
        double sum = 0;
        for (double d : values) {
            sum += d;
        }
        return sum / values.length;
    }

    // Given an age, print whether the person is an adult or not
    public static boolean isAdult(int age) {
        System.out.printf("The person is %d years old%n", age);
        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.printf("The person is an adult%n");
        } else {
            System.out.printf("The person is not an adult%n");
        }
        return isAdult;
    }

    // Given two numbers, return the larger one
    public static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Given three numbers, return the largest one
    public static int maxOf(int a, int b, int c) {
        return maxOf(maxOf(a, b), c);
    }

    // Given any number of numbers, return the largest one
    public static int maxOf(int... intArray) {
        int max = intArray[0];
        for (int value : intArray) {
            max = maxOf(max, value);
        }
        return max;
    }

    // Count the number of vowels in a string
    public static int countVowels(String inputString) {
        int total = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if ("aiueoAIUEO".indexOf(inputString.charAt(i)) != -1) {
                total++;
            }
        }
        return total;
    }

    // Given a string, return the last word
    public static String lastWord(String inputString) {
        // String[] words = inputString.split(" ");
        // return words[words.length - 1];
        return inputString.substring(inputString.lastIndexOf(" ") + 1);
    }

    public static StringBuilder endDot(StringBuilder inpStringBuilder){
        StringBuilder resultado = new StringBuilder(inpStringBuilder);
        return resultado.append(". (This is the copy)");
    }
}
