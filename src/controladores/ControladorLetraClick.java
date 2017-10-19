
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import models.Letra;




public class ControladorLetraClick implements MouseListener{

    private JTextField texto;
    private String letra;

    

    public ControladorLetraClick(JTextField texto, String letra) {
        this.texto= texto;
        this.letra = letra;
    
    }

    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText(texto.getText()+ letra);
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
