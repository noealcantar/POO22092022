/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class Descifrar extends JPanel{
    
    private JTextField cuadro;
    private JTextArea cuadro1, cuadro2;
    private JButton boton;
    private JLabel label, label1, label2;
    private JLabel mensajeCifrado;
    private JScrollPane sc, sc1;

    public Descifrar() {
        JPanel descifrar = new JPanel(); 
        
        this.setBackground(Color.lightGray);
        this.setLayout(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints();
        
        label = new JLabel("Número de desplazamiento:");
        cuadro = new JTextField(6);
        label1 = new JLabel("Ingresa el texto a descifrar:");
        cuadro1 = new JTextArea(20,20);  
        sc = new JScrollPane(cuadro1);  
        label2 = new JLabel("Texto descifrado:");
        cuadro2 = new JTextArea(20,20);  
        cuadro2.setEditable(false);  
        sc1 = new JScrollPane(cuadro2); 
        
        boton = new JButton("Descifrar"); 
        boton.setBackground(Color.GRAY);
        boton.setOpaque(true);
        boton.setToolTipText("Presiona para descifrar el texto");
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(cuadro,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc,gbc);
        
        gbc.gridx = 20;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label2,gbc);
        
        gbc.gridx = 20;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc1,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(boton,gbc);
        
        this.boton.addMouseListener(new MouseAdapter() { 
            @Override
            public void mouseClicked(MouseEvent e) {
                
                try {
                   descifrado();  
                } catch (Exception ex) {
                    System.out.println(ex.toString()); 
                    JOptionPane.showMessageDialog(null, "Solo ingresar valores numéricos", 
                            "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        });
       
    }
    
    private void descifrado(){ 
        
        String mensaje;
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        mensaje = cuadro1.getText();
         
        String texto = descodificar(letras, mensaje);
        
        cuadro2.setText(texto);
        
    }
    
    private String descodificar(String letras, String texto){ 
        String textoDescodificado = "";
        int desplazamiento;
        desplazamiento = Integer.parseInt(cuadro.getText());
        texto = texto.toUpperCase();
 
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
 
            int pos = letras.indexOf(caracter);
 
            if(pos == -1){
                textoDescodificado += caracter;
            }else{     
                if(pos - 3 < 0){
                    textoDescodificado += letras.charAt( letras.length() + (pos - desplazamiento) );
                }else{
                    textoDescodificado += letras.charAt( Math.abs(pos - desplazamiento) % letras.length() );
                }     
            }
 
        }
 
        return textoDescodificado;
    }
    
}