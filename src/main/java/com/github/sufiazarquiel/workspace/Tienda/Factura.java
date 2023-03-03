package com.github.sufiazarquiel.workspace.tienda;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    // Attributes
    private static int gNumeroFactura = 1;
    private Date fecha;
    private int numeroFactura;
    private ArrayList<LineaFactura> lineasFactura;
    private boolean pagada;

    // Constructor
    public Factura() {
        this.fecha = new Date();
        this.numeroFactura = gNumeroFactura++;
        this.lineasFactura = new ArrayList<LineaFactura>();
        this.pagada = false;
    }

    public Factura(Date fecha, int numeroFactura, ArrayList<LineaFactura> lineasFactura, boolean pagada) {
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.lineasFactura = lineasFactura;
        this.pagada = pagada;
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

    public void addLineaFactura(LineaFactura lineaFactura) {
        this.lineasFactura.add(lineaFactura);
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "Fecha=" + fecha + "\nLineasFactura:\n" + lineasFactura + "\nNumeroFactura=" + numeroFactura
                + "\nPagada=" + pagada;
    }
}
