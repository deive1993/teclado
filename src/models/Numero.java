
package models;

import javax.swing.JButton;
import javax.swing.JTextField;


public class Numero extends JButton{
    
     private String numero;
     private JTextField texto;;

    public Numero(String numero, JTextField texto, String text) {
        super(numero);
        this.numero = numero;
        this.texto = texto;
    }

     
}
