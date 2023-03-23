package com.github.sufiazarquiel.workspace.oneFilers.tryexcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.github.sufiazarquiel.workspace.Run;

public class Onne {
    // Main method
    public static void main(String[] args) {
        Run obj = new Run();
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            obj.setA(Integer.parseInt(teclado.readLine()));
            teclado.close();
        } catch (NumberFormatException e) {
            System.out.println("Formato numérico incorrecto\n" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error en el teclado\n" + e.getMessage());
        } finally {
            System.out.println("Final value: " + obj.getA());
        }
    }
}
