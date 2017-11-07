
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
   String ultimoid;


    @Override
    public void mouseClicked(MouseEvent evt) {
         System.out.println("borrado");
        try {
            Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
          
           // borrar=conect.prepareStatement("delete from palabras where id = (select max(id) from palabras a))");
            borrar=conect.prepareStatement("delete from palabras where id = 1");
           
            /*borrar.setString(1, tabla.getc);
            
            ultimoid = conect.prepareStatement("delete from palabras where id = (select max(id) from palabras a))");
            borrar=conect.prepareStatement("delete from palabras where id = (select max(id) from palabras a))");
                    
            borrar.executeQuery();
            
            SELECT maxi(id) as ultid FROM `palabras`

delete from palabras where id = ultid
.*/
            
            
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
