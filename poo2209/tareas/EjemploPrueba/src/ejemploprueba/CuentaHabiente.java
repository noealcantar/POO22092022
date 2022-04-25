/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploprueba;

/**
 *
 * @author Noé
 */
public class CuentaHabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public CuentaHabiente() {
    }

    public CuentaHabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        //código para restarle el monto al balance
        System.out.println("El cliente " + this.nombre + " retiró la cantidad de " + monto + " pesos");
        this.balance =  this.balance-monto;
        System.out.println(this.nombre+", El saldo después del retiro es  "+this.balance+" pesos");
    }
    
    public String evaluarNivelCliente(){
        return this.balance <= 50000.0f? this.nombre+" Cliente Regular " : this.nombre+" Cliente Premium ";
    }
    
}
