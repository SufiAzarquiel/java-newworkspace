package com.github.sufiazarquiel.workspace.viviendasModulares;

public class Run {
    public static void main(String[] args) {
        // Create different types of objects Estancia and assign them
        // to Vivienda objects
        Vivienda casa = new Vivienda();
        casa.addEstancia(new Bano(10, 2, 1000, true));
        casa.addEstancia(new Cocina(20, 4, 2000, 5));
        casa.addEstancia(new Dormitorio(30, 6, 3000, 2));
        casa.addEstancia(new Dormitorio(40, 8, 3500, 5));
        casa.addEstancia(new Dormitorio(20, 2, 2800, 3));
        casa.addEstancia(new Salon(40, 8, 4000));
        System.out.println(casa.imprimirVivienda());
        System.out.println("Numero de camas: " + casa.getNumeroCamas());
        System.out.println("Coste total: " + casa.costeTotal());


        // Repeat but with the numeroVentanas attribute set to 0
        Vivienda casa2 = new Vivienda();
        casa2.addEstancia(new Bano(10, 0, 1000, true));
        casa2.addEstancia(new Cocina(20, 0, 2000, 5));
        casa2.addEstancia(new Dormitorio(30, 0, 3000, 2));
        casa2.addEstancia(new Dormitorio(40, 0, 3500, 5));
        casa2.addEstancia(new Dormitorio(20, 0, 2800, 3));
        casa2.addEstancia(new Salon(40, 0, 4000));
        System.out.println(casa2.imprimirVivienda());
        System.out.println("Numero de camas: " + casa2.getNumeroCamas());
        System.out.println("Coste total: " + casa2.costeTotal());

        // Repeat but with default constructors
        Vivienda casa3 = new Vivienda();
        casa3.addEstancia(new Bano());
        casa3.addEstancia(new Cocina());
        casa3.addEstancia(new Dormitorio());
        casa3.addEstancia(new Dormitorio());
        casa3.addEstancia(new Dormitorio());
        casa3.addEstancia(new Salon());
        System.out.println(casa3.imprimirVivienda());
        System.out.println("Numero de camas: " + casa3.getNumeroCamas());
        System.out.println("Coste total: " + casa3.costeTotal());

        System.out.println("Estancia numero 3: " + casa.getEstancia(3));
    }
}
