/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Noé
 */
public class Swing extends JFrame{
    
    Cifrar cifrar;
    Descifrar descifrar;
    JTabbedPane pestanas;

    public Swing() throws HeadlessException {
        
        setTitle("Cifrado César");
        setSize(600,600);
        setLocationRelativeTo(null);
        
        cifrar = new Cifrar();
        descifrar = new Descifrar();
       
        pestanas = new JTabbedPane();
        
        pestanas.add("Cifrado", cifrar);
        pestanas.add("Descifrado", descifrar);
       
        add(pestanas);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
    }
   
}