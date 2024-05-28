package layouts;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

public class BorderLayoutt {
    public static void main(String[] args) {
        JFrame frm = Funciones.creaFormulario("BorderLayout", 1000, 500);
        JPanel pnl = (JPanel) frm.getContentPane();
        
        pnl.setLayout(new BorderLayout());

        //norte
        JTextField txtN = new JTextField("Introduzca nombre");
        pnl.add(txtN, BorderLayout.NORTH);

        //oeste
        JTextArea txtO = new JTextArea("Introduzca Apellidos");
        txtO.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        JScrollPane scroll = new JScrollPane(txtO);
        pnl.add(scroll, BorderLayout.WEST);

        //Este
        JTextField txtE = new JTextField("Introduzca Mote");
        pnl.add(txtE, BorderLayout.EAST);

        //Sur
        JTextField txtS = new JTextField("Introduzca numero Tarjeta Bancaria");
        pnl.add(txtS, BorderLayout.SOUTH);
        //Centro
        JTextField txtC = new JTextField("Introduzca cvc y fecha caducidad");
        pnl.add(txtC, BorderLayout.CENTER);
        
        
        frm.setVisible(true);
        
    }
}
