package com.github.sufiazarquiel.workspace.tryexcept.parking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    void testCalcularPrecio() {
        Date ayer = new Date();
        ayer.setTime(ayer.getTime() - (4 * 60 * 60 * 1000) - (1 * 30 * 60 * 1000));
        Ticket ticket = new Ticket("1234ABC", ayer);
        ticket.setPagado(true);
        assertEquals((4 * Ticket.precioHora + 30 * Ticket.precioMinuto), ticket.calcularPrecio());
        
    }
}
