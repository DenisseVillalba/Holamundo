
package taller;

import java.util.ArrayList;

public class Inventario {
    private final ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacio.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String nombre) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado con exito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    }
}

