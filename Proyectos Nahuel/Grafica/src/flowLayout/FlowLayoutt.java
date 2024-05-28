package flowLayout;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutt {
    public static void main(String[] args) {
        JFrame frmPrincipal = Funciones.creaFormulario("Calculadora", 1000, 500);
        JPanel pnlPrincipal=(JPanel) frmPrincipal.getContentPane();

        JPanel pnl = new JPanel();
        pnl.setLayout(new FlowLayout());

        JLabel lblDisplay = new JLabel("Hola");
        pnlPrincipal.add(lblDisplay);

        JPanel pnlBotones = new JPanel();
        for (int i = 0; i < 10; i++) {
            Funciones.agregaBotonAPanel(String.valueOf(i), pnlBotones);   
        }
        Funciones.agregaBotonAPanel("+", pnlBotones);
        Funciones.agregaBotonAPanel("-", pnlBotones);
        Funciones.agregaBotonAPanel("x", pnlBotones);
        Funciones.agregaBotonAPanel("/", pnlBotones);
        Funciones.agregaBotonAPanel("=", pnlBotones);

        pnlPrincipal.add(pnlBotones);

        frmPrincipal.setVisible(true);
    }
}
