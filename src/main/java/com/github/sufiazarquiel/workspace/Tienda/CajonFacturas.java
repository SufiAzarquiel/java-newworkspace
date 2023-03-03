package com.github.sufiazarquiel.workspace.tienda;

import java.util.ArrayList;
import java.util.Date;

public class CajonFacturas {
    // Attributes
    private ArrayList<Factura> facturas;

    // Constructor
    public CajonFacturas() {
        this.facturas = new ArrayList<Factura>();
    }

    public CajonFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    // Methods
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    @Override
    public String toString() {
        return "CajonFacturas [facturas=" + facturas + "]";
    }

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

    /**
     * Busca una factura por su fecha de emisión
     * 
     * @param fecha
     * @return Array de objetos Factura
     */
    public ArrayList<Factura> buscar(Date fecha) {
        ArrayList<Factura> facturasEncontradas = new ArrayList<Factura>();
        for (Factura factura : facturas) {
            if (fecha.equals(factura.getFecha())) {
                facturasEncontradas.add(factura);
            }
        }
        return facturasEncontradas;
    }

    /**
     * Obtener facturas pendientes de pago
     * 
     * @return Array de objetos Factura
     */
     public ArrayList<Factura> facturasPendientes() {
        ArrayList<Factura> facturasPendientes = new ArrayList<Factura>();
        for (Factura factura : facturas) {
            if (factura.isPagada() == false) {
                facturasPendientes.add(factura);
            }
        }
        return facturasPendientes;
     }
}
