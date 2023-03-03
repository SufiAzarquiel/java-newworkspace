package com.github.sufiazarquiel.workspace.tienda;

public class LineaFactura {
    // Attributes
    private int codigo;
    private Producto producto;
    private int cantidad;
    private float precio;

    // Constructor
    public LineaFactura(int codigo, Producto producto, int cantidad, float precio) {
        this.codigo = codigo;
        this.producto = producto;
        if (producto.getCantidad() - cantidad < 0) {
            this.cantidad = producto.getCantidad();
            producto.setCantidad(0);
        } else {
            this.cantidad = cantidad;
            producto.setCantidad(producto.getCantidad() - cantidad);
        }
        this.precio = producto.getPrecio() * this.cantidad;
    }
    
    // Methods
    public int getCodigo() {
        return codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineaFactura [cantidad=" + cantidad + ", codigo=" + codigo + ", precio=" + precio + ", producto="
                + producto.getDescripcion() + "]\n";
    }
}
