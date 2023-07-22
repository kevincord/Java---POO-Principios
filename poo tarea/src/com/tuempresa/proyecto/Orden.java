package com.tuempresa.proyecto;

import java.util.ArrayList;

public class Orden {
    private ArrayList<Producto> productos;

    public Orden() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto a la orden
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para calcular el total de la orden
    public double calcularTotalOrden() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    // Método para mostrar los detalles de la orden
    public void mostrarDetallesOrden() {
        System.out.println("Detalles de la orden:");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad: " + producto.getCantidad());
            if (producto instanceof Electronico) {
                System.out.println("Marca: " + ((Electronico) producto).getMarca());
            }
            System.out.println("-----------------------------");
        }
        System.out.println("Total de la orden: " + calcularTotalOrden());
    }
}
