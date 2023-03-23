package com.github.sufiazarquiel.workspace.oneFilers.tryexcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.github.sufiazarquiel.workspace.Run;

public class Ttwo {
    // Main method
    public static void main(String[] args) {
        Run obj = new Run();
        for (int i = 0; i < 8; i++) {
            obj.addToArray(((int) (Math.random() * 10) + 15), i);
        }
        try {
            // Obtener el valor de la posición indicada
            // Gestionar posibles errores
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("¿Que posición quieres ver?");
            obj.setA(Integer.parseInt(teclado.readLine()));
            teclado.close();
            obj.getIntAtArray(obj.getA());

        } catch (NumberFormatException e) {
            System.out.println("Asegurate de escribir el número bien\n" + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error en el teclado\n" + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Asegurate de que el número está dentro del rango (0 a 8)\n" + e.getMessage());

        } finally {
            System.out.println("Final value: " + obj.getA());

        }
    }
}
