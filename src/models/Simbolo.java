
package models;

import controladores.ControladorSimboloClick;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Simbolo extends JButton{
  
     private String simbolo;
     private JTextField texto;
     private ControladorSimboloClick controladorSimboloClick;
     
    public Simbolo(String simbolo, JTextField texto, String text) {
        super(simbolo);
        this.simbolo = simbolo;
        this.texto = texto;
        
        controladorSimboloClick = new ControladorSimboloClick(texto,simbolo);
        
        this.addMouseListener(controladorSimboloClick);
    }
    
    

     
     
             
}
