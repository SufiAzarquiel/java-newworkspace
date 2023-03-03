package com.github.sufiazarquiel.workspace.oneFilers;

import java.util.Arrays;

public class ExamenFeb {
    public static void ejercicio1() {
        /*
         * Los exámenes tipo test son fáciles de realizar, simplemente hay que marcar
         * una de las 4 opciones
         * para cada pregunta. El proceso de corregir se realizará de forma
         * automatizada, sabiendo que cada
         * pregunta acertada vale un punto, y cada pregunta fallada resta 1/3.
         * A veces los alumnos no contestan todas las preguntas, y esas ni suman ni
         * restan.
         * Disponemos de un array de soluciones, donde aparece la solución a todas las
         * preguntas:
         * 0 1 2 3 4 5 6 7 8 9
         * A C B B D A D C A D
         * 
         * Y otro donde están las respuestas del alumno:
         * 
         * 0 1 2 3 4 5 6 7 8 9
         * A - B D D B D C B C
         * 1 0 1 - 1 - 1 1 - -
         * Realiza un programa que calcule la calificación obtenida por el alumno. Se
         * calculará la
         * calificación teniendo en cuenta los aciertos, los errores, y las preguntas
         * que no están contestadas.
         * Cuando la pregunta no está contestada, aparece un símbolo “-“ en la casilla
         * correspondiente. Los
         * arrays son de tipo char.
         */
        char[] soluciones = { 'A', 'C', 'B', 'B', 'D', 'A', 'D', 'C', 'A', 'D' };
        char[] respuestas = { 'A', '-', 'B', 'D', 'D', 'B', 'D', 'C', 'B', 'C' };
        double nota = 0;

        // Comparar cada respuesta con la solucion correspondiente
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == soluciones[i]) {
                nota++;
            } else if (respuestas[i] != '-') {
                nota -= 1.0 / 3;
            }
        }

        // Imprimo la nota final con dos decimales
        System.out.printf("Nota: %.2f", nota);
    }

    public static void ejercicio1Copilot() {
        /*
         * Los exámenes tipo test son fáciles de realizar, simplemente hay que marcar
         * una de las 4 opciones
         * para cada pregunta. El proceso de corregir se realizará de forma
         * automatizada, sabiendo que cada
         * pregunta acertada vale un punto, y cada pregunta fallada resta 1/3.
         * A veces los alumnos no contestan todas las preguntas, y esas ni suman ni
         * restan.
         * Disponemos de un array de soluciones, donde aparece la solución a todas las
         * preguntas:
         * 0 1 2 3 4 5 6 7 8 9
         * A C B B D A D C A D
         * 
         * Y otro donde están las respuestas del alumno:
         * 
         * 0 1 2 3 4 5 6 7 8 9
         * A - B D D B D C B C
         * 1 0 1 - 1 - 1 1 - -
         * Realiza un programa que calcule la calificación obtenida por el alumno. Se
         * calculará la
         * calificación teniendo en cuenta los aciertos, los errores, y las preguntas
         * que no están contestadas.
         * Cuando la pregunta no está contestada, aparece un símbolo “-“ en la casilla
         * correspondiente. Los
         * arrays son de tipo char.
         */
        /*
         * Los exámenes tipo test son fáciles de realizar, simplemente hay que marcar
         * una de las 4 opciones
         * para cada pregunta. El proceso de corregir se realizará de forma
         * automatizada, sabiendo que cada
         * pregunta acertada vale un punto, y cada pregunta fallada resta 1/3.
         * A veces los alumnos no contestan todas las preguntas, y esas ni suman ni
         * restan.
         * Disponemos de un array de soluciones, donde aparece la solución a todas las
         * preguntas:
         * 0 1 2 3 4 5 6 7 8 9
         * A C B B D A D C A D
         * 
         * Y otro donde están las respuestas del alumno:
         * 
         * 0 1 2 3 4 5 6 7 8 9
         * A - B D D B D C B C
         * 1 0 1 - 1 - 1 1 - -
         * Realiza un programa que calcule la calificación obtenida por el alumno. Se
         * calculará la
         * calificación teniendo en cuenta los aciertos, los errores, y las preguntas
         * que no están contestadas.
         * Cuando la pregunta no está contestada, aparece un símbolo “-“ en la casilla
         * correspondiente. Los
         * arrays son de tipo char.
         */
        char[] soluciones = { 'A', 'C', 'B', 'B', 'D', 'A', 'D', 'C', 'A', 'D' };
        char[] respuestas = { 'A', '-', 'B', 'D', 'D', 'B', 'D', 'C', 'B', 'C' };
        double nota = 0;

        // Comparar cada respuesta con la solucion correspondiente
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == soluciones[i]) {
                nota++;
            } else if (respuestas[i] != '-') {
                nota -= 1.0 / 3;
            }
        }

        // Imprimo la nota final con dos decimales
        System.out.printf("Nota: %.2f", nota);
    }

    public static void ejercicio2Copilot() {
        /*
         * Realiza un programa que calcule el centro de masas de un array de 10 valores
         * enteros. El
         * programa debe crear el array de 10 valores, rellenarlo con valores entre 1 y
         * 99 de forma
         * aleatoria, y luego calcular el centro de masas.
         * Para calcular el centro de masas, hay que hacer la suma de los valores que
         * están por delante
         * y por detrás de cada elemento del array. El centro de masas será el que menos
         * diferencia
         * tenga entre la suma de la parte izquierda y la derecha del array.
         * Ejemplo: Para el siguiente array
         * 0 1 2 3 4 5 6 7 8 9
         * 16 10 23 46 9 21 18 45 70 29
         * Suma 125 Suma 144
         * El centro de masas está en la posición 6, con una diferencia de 19.
         */
        int[] array = new int[10];
        int sumaIzquierda = 0;
        int sumaDerecha = 0;
        int centroMasas = 0;
        int diferencia = 0;
        int diferenciaMinima = 0;

        // Relleno el array con valores aleatorios entre 1 y 99
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }

        // Calculo la suma de la derecha
        for (int i = 0; i < array.length; i++) {
            sumaDerecha += array[i];
        }

        // Calculo la suma de la izquierda y la derecha

        for (int i = 0; i < array.length; i++) {
            sumaIzquierda += array[i];
            sumaDerecha -= array[i];
            diferencia = Math.abs(sumaIzquierda - sumaDerecha);
            if (i == 0) {
                diferenciaMinima = diferencia;
            } else if (diferencia < diferenciaMinima) {
                diferenciaMinima = diferencia;
                centroMasas = i;
            }
        }

        // Imprimo el array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Imprimo el centro de masas
        System.out.println("Centro de masas: " + centroMasas);


    }

    public static void ejercicio2() {
        /*
         * Realiza un programa que calcule el centro de masas de un array de 10 valores
         * enteros. El
         * programa debe crear el array de 10 valores, rellenarlo con valores entre 1 y
         * 99 de forma
         * aleatoria, y luego calcular el centro de masas.
         * Para calcular el centro de masas, hay que hacer la suma de los valores que
         * están por delante
         * y por detrás de cada elemento del array. El centro de masas será el que menos
         * diferencia
         * tenga entre la suma de la parte izquierda y la derecha del array.
         * Ejemplo: Para el siguiente array
         * 0 1 2 3 4 5 6 7 8 9
         * 16 10 23 46 9 21 18 45 70 29
         * Suma 125 Suma 144
         * El centro de masas está en la posición 6, con una diferencia de 19.
         */
        // Crear array con valores aleatorios
        // Valores para comprobar que lo he hecho bien, en el for cambian
        int[] valores = { 16, 10, 23, 46, 9, 21, 18, 45, 70, 29 };
        // Asignar cada posicion con un valor aleatorio del 1 al 99
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 98 + 1);
        }
        System.out.println("Array: " + Arrays.toString(valores));

        int sumaIzquierda = 0, sumaDerecha = 0;
        // Empieza siendo un numero muy grande para no intervenir
        int minDiferencia = 5000;
        int centroMasas = 0;
        for (int i = 0; i < valores.length; i++) {
            // Calcular suma de la izquierda
            for (int j = 0; j < i; j++) {
                sumaIzquierda += valores[j];
            }
            // Calcular suma de la derecha
            for (int j = i + 1; j < valores.length; j++) {
                sumaDerecha += valores[j];
            }
            if (Math.abs(sumaIzquierda - sumaDerecha) < minDiferencia) {
                minDiferencia = Math.abs(sumaIzquierda - sumaDerecha);
                centroMasas = i;
            }
            sumaIzquierda = 0;
            sumaDerecha = 0;
        }

        System.out.printf("Centro de masas esta en la posicion %d con una diferencia de %d", centroMasas,
                minDiferencia);
    }
}
