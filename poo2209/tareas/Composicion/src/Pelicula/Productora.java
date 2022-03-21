/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author Noé
 */
public class Productora {
    private String nombre;
    private String dueño;
    private int fechaCreacion;

    public Productora() {
    }

    public Productora(String nombre, String dueño, int fechaCreacion) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.fechaCreacion = fechaCreacion;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", due\u00f1o=" + dueño + ", fechaCreacion=" + fechaCreacion + '}';
    }
    
    
}
