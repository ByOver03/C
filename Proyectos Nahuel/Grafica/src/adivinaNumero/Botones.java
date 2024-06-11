package adivinaNumero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import eventos.Funciones;
import java.util.*;

public class Botones {
    
    JFrame frm;
    JPanel pnl;
    int n;
    int i;
    ArrayList<JButton> botones = new ArrayList<>();
    JButton btn = new JButton();

    Botones(){
        frm = Funciones.creaFormulario("Adivina Numero", 1000, 1000);
        pnl = (JPanel) frm.getContentPane();

        pnl.setLayout(new GridLayout(10,10));
        
        for (int i = 1; i <= 100; i++) {
            String s = String.valueOf(i);
            botones.add(new JButton(s));
        }
        for (JButton jButton : botones) {
            pnl.add(jButton);
        }
        n=(int)(Math.random()*100)+1;
        
        botones();
        frm.setVisible(true);
    }

    
    private class BtnUsuario implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            for (JButton jButton : botones) {
                jButton = (JButton) e.getSource();
                if (jButton.isEnabled()) {
                    btn = jButton;
                }
            }
            
            i = Integer.valueOf(btn.getText());
            if(i != n){
                btn.setEnabled(false);
            }else if(i< n){
                for (int j = 0; j <= i; j++) {
                    botones.get(j).setEnabled(false);
                }
            }else if (i> n){
                for (int j = 100; j < i; j--) {
                    botones.get(j).setEnabled(false);
                }
            }else{
                System.out.println("Has encontrado el error");
            }
        }
        
    }
    public void botones(){
        
    }

}
