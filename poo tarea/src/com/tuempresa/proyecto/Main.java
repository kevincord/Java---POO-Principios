package com.tuempresa.proyecto;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Producto producto1 = new Producto(1, "Libro", 25.99, 3);
        Producto producto2 = new Electronico(2, "Teléfono", 699.99, 1, "Samsung");
        Producto producto3 = new Producto(3, "Lápiz", 1.5, 10);

        // Crear una orden
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);

        // Mostrar los detalles de la orden
        orden.mostrarDetallesOrden();
    }
}
