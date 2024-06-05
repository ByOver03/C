package eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Editor {

	JFrame frmPrincipal;
	JPanel pnlPrincipal;
	JTextField txtNorte = new JTextField("0");
	JTextArea txtAreaCentro = new JTextArea("Área Centro");
	JButton btnEntrar = new JButton("Entrar");
	JButton btnReset = new JButton("Reset");
	
	JPanel pnlBotones;
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btnMas = new JButton("+");
	
	String caption = "";
	
	
	public Editor() {
		pnlPrincipal = new JPanel();
		String caption = "BorderLayout con Eventos";
		int ancho = 600;
		int alto = 600;
		frmPrincipal = Funciones.creaFormulario(caption, ancho, alto);
		pnlPrincipal = (JPanel) frmPrincipal.getContentPane();
		pnlPrincipal.setLayout(new BorderLayout());
		
		pnlBotones = new JPanel();
		pnlBotones.setLayout(new GridBagLayout());
		
		GridBagConstraints gbcValores = new GridBagConstraints();
		gbcValores.gridx = 0;
		gbcValores.gridy = 0;
		gbcValores.gridwidth = 1;
		gbcValores.gridheight = 1;
		gbcValores.weightx = 0.0;
		gbcValores.weighty = 1.0;
		gbcValores.anchor = GridBagConstraints.CENTER;
		gbcValores.fill = GridBagConstraints.BOTH;
		pnlBotones.add(btn1, gbcValores);
		gbcValores.gridx = 1;
		gbcValores.gridy = 0;
		gbcValores.gridwidth = 1;
		gbcValores.gridheight = 1;
		gbcValores.weightx = 0.0;
		gbcValores.weighty = 1.0;
		gbcValores.anchor = GridBagConstraints.CENTER;
		gbcValores.fill = GridBagConstraints.BOTH;
		pnlBotones.add(btn2, gbcValores);
		gbcValores.gridx = 0;
		gbcValores.gridy = 1;
		gbcValores.gridwidth = 2;
		gbcValores.gridheight = 1;
		gbcValores.weightx = 0.0;
		gbcValores.weighty = 1.0;
		gbcValores.anchor = GridBagConstraints.CENTER;
		gbcValores.fill = GridBagConstraints.BOTH;
		pnlBotones.add(btnMas, gbcValores);
		gbcValores.gridx = 0;
		gbcValores.gridy = 2;
		gbcValores.gridwidth = 2;
		gbcValores.gridheight = 1;
		gbcValores.weightx = 0.0;
		gbcValores.weighty = 1.0;
		gbcValores.anchor = GridBagConstraints.CENTER;
		gbcValores.fill = GridBagConstraints.BOTH;
		pnlBotones.add(btnEntrar, gbcValores);
		
		pnlPrincipal.add(txtNorte, BorderLayout.NORTH);
		pnlPrincipal.add(txtAreaCentro, BorderLayout.CENTER);

		//Menu
		JMenuItem itemLeerFichero = new JMenuItem("Leer Fichero");
		JMenuBar barMenuPrincipal = new JMenuBar();
		JMenu menuFicheros = new JMenu("Menú");

		menuFicheros.add(itemLeerFichero);
		barMenuPrincipal.add(menuFicheros);
		frmPrincipal.add(barMenuPrincipal);

		btnEntrar.addActionListener(new btnEntrarActionListener());
		btn1.addActionListener(new btn1ActionListener());
		btn2.addActionListener(new btn2ActionListener());
		btnMas.addActionListener(new btnMasActionListener());
		
		pnlPrincipal.add(pnlBotones, BorderLayout.EAST);
		
		btnReset.addActionListener(new btnResetActionListener());
		pnlPrincipal.add(btnReset, BorderLayout.SOUTH);
		
		
		frmPrincipal.setVisible(true);
	}
	
	private class btnEntrarActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {			
			String[] a = caption.split("\\+");
			
			int suma = 0;
			
			
			for(int i=0; i < a.length; i++) {
				try {
					suma += Integer.valueOf(a[i]);
				}catch (Exception ex) {
		
				}
				
				
			}
			
			String s = String.valueOf(suma);
			try {
				txtAreaCentro.setText(txtAreaCentro.getText()+"\n"+s);
			}catch (Exception ex) {
				txtAreaCentro.setText("error");
			}
		
			
		}
	}
	
	private class btnResetActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			caption = "";
			//txtAreaCentro.setText("");
			txtNorte.setText("");
		}
	}
	
	private class btn1ActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			caption += "1";
			txtNorte.setText(caption);
			
		}
	}
	private class btn2ActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			caption += "2";
			txtNorte.setText(caption);
		}
	}
	private class btnMasActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			caption += "+";
			txtNorte.setText(caption);
		}
	}
}
