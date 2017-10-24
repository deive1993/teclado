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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import models.Letra;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup; 
import javax.swing.GroupLayout.SequentialGroup; 
import javax.swing.JOptionPane;

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
    private GridLayout contenedor = new GridLayout(8,5);
    private GroupLayout grupo;
    private ControladorSalir controladorSalir = new ControladorSalir();
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(texto);
 //   private ControladorEspacio controladorEspacio = new ControladorEspacio();
    private ControladorBorrar controladorBorrar = new ControladorBorrar();
    private String Letra;

    public Teclado() {
        cerrar();
        this.setSize(500, 500);
        this.setLayout(contenedor);
        this.setLocationRelativeTo(this);
       // this.grupo.setAutoCreateGaps(true);
      //  this.grupo.setAutoCreateContainerGaps(true);
        this.agregarComponentes();
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        this.salir.addMouseListener(controladorSalir);
     //   this.espacio.addMouseListener(controladorEspacio);
       this.limpiar.addMouseListener(controladorLimpiar);
    //    this.borrar.addMouseListener(controladorBorrar);
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
        
        
        
        /*
        grupo.setHorizontalGroup(
        grupo.createSequentialGroup()
        .addComponent(espacio)
        .addComponent(borrar)
        .addGroup(grupo.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addComponent(limpiar)
           .addComponent(salir))
        );
      
        grupo.setVerticalGroup(
        grupo.createSequentialGroup()
        .addGroup(grupo.createParallelGroup(GroupLayout.Alignment.BASELINE)
           .addComponent(c1)
           .addComponent(c2)
           .addComponent(c3))
        .addComponent(c4)
        );*/

    }
    
    private void cargarLetras(){
        Integer i;
        for (i = 97; i <= 122; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
            
    }
    
    
        public void cerrar(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowclosing (WindowEvent e ){
                    confirmarSalida();
                    
                }
        });
            this.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void confirmarSalida(){
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?","Advertencia",JOptionPane.YES_NO_OPTION);
    
        if(valor==JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "Gracias por su visita hasta pronto", "Gracias",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
