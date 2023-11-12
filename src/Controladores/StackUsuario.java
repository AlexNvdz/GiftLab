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
public class StackUsuario {
    Stack<Persona> pilaUsuario;

    StackUsuario() {
        pilaUsuario = new Stack();
    }

    public void setPushPersona(Persona persona) {
        if (!pilaUsuario.contains(persona)) {
            pilaUsuario.push(persona);
            JOptionPane.showMessageDialog(null, "Usuario registrado!");
        } else {
            JOptionPane.showMessageDialog(null, "El Usuario ya se encuentra registrado!");
        }
    }
    
    
}
