package layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutt {
    public static void main(String[] args) {
        JFrame frm = Funciones.creaFormulario("BorderLayout", 1000, 500);
        JPanel pnl = (JPanel) frm.getContentPane();
        pnl.setLayout(new GridLayout(3,2));


        JButton btn1 = new JButton("Boton 1");
        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("Boton 3");
        JButton btn4 = new JButton("Boton 4");
        JButton btn5 = new JButton("Boton 5");
        JButton btnx = new JButton("Boton X");

        
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btnx);
        pnl.add(btn3);
        pnl.add(btn4);
        pnl.add(btn5);
        
        frm.setVisible(true);
    }

	
}
