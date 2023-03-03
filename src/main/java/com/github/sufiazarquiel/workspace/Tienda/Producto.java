package com.github.sufiazarquiel.workspace.tienda;

public class Producto {
    // Attributes
    private int codigo;
    private String descripcion;
    private float precio;
    private int cantidad;
    private int minimo;

    // Constructors
    public Producto(int codigo, String descripcion, float precio, int cantidad, int minimo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.minimo = minimo;
    }

    public Producto(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = 0.0f;
        this.cantidad = 0;
        this.minimo = 0;
    }

    // Methods
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
                + cantidad + ", minimo=" + minimo + "]\n";
    }
}
