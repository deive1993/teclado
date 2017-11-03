package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTextField;
import models.Letra;

public class ControladorEspacio implements MouseListener{
    
    private JTextField texto;
    private ArrayList arrayletra;
    private ArrayList arrNumero;
    private ArrayList arrSimbolo;

    public ControladorEspacio(JTextField texto, ArrayList arrayletra, ArrayList arrNumero, ArrayList arrSimbolo) {
        this.texto = texto;
        this.arrayletra = arrayletra;
        this.arrNumero = arrNumero;
        this.arrSimbolo = arrSimbolo;
    }

    
           
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText(texto.getText()+ " ");
   
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
