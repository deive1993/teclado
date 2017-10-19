/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorLimpiar implements MouseListener{

    
    private JTextField texto;
    private ArrayList arrLetra;

    public ControladorLimpiar(JTextField texto, ArrayList arrLetra) {
        this.texto = texto;
        this.arrLetra = arrLetra;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
      texto.setText(" ");
      texto.grabFocus();
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
