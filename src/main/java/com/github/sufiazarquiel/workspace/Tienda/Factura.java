package com.github.sufiazarquiel.workspace.Tienda;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    // Attributes
    private Date fecha;
    private int numeroFactura;
    private ArrayList<LineaFactura> lineasFactura;
    private boolean pagada;

    // Constructor
    public Factura(Date fecha, int numeroFactura) {
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.lineasFactura = new ArrayList<LineaFactura>();
        this.pagada = false;
    }

    // Methods
    public Date getFecha() {
        return fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public ArrayList<LineaFactura> getLineasFactura() {
        return lineasFactura;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
