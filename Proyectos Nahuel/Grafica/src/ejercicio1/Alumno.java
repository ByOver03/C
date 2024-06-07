package ejercicio1;

import java.awt.Font;

import javax.swing.*;

public class Alumno {
    public Alumno(){
        JFrame frm = creaFormulario("Formulario Alumno", 300,200);
        JPanel pnlPrincipal = (JPanel) frm.getContentPane();

        Box boxPrincipal = Box.createVerticalBox();

        Box boxAlumno= Box.createHorizontalBox();
        Box boxNombre = Box.createHorizontalBox();
        Box boxDNI = Box.createHorizontalBox();
        Box boxEdad = Box.createHorizontalBox();
        Box boxNivel = Box.createHorizontalBox();
        Box boxButons = Box.createHorizontalBox();
        Box boxMenu = Box.createHorizontalBox();

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
        
        JMenuBar mnu = creaMenu();
        
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

        boxMenu.add(mnu);

        boxPrincipal.add(mnu);
        boxPrincipal.add(boxAlumno);
        boxPrincipal.add(boxNombre);
        boxPrincipal.add(boxDNI);
        boxPrincipal.add(boxEdad);
        boxPrincipal.add(boxNivel);
        boxPrincipal.add(boxButons);

        pnlPrincipal.add(boxPrincipal);
        
        frm.setVisible(true);

    }
    private JFrame creaFormulario(String caption, int ancho, int alto){
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setSize(ancho, alto);
        frm.setLocationRelativeTo(null);
        return frm;

    }
    private JMenuBar creaMenu(){
        //Creamos menu
        //Items
        JMenuItem mniLeerFichero= new  JMenuItem("Leer Fichero");
        JMenuItem mniBorrarFichero = new JMenuItem("Borrar Fichero");
        //Barra
        JMenuBar mnb = new JMenuBar();
        //Menu
        JMenu mnu = new JMenu("Ficheros");
        //Añadir Items a Menu
        mnu.add(mniLeerFichero);
        mnu.add(mniBorrarFichero);
        //Añadir menu a barra
        mnb.add(mnu);

        return mnb;
    }
}
