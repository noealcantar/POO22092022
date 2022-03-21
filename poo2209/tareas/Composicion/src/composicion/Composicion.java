/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import Atico.Genero;
import Cineplaneta.Sala;
import Libro.Autor;
import Libro.Editorial;
import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;

/**
 *
 * @author Noé
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Genero miLibro = new Genero("Padres Padrisimos S.A",
               new Autor("Jaime Alfonso Sandoval", "Mexicana", 50),
               new Editorial("Progreso", 2015));
         System.out.println(miLibro);    
         
         
 System.out.println("--------------------------------------------------------------------------------------------");
      
        Sala miPeli= new Sala("Son Como Niños",
              new Director("Dennis Dugan", 9, 75),
              new Productora("Happy Madison", "Adam Sandler", 1999),
              new Actor("Adam Sandler", "35", 55));
         System.out.println(miPeli);
        
    }
    
}
   
