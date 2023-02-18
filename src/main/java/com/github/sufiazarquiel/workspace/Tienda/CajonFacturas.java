package com.github.sufiazarquiel.workspace.Tienda;

import java.util.ArrayList;
import java.util.Date;

public class CajonFacturas {
    // Attributes
    private ArrayList<Factura> facturas;

    // Constructor
    public CajonFacturas() {
        this.facturas = new ArrayList<Factura>();
    }

    // Methods
    public void añadir(Factura factura) {
        facturas.add(factura);
    }

    public Factura buscar(int index) {
        for (Factura factura : facturas) {
            if (factura.getNumeroFactura() == index) {
                return factura;
            }
        }
        return null;
    }

    public Factura buscar(Date fecha) {
        for (Factura factura : facturas) {
            if (fecha.equals(factura.getFecha())) {
                return factura;
            }
        }
        return null;
    }
}
