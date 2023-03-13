package com.github.sufiazarquiel.workspace.transporte;

public class Run {
    public static void main(String[] args) {
        // Create conductor
        Conductor driver = new Conductor("Jose", "12345678A");
        Conductor driver2 = new Conductor("Pedro", "87654321B");

        // Create transportes and add them to driver's ficha
        TransporteViajeros bus = new TransporteViajeros("Bus", 120, 10);
        TransporteViajeros bus2 = new TransporteViajeros("Bus", 40, 50);
        TransporteMercancia camion = new TransporteMercancia("Camion", 100, 100);
        TransporteMercancia camion2 = new TransporteMercancia("Camion", 20, 60);
        TransporteMercanciaPeligrosa camionPeligroso = new TransporteMercanciaPeligrosa("Camion", 30, 45);
        driver.getFicha().addTransporte(bus);
        driver.getFicha().addTransporte(camionPeligroso);
        driver.getFicha().addTransporte(camion2);
        driver2.getFicha().addTransporte(bus2);
        driver2.getFicha().addTransporte(camion);

        // Print fichas
        System.out.println(driver.getFicha());
        System.out.println(driver2.getFicha());

        // Print sueldos
        System.out.println("Sueldo de " + driver.getNombre() + ": " + driver.getFicha().getSueldo());
        System.out.println("Sueldo de " + driver2.getNombre() + ": " + driver2.getFicha().getSueldo());
    }
}
