/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploprueba;

/**
 *
 * @author Noé
 */
public class EjemploPrueba {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("----------------------------------Lista de Clientes---------------------------------------");
        
        CuentaHabiente[] Cliente = new CuentaHabiente[5] ;
        Cliente[0] = new CuentaHabiente(319273645, "Noé Vargas", 1900000.0f);
        Cliente[1] = new CuentaHabiente(319263746, "Regina Vargas", 68000.0f);
        Cliente[2] = new CuentaHabiente(319273647, "Arturo Vargas", 39798.0f);
        Cliente[3] = new CuentaHabiente(319273648, "Mauron Playas", 48605.0f);
        Cliente[4] = new CuentaHabiente(319273649, "Gustabo García", 2987465.0f);
       
        
        for (CuentaHabiente cuentaHabiente : Cliente) {
            System.out.println(cuentaHabiente.evaluarNivelCliente());
        }
        
        
        System.out.println("------------------------------Movimientos de la Cuenta------------------------------------");
        Cliente[0].retirarDinero(500000.0f);        
    }
    
}
