/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Alex Nvdz
 */
public class Productos {
    String nombre;
    Integer cantidad;
    float precio;
    Date Hora;

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
  
    public Productos(String nombre, Integer cantidad, float precio, Date Hora) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.Hora = Hora;
    }
    
     @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Productos other = (Productos) obj;
        return nombre.equals(other.nombre);
    }
    
    
}
