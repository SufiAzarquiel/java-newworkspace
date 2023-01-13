package com.github.sufiazarquiel.workspace;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class OldArrayHomework {
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

    // Introduce un número -> ejecuta el ejercicio correspondiente
    public static void runArr() {
        System.out.println("Arrays");

        // Scanner teclado = new Scanner(System.in);
        // System.out.println("¿Qué ejercicio quieres ejecutar?");

        // int num = teclado.nextInt();

        // arrEjer1();
        // switch (num) {
        // case 1:
        // arrEjer1();
        // break;
        // case 2:
        // arrEjer1();
        // break;
        // case 3:
        // arrEjer1();
        // break;
        // case 4:
        // arrEjer1();
        // break;
        // case 5:
        // arrEjer1();
        // break;
        // case 6:
        // arrEjer1();
        // break;
        // case 7:
        // arrEjer1();
        // break;
        // case 8:
        // arrEjer1();
        // break;
        // case 9:
        // arrEjer1();
        // break;
        // case 10:
        // arrEjer1();
        // break;

        // default:
        // System.out.println("Ese ejercicio no existe.");
        // break;
        // }

        // teclado.close();
    }

}
