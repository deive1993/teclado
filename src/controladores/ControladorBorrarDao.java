
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tecladoDAO.Conectar;

/**
 *
 * @author PC12
 */
public class ControladorBorrarDao implements MouseListener{
  
   Connection conect;
   PreparedStatement borrar;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/teclado";
   String driver= "com.mysql.jdbc.Driver";


    @Override
    public void mouseClicked(MouseEvent evt) {
         try {
                Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            borrar=conect.prepareStatement("delete from palabras where id = (select max(id) from palabras a))");
            borrar.executeUpdate();
            
//borrar.setString(1, texto.getText());
            
            
            JOptionPane.showMessageDialog(null, "palabras borradas exitosamente");
              
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
