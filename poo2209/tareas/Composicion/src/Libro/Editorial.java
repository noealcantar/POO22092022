/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Noé
 */
public class Editorial {
    private String nombre;
    private int añoPublicacion;

    public Editorial() {
    }

    public Editorial(String nombre, int añoPublicacion) {
        this.nombre = nombre;
        this.añoPublicacion = añoPublicacion;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", a\u00f1oPublicacion=" + añoPublicacion + '}';
    }
    
    
}
