package com.github.sufiazarquiel.workspace.tryexcept.parking;

import java.util.ArrayList;

public class Parking {
    // Attributes
    private int capacidad;
    private ArrayList<Ticket> tickets;

    // Constructors
    public Parking() {
        this.capacidad = 10;
        this.tickets = new ArrayList<Ticket>();
    }

    public Parking(int capacidad) {
        this.capacidad = capacidad;
        this.tickets = new ArrayList<Ticket>();
    }

    // Getters and Setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    // Methods
    public void add(Ticket ticket) throws TicketException {
        if (this.tickets.size() < this.capacidad) {
            this.tickets.add(ticket);
        } else {
            for (Ticket tick : tickets) {
                if (tick.getMatricula().equals(ticket.getMatricula())) {
                    throw new TicketException("Ya hay un ticket para esta matrícula");
                }
            }
            throw new TicketException("No hay plazas disponibles");
        }
    }

    public void remove(Ticket ticket) {
        if (ticket.isPagado()) {
            this.tickets.remove(ticket);
        } else{
            throw new TicketException("No se puede retirar un ticket sin pagar");
        }
    }

    @Override
    public String toString() {
        return "Parking [capacidad=" + capacidad + ", tickets=" + tickets + "]";
    }
}
