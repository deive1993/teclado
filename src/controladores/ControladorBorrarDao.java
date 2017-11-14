
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
import tecladoDAO.Conectar;
import tecladoDAO.ConsultasDAO;

/**
 *
 * @author PC12
 */
public class ControladorBorrarDao implements MouseListener{
 

    @Override
    public void mouseClicked(MouseEvent evt) {
        
        ConsultasDAO consultasDAO = new ConsultasDAO();
        try {
           System.out.println(consultasDAO.obtenerMaxID("palabras"));
            consultasDAO.borrarPorID("palabras", consultasDAO.obtenerMaxID("palabras"));
            
            JOptionPane.showMessageDialog(null, "Palabra borrada es : " + consultasDAO.obtenerPalabraID("palabras", consultasDAO.obtenerMaxID("palabras")));
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
