package com.github.sufiazarquiel.workspace.tryexcept.amigos;

public class NoMeGustaTuNombreException extends Exception {
    // Constructors
    public NoMeGustaTuNombreException() {
    }

    public NoMeGustaTuNombreException(String arg0) {
        super(arg0);
    }

    public NoMeGustaTuNombreException(Throwable arg0) {
        super(arg0);
    }

    public NoMeGustaTuNombreException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public NoMeGustaTuNombreException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}
