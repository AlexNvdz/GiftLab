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
public class StackProductos extends Stack<Productos>{

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
            Stack<Productos> tempStack = new Stack<>();

            while (!pilaProductos.isEmpty()) {
                Productos pilaAuxiliar = pilaProductos.pop();

                if (pilaAuxiliar.getNombre() != nombreProducto) {
                    tempStack.push(pilaAuxiliar);
                }
            }

            // Restaurar la pila original sin el nodo con el ID especificado
            while (!tempStack.isEmpty()) {
                pilaProductos.push(tempStack.pop());
            }
        }

        public void mostrar() {
            for (Productos producto : pilaProductos) {
                System.out.println(producto.getNombre());
            }
        }
    

    public void setPopProducto() {
        if (!pilaProductos.empty()) {
            pilaProductos.pop();
        }
    }
    
     public float getPrecioTotal() {
        float suma = 0;
        for (Productos producto : pilaProductos) {
            // Supongamos que los objetos Producto tienen un atributo llamado "valor"
            // que es un número que deseas sumar
            double valorProducto = producto.precio;  // Obtén el valor del Producto
            suma += valorProducto;  // Acumula el valor en la suma
        }
        return suma;
    }
}
