/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author Noé
 */
public class Actor {
    private String nombre;
    private String experiencia;
    private int edad;

    public Actor() {
    }

    public Actor(String nombre, String experiencia, int edad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", experiencia=" + experiencia + ", edad=" + edad + '}';
    }
    
}
