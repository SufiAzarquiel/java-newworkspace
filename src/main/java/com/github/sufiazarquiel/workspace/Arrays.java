package com.github.sufiazarquiel.workspace;

public class Arrays {

    public static void demoOne() {
        // Individual variable
        int a = 2;

        // Array declaration

        // One-dimensional array
        int b[] = new int[5];

        // Access with the for-each loop
        int j = 1;
        for (int i : b) {
            i = j * a;
            j++;
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Multi-dimensional array
        int c[][] = new int[3][3];

        // Access with nested "for" loop
        for (int[] row : c) {
            int i = 1;
            for (int column : row) {
                column = 1 * i;
                i++;
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void mediaTemperaturas() {
        // Array containing the temperatures of each day (Celsius)
        int[] decemberTemperatures = { 15, 18, 16, 17, 13, 12, 17, 15, 19 };
        double averageTemperature = 0; // Average temperature
        int minTemperature = decemberTemperatures[1], maxTemperature = 0;

        // Loop through every day and sum it to the average variable
        for (int dayTemperature : decemberTemperatures) {
            averageTemperature += dayTemperature;
            if (dayTemperature > maxTemperature) {
                maxTemperature = dayTemperature;
            }
            if (dayTemperature < minTemperature) {
                minTemperature = dayTemperature;
            }
        }

        averageTemperature /= decemberTemperatures.length;
        System.out.println("Average temperature: " + averageTemperature);
        System.out.println("Minimum temperature: " + minTemperature);
        System.out.println("Maximum temperature: " + maxTemperature);
    }

    // Array demonstrations
    public static void main(String[] args) {
        mediaTemperaturas();
    }
}
