/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.Objects;

/**
 *
 * @author Alex Nvdz
 */
public class Persona {
    
    String usuario;
    String Contraseña;
    
    public Persona(String usuario, String Contraseña) {
        this.usuario = usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
     @Override
    public int hashCode() {
        return Objects.hash(usuario, Contraseña);
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona other = (Persona) obj;
        return usuario.equals(other.usuario);
    }
}
