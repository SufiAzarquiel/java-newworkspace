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

    public static void temperature() {
        // Array containing the temperatures of each day (Celsius)
        int[] decemberTemperatures = { 15, 18, 16, 17, 13, 12, 17, 15, 19 };
        double averageTemperature = 0;
        int minTemperature = decemberTemperatures[1], maxTemperature = 0;
        // Loop through every day and:
        //// add it to the average variable
        //// compare it to current min and max (swap values if needed)
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

    public static void minTemperature() {
        // Array containing the temperatures of each day (Celsius)
        int[] weekTemperatures = { 15, 18, 16, 17, 13, 12, 17 };
        int minTemperature = weekTemperatures[1];
        int coldestDay = 0;

        // Loop through every day and:
        //// add it to the average variable
        //// compare it to current min and max (swap values if needed)
        for (int i = 0; i < weekTemperatures.length; i++) {
            if (weekTemperatures[i] < minTemperature) {
                minTemperature = weekTemperatures[i];
                coldestDay = i;
            }
        }
        String[] dayStrings = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
        System.out.println("Minimum temperature: " + minTemperature);
        System.out.println("Coldest day: " + dayStrings[coldestDay]);
    }

    public static void grades() {
        // Operate on two arrays simultaneously
        // One contains grades and the other one contains module names
        int[] grades = { 8, 6, 10, 3, 9, 2 };
        String[] moduleStrings = { "BDD", "Entornos", "Programación", "Inglés", "SISI", "FOL" };

        // List all the modules with passing gradeson screen
        System.out.println("────────Asignaturas aprobadas────────");
        for (int i = 0; i < moduleStrings.length; i++) {
            if (grades[i] > 4) {
                System.out.println(moduleStrings[i]);
            }
        }

        // Print favourite module (the one with greatest grade)
        int maxGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = i;
            }
        }
        System.out.println("─────────Asignatura favorita─────────\n" + moduleStrings[maxGrade]);
    }

    public static void grades2DArray() {
        // Operate on a 2d array
        int[][] grades2D = {
                { 8, 6, 9, 3, 9, 2 },
                { 1, 3, 7, 8, 5, 2 },
                { 7, 9, 5, 6, 9, 2 }
        };

        System.out.println("Array size: " + grades2D.length);
        int total_Length = 0;
        for (int[] gradesOn : grades2D) {
            total_Length += gradesOn.length;
        }
        System.out.println("Combined size: " + total_Length);

        // COunt all passing grades
        int passingGrades = 0;
        for (int[] gradesOn : grades2D) {
            for (int grade : gradesOn) {
                if (grade > 4) {
                    passingGrades++;
                }
            }
        }
        System.out.println("Total asignaturas aprobadas: " + passingGrades);

        // Compute combined grades on each row
        int combinedGrade = 0;
        for (int i = 0; i < grades2D.length; i++) {
            for (int j = 0; j < grades2D[i].length; j++) {
                combinedGrade += grades2D[i][j];
            }
            System.out.println("Fila " + i + ": " + combinedGrade);
            combinedGrade = 0;
        }

        for (int j = 0; j < grades2D[1].length; j++) {
            for (int i = 0; i < grades2D.length; i++) {
                combinedGrade += grades2D[i][j];
            }
            System.out.println("Columna " + j + ": " + combinedGrade);
            combinedGrade = 0;
        }

    }
}
