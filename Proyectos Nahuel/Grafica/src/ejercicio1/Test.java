package ejercicio1;

import java.awt.Font;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        
        JFrame frm = creaFormulario("Formulario Alumno", 300,200);
        JPanel pnlPrincipal = (JPanel) frm.getContentPane();

        Box boxPrincipal = Box.createVerticalBox();

        Box boxAlumno= Box.createHorizontalBox();
        Box boxNombre = Box.createHorizontalBox();
        Box boxDNI = Box.createHorizontalBox();
        Box boxEdad = Box.createHorizontalBox();
        Box boxNivel = Box.createHorizontalBox();
        Box boxButons = Box.createHorizontalBox();

        JLabel alumno = new JLabel("Alumno");
        alumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        JLabel nombre = new JLabel("Nombre");
        JLabel dni = new JLabel("DNI");
        JLabel edad = new JLabel("Edad");
        JLabel nivel = new JLabel("Nivel");
        
        JTextField txtNombre = new JTextField();
        JTextField txtDNI = new JTextField();
        JTextField txtEdad = new JTextField();

        JRadioButton nivelBasica = new JRadioButton("B");
        JRadioButton nivelMedio = new JRadioButton("M");
        JRadioButton nivelSuperior = new JRadioButton("S");

        JButton aceptar = new JButton("Aceptar");
        JButton cerrar = new JButton("Cerrar");
        
        
        
        boxAlumno.add(alumno);
        boxNombre.add(nombre);
        boxNombre.add(txtNombre);
        boxDNI.add(dni);
        boxDNI.add(txtDNI);
        boxEdad.add(edad);
        boxEdad.add(txtEdad);
        boxNivel.add(nivel);
        boxNivel.add(nivelBasica);
        boxNivel.add(nivelMedio);
        boxNivel.add(nivelSuperior);
        boxButons.add(aceptar);
        boxButons.add(cerrar);

        boxPrincipal.add(boxAlumno);
        boxPrincipal.add(boxNombre);
        boxPrincipal.add(boxDNI);
        boxPrincipal.add(boxEdad);
        boxPrincipal.add(boxNivel);
        boxPrincipal.add(boxButons);

        pnlPrincipal.add(boxPrincipal);
        
        


        frm.setVisible(true);
        
    }
    static JFrame creaFormulario(String caption, int ancho, int alto){
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setSize(ancho, alto);
        frm.setLocationRelativeTo(null);
        return frm;

    }
}
