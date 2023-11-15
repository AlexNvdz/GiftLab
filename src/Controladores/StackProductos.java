/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Nvdz
 */
public class StackProductos {
    Stack<Productos> pilaProductos;

    StackProductos() {
        pilaProductos = new Stack();
    }

    public void setPushProducto(Productos producto) {
        if (!pilaProductos.contains(producto)) {
            pilaProductos.push(producto);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito de compras!");
        } else {
            JOptionPane.showMessageDialog(null, "El Producto ya registrado en el carrito de compras");
        }
    }
    
    public void setPopPorNombre(String nombreProducto) {
    // Creamos una pila temporal para almacenar los elementos que no coinciden con el nombre
    Stack<Productos> pilaTemporal = new Stack<>();

    // Bandera para indicar si se encontró el producto
    boolean encontrado = false;

    // Iteramos sobre la pila principal
    while (!pilaProductos.isEmpty()) {
        Productos productoActual = pilaProductos.pop();

        // Verificamos si el nombre coincide
        if (productoActual.getNombre().equals(nombreProducto)) {
            // Se encontró el producto, establecemos la bandera a true
            encontrado = true;
            // Mensaje indicando que el producto se eliminó
            JOptionPane.showMessageDialog(null, "Producto eliminado del carrito de compras: " + productoActual.getNombre());
        } else {
            // El nombre no coincide, agregamos el producto a la pila temporal
            pilaTemporal.push(productoActual);
        }
    }

    // Volvemos a llenar la pila principal con los elementos que no coinciden con el nombre
    while (!pilaTemporal.isEmpty()) {
        pilaProductos.push(pilaTemporal.pop());
    }

    // Si no se encontró el producto, mostramos un mensaje indicando que no existe
    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "Producto no encontrado en el carrito de compras");
    }
}
}
