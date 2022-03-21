/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atico;

import Libro.Autor;
import Libro.Editorial;

/**
 *
 * @author Noé
 */
public class Genero {
    private String titulo;
    private Autor nombre;
    private Editorial edicion;

    public Genero() {
        nombre = new Autor();
        edicion = new Editorial();
        
    }

    public Genero(String titulo, Autor nombre, Editorial edicion) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.edicion = edicion;
    }

    public Editorial getEdicion() {
        return edicion;
    }

    public void setEdicion(Editorial edicion) {
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getNombre() {
        return nombre;
    }

    public void setNombre(Autor nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Genero{" + "titulo=" + titulo + ", nombre=" + nombre + ", edicion=" + edicion + '}';
    }
    
    
}
