package com.github.sufiazarquiel.workspace.tryexcept.parking;

public class TicketException extends RuntimeException {
    // Constructors
    public TicketException() {
        super();
    }

    public TicketException(String message) {
        super(message);
    }

    public TicketException(String message, Throwable cause) {
        super(message, cause);
    }

    public TicketException(Throwable cause) {
        super(cause);
    }
}
