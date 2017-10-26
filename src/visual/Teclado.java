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
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.GroupLayout.ParallelGroup; 
import javax.swing.GroupLayout.SequentialGroup; 
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

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
    private ArrayList<Letra> arrNumero = new ArrayList();
    private ArrayList<Letra> arrSimbolo = new ArrayList();
    private GridLayout contenedor = new GridLayout(8,5);
    private GroupLayout grupo = new GroupLayout(this);
    private ControladorSalir controladorSalir = new ControladorSalir();
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(texto);
 //   private ControladorEspacio controladorEspacio = new ControladorEspacio();
    private ControladorBorrar controladorBorrar = new ControladorBorrar();
    private String Letra;

    public Teclado() {
        
        this.setSize(500, 500);
        this.setLayout(contenedor);
        this.setLocationRelativeTo(this);
        grupo.setAutoCreateGaps(true);
        grupo.setAutoCreateContainerGaps(true);
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
        this.cargarNumero();
        this.cargarSimbolo();
        this.add(texto);
       
        for (i = 0; i < arrLetra.size(); i++){
            this.add(arrLetra.get(i));
        }
       
        /*
        this.add(espacio);
        this.add(borrar);
        this.add(limpiar);
        this.add(salir);
        */
        
        //crea la primera columna
        grupo.setHorizontalGroup(grupo.createSequentialGroup()
            .addComponent(espacio)
                //se agrega la segunda columna
         .addGroup(grupo.createParallelGroup(LEADING)
            .addComponent(texto)
            .addGroup(grupo.createSequentialGroup()
                .addGroup(grupo.createParallelGroup(LEADING)
                    //simbolo y numeros
                        .addComponent(limpiar))
                    
                .addGroup(grupo.createParallelGroup(LEADING)
                   // .addComponent(borrar)
                    .addComponent(borrar)
                    .addComponent(salir))))
        .addGroup(grupo.createParallelGroup(LEADING)
            
            .addComponent(salir))
    );
 
    
    grupo.linkSize(SwingConstants.HORIZONTAL, limpiar,salir);
  
    grupo.setVerticalGroup(grupo.createSequentialGroup()
        .addGroup(grupo.createParallelGroup(BASELINE)
            .addComponent(espacio)
            .addComponent(texto)
            .addComponent(borrar))
        .addGroup(grupo.createParallelGroup(LEADING)
            .addGroup(grupo.createSequentialGroup()
                .addGroup(grupo.createParallelGroup(BASELINE)
                   // .addComponent(checkBox1)
                    .addComponent(limpiar))
                .addGroup(grupo.createParallelGroup(BASELINE)
                    .addComponent(limpiar)
                    .addComponent(limpiar)))
            .addComponent(salir))
    );
    
        }

   
    
    private void cargarLetras(){
        Integer i;
        for (i = 97; i <= 122; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
    }
  

    private void cargarSimbolo() {

        Integer i;
        for (i = 33; i <= 47; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
    }

    private void cargarNumero() {
        Integer i;
        for (i = 48; i <= 57; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
    }
    
          
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
        );
 */

   
}





    
    
    
    
        
        /*

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
        */