package adivinaNumero;

import javax.swing.*;
import java.awt.*;
import eventos.Funciones;

public class Botones {
    JButton[] boton;
    JFrame frm;
    JPanel pnl;

    Botones(){
        frm = Funciones.creaFormulario("Adivina Numero", 1000, 1000);
        pnl = (JPanel) frm.getContentPane();

        pnl.setLayout(new GridLayout(10,10));
        for (int i = 1; i <= 100; i++) {
            String s = String.valueOf(i);
            boton[i-1] = new JButton(s);
            
        }
        for (int i = 0; i < boton.length; i++) {
            pnl.add(boton[i]);
        }

        frm.setVisible(true);
    }

    
    void generaBotones(){
        
    }
}
