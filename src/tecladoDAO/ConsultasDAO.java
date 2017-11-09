/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Letra;
import visual.Teclado;


public class ConsultasDAO {
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/teclado";
   String driver= "com.mysql.jdbc.Driver";  
   
   public void guardarPalabra(String palabra) throws SQLException{
       try {
            Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            s=conect.prepareStatement("insert into palabras (palabra) values (?)");
            s.setString(1, palabra);
            s.executeUpdate();

              
           } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
       conect.close();
   }
   public void borrarPorID(String tabla, Integer id) throws SQLException{
      try{
         conect=DriverManager.getConnection(url,user,password);
         PreparedStatement consulta = conect.prepareStatement("DELETE FROM " + tabla + " WHERE id = ?");
         consulta.setInt(1, id);
         consulta.executeUpdate();
      }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
      }
       conect.close();
   }
  
   public Integer obtenerMaxID(String tabla) throws SQLException{
     Integer rst = 0; 
     try{
         System.out.println(tabla);
         conect=DriverManager.getConnection(url,user,password);
         PreparedStatement consulta = conect.prepareStatement("select max(id) as ultid from " + tabla );
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            rst = resultado.getInt(1);
         }
      }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
      }
      conect.close(); 
      return rst;
      
   }
   
      public String obtenerUltPalabra(String tabla) throws SQLException{
         String rstado= null;
     try{
         System.out.println(tabla);
         conect=DriverManager.getConnection(url,user,password);
         PreparedStatement consulta = conect.prepareStatement("select max(palabra) as ultid from " + tabla );
         ResultSet resultados = consulta.executeQuery();
         while(resultados.next()){
          rstado=resultados.getString(null);
         }
         
      }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
      }
      conect.close(); 
       return rstado;
      
      
   }
        public void mostrarPalabras(String tabla) throws SQLException{
     
            
             DefaultTableModel modelo = new DefaultTableModel();
            //modelo.addColumn("id");
            modelo.addColumn("palabra");
            tablaTeclado.setModel(modelo);
     
     
         String rstado= null;
     try{
         System.out.println(tabla);
         conect=DriverManager.getConnection(url,user,password);
         PreparedStatement consulta = conect.prepareStatement("select max(palabra) as ultid from " + tabla );
         ResultSet resultados = consulta.executeQuery();
         while(resultados.next()){
          rstado=resultados.getString(null);
         }
         
      }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
      }
      conect.close(); 
       return rstado;
      
      
   }
    public ArrayList<Letra> recuperarTodas(String tabla) throws SQLException{
      ArrayList<Letra> lista = new ArrayList<>();
      try{
         PreparedStatement consulta = conect.prepareStatement("SELECT letra, from " + tabla);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            lista.add(new Letra(resultado.getString("letra")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return lista;
   }

}
