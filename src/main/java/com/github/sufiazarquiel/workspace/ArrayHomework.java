package com.github.sufiazarquiel.workspace;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayHomework {
    public int[] randomIntArray(int LENGTH, int RANGE) {
        Random rd = new Random();
        int[] finalArray = new int[LENGTH];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = rd.nextInt(RANGE);
        }
        System.out.println("Array generado: " + Arrays.toString(finalArray));
        return finalArray;
    }

    /*
     * Ejercicio 1: En un array de 20 elementos hay almacenados números enteros. Haz
     * un programa que pida un número y diga cuantas veces
     * aparece el número dentro del array.
     */
    public void arrEjer1() {
        // Variables y objetos
        Random rd = new Random();
        // Genera un array de 20 numeros aleatorios del 1 al 10
        int[] arrayDeInt = new int[20];
        for (int i = 0; i < arrayDeInt.length; i++) {
            arrayDeInt[i] = rd.nextInt(10);
        }
        int numeroUsuario = 0, total = 0;

        // Objeto para leer lo que teclea el usuario
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println(Arrays.toString(arrayDeInt));
            System.out.print("¿Que número quieres buscar en el array?: ");
            numeroUsuario = teclado.nextInt();
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal
        for (int elementoArray : arrayDeInt) {
            if (elementoArray == numeroUsuario) {
                total++;
            }
        }

        // Resultado
        System.out.printf("El número que buscas aparece %d veces", total);
    }

    /*
     * Ejercicio 2: Dado un array de números enteros, realiza un programa que diga
     * si está
     * ordenado o no.
     */
    public boolean arrEjer2() {
        // Variables
        boolean ordenado = true;
        int[] randArray = randomIntArray(5, 20);

        // Código principal
        for (int i = 1; i < randArray.length; i++) {
            if (randArray[i - 1] > randArray[i]) {
                ordenado = false;
                System.out.println("RandArray desordenado");
                break;
            }
        }
        if (ordenado) {
            System.out.println("Randarray ordenado");
        }

        // Valor final
        return ordenado;
    }

    /*
     * Ejercicio 3: Crea una agenda para almacenar nombres y direcciones de N
     * personas. Después
     * haz un programa que permita ir consultando el nombre y la dirección de las
     * personas almacenadas.
     */
    public void arrEjer3() {
        // Variables
        String[][] agendaStrings = {
                { "Pedro", "Toledo" },
                { "Marta", "Madrid" },
                { "Julia", "Valencia" },
                { "Andrés", "Madrid" },
                { "Saul", "Barcelona" }
        };
        String consulta = new String();

        // Código principal
        System.out.println("Consultando agenda\nPara salir de la consulta puedes escribir EXIT");
        boolean consultando = true;
        Scanner teclado = new Scanner(System.in);
        while (consultando) {
            System.out.print("Introduce un nombre o una dirección: ");
            consulta = teclado.nextLine();
            if (consulta.equals("EXIT")) {
                consultando = false;
            } else {
                boolean encontrado = false;
                for (String[] persona : agendaStrings) {
                    if (Arrays.asList(persona).contains(consulta)) {
                        System.out.printf("Nombre: %s Ciudad: %s\n", persona[0], persona[1]);
                        encontrado = true;
                    }
                }
                if (encontrado == false) {
                    System.out.println("No se ha encontrado el nombre o la dirección");
                }
            }
        }
        teclado.close();
    }

    /*
     * Ejercicio 4: Programa que ordene los índices de un array de enteros. A partir
     * del array
     * original debe generar otro donde aparezcan ordenados los índices de mayor a
     * menor.
     */
    public void arrEjer4() {
        // Variables
        int[] randArray = { 34, 54, 12, 85, 45 };
        int[] indexArray = new int[5];
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = i;
        }
        int itemsLeft = randArray.length;

        // Código principal
        while (itemsLeft > 0) {
            for (int i = 1; i < randArray.length; i++) {
                if (randArray[i - 1] > randArray[i]) {
                    int temp = randArray[i - 1];
                    randArray[i - 1] = randArray[i];
                    randArray[i] = temp;
                    temp = indexArray[i - 1];
                    indexArray[i - 1] = indexArray[i];
                    indexArray[i] = temp;
                }
            }
            itemsLeft--;
        }
        // create copy of indexarray flipped
        int[] indexArrayFlipped = new int[5];
        for (int i = 0; i < indexArray.length; i++) {
            indexArrayFlipped[i] = indexArray[indexArray.length - 1 - i];
        }
        // print indexarrayflipped
        System.out.println(Arrays.toString(indexArrayFlipped));
    }

    /*
     * Ejercicio 5: Dado un array de 50 números entre 1 y 100, Escribir una lista
     * ordenada con los
     * valores que no aparecen en el array.
     */
    public void arrEjer5() {
        // Variables
        int[] fArray = randomIntArray(50, 100);
        int[] indexArray = new int[100];
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = i + 1;
        }

        // Código principal
        Arrays.sort(fArray);
        for (int index : indexArray) {
            int found = Arrays.binarySearch(fArray, index);
            if (found < 0) {
                System.out.printf("%d ", index);
            }
        }
    }

    /*
     * Ejercicio 6: Programa que rellene un array de 4x4 de la siguiente manera:
     * 
     * 1 0 0 0
     * 0 1 0 0
     * 0 0 1 0
     * 0 0 0 1
     */
    public void arrEjer6() {
        // Variables
        int[][] array4x4 = new int[4][4];

        // Código principal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    array4x4[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            // print the array
            System.out.println(Arrays.toString(array4x4[i]));
        }
    }

    /*
     * Ejercicio 7: Dado un array de 3x3 elementos, calcular la suma de sus filas y
     * sus columnas
     * almacenándolas en dos array de 3 elementos.
     */
    public void arrEjer7() {
        // Array de 3x3
        int[][] array3x3 = new int[3][3];
        for (int i = 0; i < array3x3.length; i++) {
            array3x3[i] = randomIntArray(3, 10);
        }

        // Código principal
        int[] sumRows = new int[3];
        int[] sumCols = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array3x3.length; j++) {
                sumCols[i] += array3x3[j][i];
            }
            for (int j = 0; j < array3x3[i].length; j++) {
                sumRows[i] += array3x3[i][j];
            }
        }
        System.out.println("Suma de las filas" + Arrays.toString(sumRows));
        System.out.println("Suma de las columnas" + Arrays.toString(sumCols));
    }

    /*
     * Ejercicio 8: Comprobar si un array de 5x5 es un cuadro mágico. Se considera
     * un cuadro
     * mágico aquel en el que las filas, las columnas y las diagonales suman igual.
     */
    public void arrEjer8() {
        // Array de 3x3
        final int SIZE = 5;
        int[][] array5x5 = new int[SIZE][SIZE];
        for (int i = 0; i < array5x5.length; i++) {
            array5x5[i] = randomIntArray(5, 3);
        }
        // 5 by 5 magic square

        // int[][] array5x5 = {
        // { 17, 24, 1, 8, 15 },
        // { 23, 5, 7, 14, 16 },
        // { 4, 6, 13, 20, 22 },
        // { 10, 12, 19, 21, 3 },
        // { 11, 18, 25, 2, 9 } };

        // Arrays que contienen la suma de cada fila, columna y diagonal
        int[] sumRows = new int[SIZE];
        int[] sumCols = new int[SIZE];
        int[] sumDiag = new int[2];

        // Código principal
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < array5x5.length; j++) {
                sumCols[i] += array5x5[j][i];
            }
            for (int j = 0; j < array5x5[i].length; j++) {
                sumRows[i] += array5x5[i][j];
            }
        }
        for (int j = 0; j < array5x5.length; j++) {
            for (int k = 0; k < array5x5[j].length; k++) {
                if (j == k) {
                    sumDiag[0] += array5x5[j][k];
                }
                if (j + k == 4) {
                    sumDiag[1] += array5x5[j][k];
                }
            }
        }
        System.out.println("Suma de las filas" + Arrays.toString(sumRows));
        System.out.println("Suma de las columnas" + Arrays.toString(sumCols));
        System.out.println("Suma de las diagonales" + Arrays.toString(sumDiag));
        // Check if all sums are equal
        boolean isMagicSquare = true;
        for (int i = 0; i < sumRows.length; i++) {
            if (sumRows[i] != sumCols[i] || sumRows[i] != sumDiag[0] || sumRows[i] != sumDiag[1]) {
                isMagicSquare = false;
                break;
            }
        }
        System.out.println("El array es un cuadro mágico: " + isMagicSquare);
    }

    /*
     * Ejercicio 9: Programa que mezcla dos arrays ordenados de N elementos,
     * consiguiendo un
     * array de N*2 elementos igualmente ordenados.
     */
    public void arrEjer9() {
        // two arrays of 5 elements
        int[] array1 = randomIntArray(5, 10);
        int[] array2 = randomIntArray(5, 10);
        // sort arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Código principal
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            if (i < 5) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i % 5];
            }
        }

        // Print arrays
        System.out.println("Array 3: " + Arrays.toString(array3));
    }

    /*
     * Ejercicio 10: Descripción
     */
    public void arrEjer10() {
        // Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura.
        // 0 1 2 3 4
        // 1 2 3 4 3
        // 2 3 4 3 2
        // 3 4 3 2 1
        // 4 3 2 1 0
        int[][] array5x5 = new int[5][5];

        // Código principal
        for (int i = 0; i < array5x5.length; i++) {
            for (int k = 0; k < array5x5[i].length; k++) {
                if (k + i <= 4) {
                    array5x5[i][k] = k + i;
                } else {
                    array5x5[i][k] = 4 - (k + i) % 4;
                }
            }
        }
        array5x5[4][4] = 0;

        // Print array
        for (int i = 0; i < array5x5.length; i++) {
            for (int k = 0; k < array5x5[i].length; k++) {
                System.out.print(array5x5[i][k] + " ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 11: Elabora un programa al que se le pasa un array de 2 dimensiones
     * y averigua si es
     * simétrica, retornando un valor booleano. Un array es simétrico si contiene
     * los
     * mismos valores por encima y por debajo de la diagonal principal.
     */
    public boolean arrEjer11() {
        // Flag marking whether the arrayList is symmetric
        boolean isSymmetric = true;

        // Array of 5x5
        final int SIZE = 5;
        int[][] array5x5 = new int[SIZE][SIZE];
        for (int i = 0; i < array5x5.length; i++) {
            array5x5[i] = randomIntArray(5, 10);
        }

        // Symetric array
        // int[][] array5x5 = {
        // { 1, 2, 3, 4, 5 },
        // { 2, 3, 4, 5, 4 },
        // { 3, 4, 5, 4, 3 },
        // { 4, 5, 4, 3, 2 },
        // { 5, 4, 3, 2, 1 } };

        // Código principal
        for (int i = 0; i < array5x5.length; i++) {
            for (int j = 0; j < array5x5[i].length; j++) {
                if (i != j && array5x5[i][j] != array5x5[j][i]) {
                    isSymmetric = false;
                }
            }
        }

        System.out.println("Array es simetrico: " + isSymmetric);
        return isSymmetric;
    }

    /*
     * Ejercicio 12: Programa que lea números enteros hasta que se escriba el -1.
     * Los números deben
     * ir quedando almacenados en un array. Como no sabemos los números que van a
     * teclear el array debe ir cambiando de tamaño para irse adaptando al numero de
     * datos leídos.
     */
    public void arrEjer12() {
        // Variables
        int num = 0;
        int[] intArray = new int[1];

        // Leer lo que teclea el usuario hasta que introduzca -1
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        intArray[0] = num;
        do {
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            if (num == -1) {
                break;
            }
            intArray = Arrays.copyOf(intArray, intArray.length + 1);
            intArray[intArray.length - 1] = num;
        } while (true);
        teclado.close();

        // Print array
        System.out.println(Arrays.toString(intArray));
    }

    /*
     * Ejercicio 13: Crea un programa que almacene un array bidimensional (6x6) con
     * pocos valores
     * en un array unidimensional. En el array unidimensional vamos almacenando
     * cada valor original junto con su fila y columna, es decir por cada valor del
     * array
     * original almacenamos tres valores en el resultado.
     * 
     * Array original
     * 0 0 0 0 0 0
     * 0 0 0 0 5 0
     * 0 8 0 0 0 9
     * 0 0 0 0 0 0
     * 0 0 0 7 0 0
     * 0 0 3 0 0 0
     */
    public void arrEjer13() {
        // Array original
        int[][] array6x6 = new int[6][6];
        array6x6[1][4] = 5;
        array6x6[2][1] = 8;
        array6x6[2][5] = 9;
        array6x6[4][3] = 7;
        array6x6[5][2] = 3;
        // Código principal
        int[] array1x18 = new int[18];
        int index = 0;
        for (int i = 0; i < array6x6.length; i++) {
            for (int j = 0; j < array6x6[i].length; j++) {
                if (array6x6[i][j] != 0) {
                    array1x18[index] = array6x6[i][j];
                    array1x18[index + 1] = i;
                    array1x18[index + 2] = j;
                    index += 3;
                }
            }
        }
        // Print array
        System.out.println(Arrays.toString(array1x18));
    }

    /*
     * Ejercicio 14: Programa que simule el juego de las minas. El programa
     * rellenará de forma
     * aleatoria un array de 5x5 con 10 minas. Una vez relleno, pedirá que
     * escribamos
     * coordenada y mostrará el mensaje MINA, en caso de haber pisado una, o bien un
     * numero que indica cuantas minas hay alrededor.
     * 0 1 1 0 0
     * 1 0 1 0 1
     * 1 1 0 0 0
     * 0 0 0 0 1
     * 0 0 1 0 1
     * 
     * Ejemplo:
     * Coordenada Respuesta
     * (1,4) MINA
     * (1,1) 6
     */
    public void arrEjer14() {
        // Mapa
        int[][] array5x5 = new int[5][5];
        // fill array with 0 and 1 randomly
        for (int i = 0; i < array5x5.length; i++) {
            for (int j = 0; j < array5x5[i].length; j++) {
                array5x5[i][j] = (int) (Math.random() * 2);
            }
        }
    }
}
