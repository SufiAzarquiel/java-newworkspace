package com.github.sufiazarquiel.workspace;

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
    public static int maxOf(int... values) {
        int max = values[0];
        for (int value : values) {
            max = maxOf(max, value);
        }
        return max;
    }

    public static void main(String[] args) {
        // Print the sum of 2 and 3
        System.out.printf("The sum of 2 and 3 is %d%n", sumOf(2, 3));

        // Print the sum of 10 and 20
        System.out.printf("The sum of 10.7 and 19.6 is %.1f%n", sumOf(10.7, 19.6));

        // Print the sum of 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10
        System.out.printf("The sum of 1 to 10 is %d%n", sumOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Print the average of 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10
        System.out.printf("The average of 1 to 10 is %.2f%n", averageOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Given an age, prrint whethere the person is an adult or not
        isAdult(17);
        isAdult(18);
        isAdult(19);
        System.out.printf("A person of age 17 is an adult: %b%n", isAdult(17));
        System.out.printf("A person of age 18 is an adult: %b%n", isAdult(18));
        System.out.printf("A person of age 19 is an adult: %b%n", isAdult(19));

        // Given two numbers, return the larger one
        System.out.printf("The larger of 2 and 3 is %d%n", maxOf(2, 3));
        System.out.printf("The larger of 3 and 2 is %d%n", maxOf(3, 2));

        // Given three numbers, return the largest one
        System.out.printf("The largest of 2, 3, and 4 is %d%n", maxOf(2, 3, 4));
        System.out.printf("The largest of 3, 2, and 4 is %d%n", maxOf(3, 2, 4));
        System.out.printf("The largest of 4, 2, and 3 is %d%n", maxOf(4, 2, 3));

        // Given any number of numbers, return the largest one
        System.out.printf("The largest of 2, 3, 4, and 5 is %d%n", maxOf(2, 3, 4, 5));
        System.out.printf("The largest of 3, 2, 4, and 5 is %d%n", maxOf(3, 2, 4, 5));
        System.out.printf("The largest of 4, 2, 3, and 5 is %d%n", maxOf(4, 2, 3, 5));
        System.out.printf("The largest of 5, 2, 3, and 4 is %d%n", maxOf(5, 2, 3, 4));
    }
}
