/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author Noé
 */
public class Director {
    private String nombre;
    private int numeroPeliculas;
    private int edad;

    public Director() {
    }

    public Director(String nombre, int numeroPeliculas, int edad) {
        this.nombre = nombre;
        this.numeroPeliculas = numeroPeliculas;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPeliculas() {
        return numeroPeliculas;
    }

    public void setNumeroPeliculas(int numeroPeliculas) {
        this.numeroPeliculas = numeroPeliculas;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", numeroPeliculas=" + numeroPeliculas + ", edad=" + edad + '}';
    }
    
    
}
