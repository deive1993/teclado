/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tecladoDAO.Conectar;

/**
 *
 * @author PC12
 */
public class ControladorGuardar implements MouseListener{
   private JTextField texto;
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/teclado";
   String driver= "com.mysql.jdbc.Driver";

    public ControladorGuardar(JTextField texto) {
        this.texto = texto;
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
       
        try {
                Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            s=conect.prepareStatement("insert into palabras (palabra) values (?)");
            s.setString(1, texto.getText());
            s.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "palabras guardadas exitosamente");
              
           } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
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
