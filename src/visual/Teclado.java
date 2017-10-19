/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import models.Letra;

/**
 *
 * @author PC13
 */
public class Teclado extends JFrame{
    private JButton borrar = new JButton("LIMPIAR");
    private JButton espacio = new JButton("ESPACIO");
    private JTextField texto;
    private ArrayList<Letra> arrLetra = new ArrayList();
    private GridLayout contenedor = new GridLayout(5,10);

    public Teclado() {
        this.setSize(700, 700);
        this.setLayout(contenedor);
        
        this.agregarComponentes();
        this.setVisible(true);
    }
    private void agregarComponentes(){
        Integer i;
        texto = new JTextField();
        this.cargarLetras();
        this.add(texto);
        for (i = 0; i < arrLetra.size(); i++){
            this.add(arrLetra.get(i));
        }
        
        this.add(espacio);
        this.add(borrar);
    }
    
    private void cargarLetras(){
        Integer i;
        for (i = 97; i <= 122; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
            
    }
    
    
    
}
