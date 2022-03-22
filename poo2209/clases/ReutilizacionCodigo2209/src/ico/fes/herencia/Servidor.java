/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import Asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Noé
 */
public class Servidor extends Computadora {
    private int numeroFuentesPoder;
    private int numeroTarjetas;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetas, int tipoRaid) {
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetas = numeroTarjetas;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetas, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetas = numeroTarjetas;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuentesPoder() {
        return numeroFuentesPoder;
    }

    public void setNumeroFuentesPoder(int numeroFuentesPoder) {
        this.numeroFuentesPoder = numeroFuentesPoder;
    }

    public int getNumeroTarjetas() {
        return numeroTarjetas;
    }

    public void setNumeroTarjetas(int numeroTarjetas) {
        this.numeroTarjetas = numeroTarjetas;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuentesPoder=" + numeroFuentesPoder + ", numeroTarjetas=" + numeroTarjetas + ", tipoRaid=" + tipoRaid + '}';
    }
    
    
}
