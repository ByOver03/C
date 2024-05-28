package layouts;

import javax.swing.*;

public class BoxLayoutt {
    public static void main(String[] args) {
        JFrame frm = Funciones.creaFormulario("Diseño BoxLayout", 1000, 100);
        JPanel pnl = (JPanel) frm.getContentPane();


        //Box box = Box.createVerticalBox();
        Box boox = Box.createHorizontalBox();

        /*Espacios
         * Box.createVerticalStrut(int height)
         * Box.createHorizontalStrut(int width)
         * 
         * Box.createVerticalGlue()
         * Box.createHorizontalGlue()
         */

        JButton btn1 = new JButton("B1");
        

        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("B3");
        boox.add(btn1);
        boox.add(Box.createHorizontalGlue());
        boox.add(btn2);
        boox.add(Box.createHorizontalStrut(30));
        boox.add(btn3);
        

        pnl.add(boox);
        frm.setVisible(true);
    }
}
