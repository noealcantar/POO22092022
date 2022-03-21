/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cineplaneta;


import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;

/**
 *
 * @author Noé
 */
public class Sala {
    private String tituloPeli;
    private Director dirijida;
    private Productora producida;
    private Actor interpretacion;

    public Sala() {
        dirijida = new Director();
        producida = new Productora();
        interpretacion = new Actor();
        
    }

    public Sala(String tituloPeli, Director dirijida, Productora producida, Actor interpretacion) {
        this.tituloPeli = tituloPeli;
        this.dirijida = dirijida;
        this.producida = producida;
        this.interpretacion = interpretacion;
    }

    public Actor getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(Actor interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getTituloPeli() {
        return tituloPeli;
    }

    public void setTituloPeli(String tituloPeli) {
        this.tituloPeli = tituloPeli;
    }

    public Director getDirijida() {
        return dirijida;
    }

    public void setDirijida(Director dirijida) {
        this.dirijida = dirijida;
    }

    public Productora getProducida() {
        return producida;
    }

    public void setProducida(Productora producida) {
        this.producida = producida;
    }

    @Override
    public String toString() {
        return "Sala{" + "tituloPeli=" + tituloPeli + ", dirijida=" + dirijida + ", producida=" + producida + ", interpretacion=" + interpretacion + '}';
    }
    
    
}
