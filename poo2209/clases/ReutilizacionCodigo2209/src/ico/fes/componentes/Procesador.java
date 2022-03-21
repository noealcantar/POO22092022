/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author Noé
 */
public class Procesador {
    private String marca;
    private float FrecuanciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, float FrecuanciaEnGhz) {
        this.marca = marca;
        this.FrecuanciaEnGhz = FrecuanciaEnGhz;
    }

    public float getFrecuanciaEnGhz() {
        return FrecuanciaEnGhz;
    }

    public void setFrecuanciaEnGhz(float FrecuanciaEnGhz) {
        this.FrecuanciaEnGhz = FrecuanciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", FrecuanciaEnGhz=" + FrecuanciaEnGhz + '}';
    }
    
}
