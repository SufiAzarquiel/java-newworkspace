package com.github.sufiazarquiel.workspace.oneFilers.tryexcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.github.sufiazarquiel.workspace.Run;

public class Threee {
    // Main method
    public static void main(String[] args) {
        // Another way to do it would be to throw the exceptions here as well
        // Would not be the best way to do it
        Run obj = new Run();
        // In real life you would use the method itself to deal with the exceptions
        // This is not the ideal way to do it, its just an example of the throws keyword
        try {
            obj.setA(readInteger());
        } catch (NumberFormatException e) {
            System.out.println("Formato numérico incorrecto\n" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error en el teclado\n" + e.getMessage());
        } finally {
            System.out.println("Final value: " + obj.getA());
        }
    }

    public static int readInteger() throws NumberFormatException, IOException {
        Run obj = new Run();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        obj.setA(Integer.parseInt(teclado.readLine()));
        teclado.close();
        return obj.getA();
    }
}
