/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.ControladorBorrar;
import controladores.ControladorEspacio;
import controladores.ControladorLimpiar;
import controladores.ControladorSalir;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import models.Letra;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup; 
import javax.swing.GroupLayout.SequentialGroup; 

/**
 *
 * @author PC13
 */
public class Teclado extends JFrame{
    private JButton borrar = new JButton("BORRAR");
    private JButton espacio = new JButton("ESPACIO");
    private JButton limpiar = new JButton("LIMPIAR");
    private JButton salir = new JButton("SALIR");
    private JTextField texto = new JTextField("") ;
    private ArrayList<Letra> arrLetra = new ArrayList();
    private GridLayout contenedor = new GridLayout(5,10);
    private ControladorSalir controladorSalir = new ControladorSalir();
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(texto,arrLetra);
    private ControladorEspacio controladorEspacio = new ControladorEspacio();
    private ControladorBorrar controladorBorrar = new ControladorBorrar();

    public Teclado() {
        this.setSize(500, 500);
        this.setLayout(contenedor);
        this.setLocationRelativeTo(this);
        
        this.agregarComponentes();
        this.setVisible(true);
        this.salir.addMouseListener(controladorSalir);
        this.espacio.addMouseListener(controladorEspacio);
        this.limpiar.addMouseListener(controladorLimpiar);
        this.borrar.addMouseListener(controladorBorrar);
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
        this.add(limpiar);
        this.add(salir);
    }
    
    private void cargarLetras(){
        Integer i;
        for (i = 97; i <= 122; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
            
    }
    
    
    
}
