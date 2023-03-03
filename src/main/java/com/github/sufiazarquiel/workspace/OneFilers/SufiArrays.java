package com.github.sufiazarquiel.workspace.oneFilers;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SufiArrays {

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

    public static void names2DArray() {
        int[][] grades2D = {
                { 8, 6, 9, 3, 9, 2 },
                { 1, 3, 7, 8, 5, 5 },
                { 7, 9, 5, 6, 9, 2 }
        };
        String[] nombres = { "Andrés", "María", "Susana" };
        String[] modulos = {
                "BBDD",
                "Entornos",
                "Programación",
                "Inglés",
                "Sistemas",
                "FOL"
        };

        System.out.println("Listado de modulos que tiene aprobados cada alumno");
        for (int i = 0; i < grades2D.length; i++) {
            System.out.print(nombres[i] + ": ");
            for (int j = 0; j < grades2D[i].length; j++) {
                if (grades2D[i][j] > 4) {
                    System.out.printf("%s ", modulos[j]);
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Listado de los alumnos que han aprobado cada modulo");
        for (int i = 0; i < grades2D[1].length; i++) {
            System.out.print(modulos[i] + ": ");
            for (int j = 0; j < grades2D.length; j++) {
                if (grades2D[j][i] > 4) {
                    System.out.printf("%s ", nombres[j]);
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Nota media de cada alumno");
        for (int i = 0; i < grades2D.length; i++) {
            System.out.print(nombres[i] + ": ");
            double gradeSum = 0;
            for (int j = 0; j < grades2D[i].length; j++) {
                gradeSum += grades2D[i][j];
            }
            System.out.printf("%.2f", gradeSum / grades2D[1].length);
            System.out.println();
        }

        System.out.println();

        System.out.println("Módulo con mejor media");
        double mediaMaxima = 0;
        int moduloMayor = 0;
        for (int i = 0; i < grades2D[1].length; i++) {
            double moduloSum = 0;
            for (int j = 0; j < grades2D.length; j++) {
                moduloSum += grades2D[j][i];
            }
            if (moduloSum / grades2D.length > mediaMaxima) {
                mediaMaxima = moduloSum / grades2D.length;
                moduloMayor = i;
            }
        }
        System.out.printf("%s: %.2f", modulos[moduloMayor], mediaMaxima);
    }

    public static void printRandom3DArray() {
        int[][][] datosUniversidad = new int[5][4][2];
        Random rand = new Random();
        System.out.print("{\n");
        for (int i = 0; i < datosUniversidad.length; i++) {
            System.out.print("{");
            for (int j = 0; j < datosUniversidad[i].length; j++) {
                System.out.print("{");
                for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) {
                    datosUniversidad[i][j][j2] = 17 + rand.nextInt(5);
                    System.out.printf("%d,", datosUniversidad[i][j][j2]);
                }
                System.out.print("},");
            }
            System.out.print("},\n");
        }
        System.out.print("}\n");
    }

    public static void university3DArray() {
        // Datos de una universidad
        String[] gradosStrings = { "Derecho",
                "Industriales",
                "Ingeniería",
                "ADE",
                "Magisterio",
                "Arquitectura" };
        String[] cursoStrings = { "Primero",
                "Segundo",
                "Tercero",
                "Cuarto" };
        String[] sexoStrings = { "Hombres", "Mujeres" };
        // Filas: Grados
        // Columnas: Cursos (1ero a 4rto)
        // Profundidad: Total de hombres 0 y de mujeres 1 en cada curso
        // int[][][] datosUniversidad = {
        // // 5 carreras 4 cursos 2 huecos para hombres y mujeres
        // { { 1, 2 }, { 1, 2 }, { 1, 2 }, { 2, 1 } },
        // { { 1, 1 }, { 2, 1 }, { 1, 1 }, { 1, 2 } },
        // { { 1, 1 }, { 1, 1 }, { 2, 1 }, { 1, 1 } },
        // { { 1, 1 }, { 1, 2 }, { 2, 1 }, { 1, 2 } },
        // { { 2, 1 }, { 1, 1 }, { 1, 2 }, { 1, 2 } }
        // };
        int[][][] datosUniversidad = {
                // 5 carreras 4 cursos 2 huecos para hombres y mujeres
                { { 17, 21 }, { 19, 21 }, { 18, 21 }, { 20, 17 } },
                { { 19, 17 }, { 21, 17 }, { 19, 17 }, { 17, 21 } },
                { { 19, 18 }, { 17, 18 }, { 21, 19 }, { 18, 18 } },
                { { 19, 17 }, { 17, 21 }, { 21, 18 }, { 18, 20 } },
                { { 20, 17 }, { 17, 18 }, { 17, 24 }, { 17, 21 } }
        };
        // Listado de cuantos alumnos hay en cada grado
        for (int i = 0; i < datosUniversidad.length; i++) {
            int alumnos = 0;
            for (int j = 0; j < datosUniversidad[i].length; j++) {
                for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) {
                    alumnos += datosUniversidad[i][j][j2];
                }
            }
            System.out.printf("%s: %d\n", gradosStrings[i], alumnos);
        }
        // Listado de cuantos alumnos hay por curso
        for (int j = 0; j < datosUniversidad[0].length; j++) {
            int alumnos = 0;
            for (int i = 0; i < datosUniversidad.length; i++) {
                for (int j2 = 0; j2 < datosUniversidad[i][j].length; j2++) {
                    alumnos += datosUniversidad[i][j][j2];
                }
            }
            System.out.printf("%s: %d\n", cursoStrings[j], alumnos);
        }
        // Listado de cuantos alumnos hay por sexo
        for (int k = 0; k < datosUniversidad[0][0].length; k++) {
            int alumnos = 0;
            for (int i = 0; i < datosUniversidad.length; i++) {
                for (int j = 0; j < datosUniversidad[j].length; j++) {
                    alumnos += datosUniversidad[i][j][k];
                }
            }
            System.out.printf("%s: %d\n", sexoStrings[k], alumnos);
        }
        // Listado de cuantos alumnos hay por grado y curso
        for (int i = 0; i < datosUniversidad.length; i++) {
            System.out.printf("%s: \n", gradosStrings[i]);
            for (int j = 0; j < datosUniversidad[j].length; j++) {
                int alumnos = 0;
                for (int k = 0; k < datosUniversidad[i][j].length; k++) {
                    alumnos += datosUniversidad[i][j][k];
                }
                System.out.printf("%s: %d ", cursoStrings[j], alumnos);
            }
            System.out.printf("\n");
        }
        // Listado de cuantos alumnos hay por grado y curso
        int difMaxima = 0, cursoDifMaxima = 0, gradoDifMaxima = 0;
        for (int i = 0; i < datosUniversidad.length; i++) {
            for (int j = 0; j < datosUniversidad[j].length; j++) {
                int chicos = datosUniversidad[i][j][0];
                int chicas = datosUniversidad[i][j][1];
                if (Math.abs(chicos - chicas) > difMaxima) {
                    difMaxima = Math.abs(chicos - chicas);
                    gradoDifMaxima = i;
                    cursoDifMaxima = j;
                }
            }
        }
        System.out.printf("Clase de diferencia maxima: %s de %s\nDiferencia maxima: %d", cursoStrings[cursoDifMaxima],
                gradosStrings[gradoDifMaxima], difMaxima);
    }

    public static void pruebaArrayList() {
        // Pide numeros hasta que pongamos cero
        // Se iran guardndo en un arraylist
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        ArrayList<Integer> numeroArrayList = new ArrayList<Integer>(10);
        System.out.println("Para salir introduce un 0");

        do {
            System.out.print("Número entero:");
            num = teclado.nextInt();
            if (!numeroArrayList.contains(num)) {
                numeroArrayList.add(num); 
            }
        } while (num != 0);
        numeroArrayList.remove(Integer.valueOf(0));
        System.out.println("ArrayList: " + numeroArrayList);
        teclado.close();
    }

    // // Array demonstrations
    // public static void main(String[] args) {
    // // Run method
    // university3DArray();
    // }
}
