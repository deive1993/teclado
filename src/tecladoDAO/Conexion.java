/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC12
 */
public class Conexion {
     private Connection cnx = null;
   private String host, letra, bd;

    public Conexion(String host, String letra , String bd) {
        this.host = host;
        this.letra = letra;
        this.bd = bd;
    }
    public Connection getCnx() {
        return cnx;
    }
   public void conectar() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         //   cnx = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bd, this.usu, this.clave);
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3307/base_turnos","root","teamo110593gnd");

           // cnx = DriverManager.getConnection("jdbc:mysql://localhost:3307/base_turnos","root","teamo110593gnd");
            cnx = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bd, this.letra);

                System.out.println("conexion establecida");
                JOptionPane.showMessageDialog(null,"Conectado");
                    
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      
   }
   public void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }    
}