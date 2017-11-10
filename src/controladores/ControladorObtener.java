/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tecladoDAO.Conectar;
import tecladoDAO.ConsultasDAO;

/**
 *
 * @author PC12
 */
public class ControladorObtener implements MouseListener{

    private JTextField texto;

    public ControladorObtener(JTextField texto) {
        this.texto = texto;
    }

   
    
    
    
    @Override
    public void mouseClicked(MouseEvent evt) {
       
        ConsultasDAO consultasDAO = new ConsultasDAO();
        try {
         //   System.out.println(consultasDAO.obtenerMaxID("palabras"));
          String rst = consultasDAO.obtenerPalabraID("palabras", consultasDAO.obtenerMaxID("palabras"));
             JOptionPane.showMessageDialog(null, "Palabra obtenida " + rst);
             texto.setText(rst);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBorrarDao.class.getName()).log(Level.SEVERE, null, ex);
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
