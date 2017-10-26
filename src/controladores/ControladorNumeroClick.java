/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author PC12
 */
public class ControladorNumeroClick implements MouseListener{

    private JTextField texto;
    private String numero;

    public ControladorNumeroClick(JTextField texto, String numero) {
        this.texto = texto;
        this.numero = numero;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText(texto.getText()+ numero);
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
