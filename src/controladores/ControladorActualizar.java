/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tecladoDAO.ConsultasDAO;

/**
 *
 * @author USER
 */
public class ControladorActualizar implements MouseListener{
    private JTextField texto;

    public ControladorActualizar(JTextField texto) {
        this.texto = texto;
    }

    
    @Override
    public void mouseClicked(MouseEvent evt) {
     ConsultasDAO consultasDAO = new ConsultasDAO();
        System.out.println("palabra actualizada");
       try {
           consultasDAO.actualizarPalabra(texto.getText());
           
           JOptionPane.showMessageDialog(null, "palabra actualizada exitosamente");
       } catch (SQLException ex) {
           Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
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
