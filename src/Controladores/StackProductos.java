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
    Stack<Productos> pilaProducto;

    StackProductos() {
        pilaProducto = new Stack();
    }

    public void setPushPersona(Productos producto) {
        if (!pilaProducto.contains(producto)) {
            pilaProducto.push(producto);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito de compras!");
        } else {
            JOptionPane.showMessageDialog(null, "El Producto ya registrado en el carrito de compras");
        }
    }
}
