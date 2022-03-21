/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.Fes.Alumno;
import ico.Fes.Automovil;
import ico.Fes.Persona;
import ico.Fes.Silla;
import java.awt.Color;

/**
 *
 * @author Noé
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla ();
        System.out.println( s1 ); //por defecto se invoca toString()
        System.out.println( s1.toString() );
        
        Automovil miBocho= new Automovil ();  
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        Automovil miMustang= new Automovil ("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAkura= new Automovil ("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);
        
         Persona per1= new Persona ();
         // per1.edad=200000; no se permite por seguridad
         per1.setEdad(22);
         System.out.println(per1);
         
         Alumno al= new Alumno();
         al.setNombre("José");
        al.setNumeroCuenta("31927364-5");
        System.out.println(al);
        
    }
    
}
