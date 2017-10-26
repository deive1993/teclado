
package models;

import controladores.ControladorNumeroClick;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Numero extends JButton{
    
     private String numero;
     private JTextField texto;;
     private ControladorNumeroClick controladorNumClick;

    public Numero(String numero, JTextField texto, String text) {
        super(numero);
        this.numero = numero;
        this.texto = texto;
        
        controladorNumClick = new ControladorNumeroClick(texto, numero);
        
        this.addMouseListener(controladorNumClick);
    }

     
}
