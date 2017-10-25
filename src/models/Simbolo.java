
package models;

import controladores.ControladorNumeroClick;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Simbolo extends JButton{
  
     private String simbolo;
     private JTextField texto;

     private ControladorNumeroClick controladorNumClick;
     
    public Simbolo(String simbolo, JTextField texto, String text) {
        super(simbolo);
        this.simbolo = simbolo;
        this.texto = texto;
    }
    
    

     
     
             
}
