/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Tarea to edit this template
 */
package Ejercicio;

/**
 *
 * @author Noé
 */
public class Tarea {
    private String color;
    private String genero;
    private String nombre;
    private String autor;
    private int edicion;

    public Tarea() {
    }

    public Tarea(String color, String genero, String nombre, String autor, int edicion) {
        this.color = color;
        this.genero = genero;
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "java{" + "color=" + color + ", genero=" + genero + ", nombre=" + nombre + ", autor=" + autor + ", edicion=" + edicion + '}';
    }
    
}
