/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tecladoDAO.Conectar;
import tecladoDAO.ConsultasDAO;

/**
 *
 * @author PC12
 */
public class ControladorGuardar implements MouseListener{
   private JTextField texto;
       private ArrayList<String> letraIngresada;
    private JList<String> palabrasIngresadas;

    


    public ControladorGuardar(JTextField texto, JList<String> palabrasIngresadas, ArrayList<String> letraIngresada) {
        this.texto = texto;
        this.letraIngresada = letraIngresada;
        this.palabrasIngresadas = palabrasIngresadas;
    }
   


    @Override
    public void mouseClicked(MouseEvent evt) {
        ConsultasDAO consultasDAO = new ConsultasDAO();
       try {
           consultasDAO.guardarPalabra(texto.getText());
           JOptionPane.showMessageDialog(null, "palabras guardadas exitosamente");
       } catch (SQLException ex) {
           Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
       }
      letraIngresada.add(texto.getText());
              String[]data = (String[])letraIngresada.toArray(new String[letraIngresada.size()]);
        palabrasIngresadas.setListData(data);
       texto.setText("");
        
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
