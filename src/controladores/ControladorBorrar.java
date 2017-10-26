
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorBorrar implements MouseListener{
    private JTextField texto;

    public ControladorBorrar(JTextField texto) {
        this.texto = texto;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("borrar");
        texto.setText(" ");
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
