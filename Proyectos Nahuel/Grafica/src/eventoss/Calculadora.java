package eventoss;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    JFrame frmPrincipal;
    JPanel pnlPrincipal;
    JTextField txtVista;
    JTextArea txtArea;
    JButton btn1;
    JButton btn2;
    JButton btnMas;
    JButton btnEnter;
    JButton btnReset;

    public Calculadora() {
        frmPrincipal = creaFormulario("Calculadora", 500, 300);
        pnlPrincipal = (JPanel) frmPrincipal.getContentPane();

        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        JPanel panelDerecho = new JPanel(new BorderLayout());
        JPanel panelSuperiorDerecho = new JPanel();

        txtVista = new JTextField("0");
        txtArea = new JTextArea();

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btnMas = new JButton("+");
        btnEnter = new JButton("Enter");
        btnReset = new JButton("Reset");

        btn1.addActionListener(new btnSumasActionListener());
        btn2.addActionListener(new btnSumasActionListener());
        btnMas.addActionListener(new btnSumasActionListener());

        panelSuperiorDerecho.add(btn1);
        panelSuperiorDerecho.add(btn2);

        panelDerecho.add(panelSuperiorDerecho, BorderLayout.NORTH);
        panelDerecho.add(btnMas, BorderLayout.CENTER);
        panelDerecho.add(btnEnter, BorderLayout.SOUTH);

        panelIzquierdo.add(txtVista, BorderLayout.NORTH);
        panelIzquierdo.add(txtArea, BorderLayout.CENTER);
        panelIzquierdo.add(btnReset, BorderLayout.SOUTH);

        pnlPrincipal.add(panelIzquierdo, BorderLayout.WEST);
        pnlPrincipal.add(panelDerecho, BorderLayout.EAST);







        frmPrincipal.setVisible(true);
    }


    private class btnSumasActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String caption = "";
            caption += ((JButton) e.getSource()).getText();

            txtVista = new JTextField(caption);
        }
    }

    @SuppressWarnings("unused")
    private class BtnEnterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    public static JFrame creaFormulario(String caption, int ancho, int alto){
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setSize(ancho, alto);
        frm.setLocationRelativeTo(null);
        return frm;

    }
}
