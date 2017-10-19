

package models;

import controladores.ControladorBorrar;
import controladores.ControladorEspacio;
import controladores.ControladorLetraClick;
import javax.swing.JButton;
import javax.swing.JTextField;

    

public class Letra extends JButton {
    
     private String letra;
     private JTextField texto;
     
     private ControladorLetraClick controladorClick;
     private ControladorBorrar controladorLimpiar;
     private ControladorEspacio controladorEspacios;
     

    public Letra(String letra, JTextField texto) {
        super(letra);
        this.letra = letra;
        this.texto = texto;
        
        controladorClick = new ControladorLetraClick(texto,letra);
       // controladorEspacios = new ControladorEspacio(texto,letra);
        //controladorLimpiar = new ControladorBorrar(texto,letra);
        
        this.addMouseListener(controladorClick);
        this.addMouseListener(controladorEspacios);
        this.addMouseListener(controladorLimpiar);
    }

   
    

}

    
        
    
    
    
  
