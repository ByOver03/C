package ejercicio1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Alumno {

    JFrame frm;
    JPanel pnlPrincipal;

    Box boxPrincipal;
    Box boxAlumno;
    Box boxNombre;
    Box boxDNI;
    Box boxEdad;
    Box boxNivel;
    Box boxButons;
    Box boxMenu;

    JLabel alumno;
    JLabel nombre;
    JLabel dni;
    JLabel edad;
    JLabel nivel;

    JTextField txtNombre;
    JTextField txtDNI;
    JTextField txtEdad;

    JRadioButton nivelBasica;
    JRadioButton nivelMedio;
    JRadioButton nivelSuperior;

    JButton btnAceptar;
    JButton btnCerrar;

    JMenuBar mnu;
    public Alumno(){
        frm = creaFormulario("Formulario Alumno", 300,200);
        pnlPrincipal = (JPanel) frm.getContentPane();

        boxPrincipal = Box.createVerticalBox();

        boxAlumno = Box.createHorizontalBox();
        boxNombre = Box.createHorizontalBox();
        boxDNI = Box.createHorizontalBox();
        boxEdad = Box.createHorizontalBox();
        boxNivel = Box.createHorizontalBox();
        boxButons = Box.createHorizontalBox();
        boxMenu = Box.createHorizontalBox();

        alumno = new JLabel("Alumno");
        alumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        nombre = new JLabel("Nombre");
        dni = new JLabel("DNI");
        edad = new JLabel("Edad");
        nivel = new JLabel("Nivel");
        
        txtNombre = new JTextField();
        txtDNI = new JTextField();
        txtEdad = new JTextField();

        nivelBasica = new JRadioButton("B");
        nivelMedio = new JRadioButton("M");
        nivelSuperior = new JRadioButton("S");

        btnAceptar = new JButton("Aceptar");
        btnCerrar = new JButton("Cerrar");
        
        mnu = creaMenu();
        
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
        boxButons.add(btnAceptar);
        boxButons.add(btnCerrar);

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

