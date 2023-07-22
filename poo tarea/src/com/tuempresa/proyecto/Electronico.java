package com.tuempresa.proyecto;

public class Electronico extends Producto {
    private String marca;

    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // Método para calcular el descuento (regla de descuento arbitraria, por ejemplo, 10%)
    public double calcularDescuento() {
        return getPrecio() * 0.1;
    }
}
