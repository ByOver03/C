package ejercicio1;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Alumno implements Serializable{

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
    Box boxArea;

    JLabel alumno;
    JLabel nombre;
    JLabel dni;
    JLabel edad;
    JLabel nivel;

    JTextField txtNombre;
    JTextField txtDNI;
    JTextField txtEdad;

    JTextArea txtAlumno;

    JRadioButton nivelBasica;
    JRadioButton nivelMedio;
    JRadioButton nivelSuperior;

    JButton btnAceptar;
    JButton btnCerrar;

    JMenuBar mnb;
    JMenuItem mniLeerFichero;
    JMenuItem mniBorrarFichero;
    JMenu mnu;

    public Alumno(){
        frm = creaFormulario("Formulario Alumno", 500,300);
        pnlPrincipal = (JPanel) frm.getContentPane();

        boxPrincipal = Box.createVerticalBox();

        boxAlumno = Box.createHorizontalBox();
        boxNombre = Box.createHorizontalBox();
        boxDNI = Box.createHorizontalBox();
        boxEdad = Box.createHorizontalBox();
        boxNivel = Box.createHorizontalBox();
        boxButons = Box.createHorizontalBox();
        boxMenu = Box.createHorizontalBox();
        boxArea = Box.createHorizontalBox();

        alumno = new JLabel("Alumno");
        alumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        nombre = new JLabel("Nombre");
        dni = new JLabel("DNI");
        edad = new JLabel("Edad");
        nivel = new JLabel("Nivel");
        
        Dimension size = new Dimension(300,25);
        Dimension size2 = new Dimension(25,25);

        txtNombre = new JTextField();
        txtNombre.setMaximumSize(size);
        txtDNI = new JTextField();
        txtDNI.setMaximumSize(size);
        txtEdad = new JTextField();
        txtEdad.setMaximumSize(size2);;

        nivelBasica = new JRadioButton("B");
        nivelBasica.addActionListener(new desSeleccionar());
        nivelMedio = new JRadioButton("M");
        nivelMedio.addActionListener(new desSeleccionar());
        nivelSuperior = new JRadioButton("S");
        nivelSuperior.addActionListener(new desSeleccionar());

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new MnuLeerFichero());
        btnCerrar = new JButton("Cerrar");

        txtAlumno = new JTextArea();
        
        
        mnb = creaMenu();
        
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

        boxMenu.add(mnb);

        boxArea.add(txtAlumno);

        boxPrincipal.add(boxMenu);
        boxPrincipal.add(boxAlumno);
        boxPrincipal.add(boxNombre);
        boxPrincipal.add(boxDNI);
        boxPrincipal.add(boxEdad);
        boxPrincipal.add(boxNivel);
        boxPrincipal.add(boxButons);
        boxPrincipal.add(boxArea);

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
        mniLeerFichero= new  JMenuItem("Leer Fichero");
        mniBorrarFichero = new JMenuItem("Borrar Fichero");
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
    private class desSeleccionar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(nivelBasica.isSelected()){
                nivelMedio.setSelected(false);
                nivelSuperior.setSelected(false);
            }else if (nivelMedio.isSelected()) {
                nivelBasica.setSelected(false);
                nivelSuperior.setSelected(false);
            }else if (nivelSuperior.isSelected()) {
                nivelBasica.setSelected(false);
                nivelMedio.setSelected(false);
            }
            
        }
    }
    private class MnuLeerFichero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String nivel = nivelBasica.isSelected() ? "Grado Basico" : nivelMedio.isSelected() ? "Grado Medio ": "Grado Superior";
            String guardar= "Nombre: " + txtNombre.getText() + ", DNI: " + txtDNI.getText() + ", Edad: " + txtEdad.getText() + ", Nivel: " + nivel ;
            String fichero = "Alumnos.dat";
            if(txtNombre.getText().equals("")||txtEdad.getText().equals("")||txtDNI.getText().equals("")||(!nivelBasica.isSelected()&& !nivelMedio.isSelected() &&!nivelSuperior.isSelected())){
                txtAlumno.setText("Introduzca la informacion necesaria en todos los campos");
            }else{
            escribeFicheroGenericoToObject(guardar, fichero);
            txtAlumno.setText((String)leerFicheroObjectToGenerico(fichero));
            
            txtDNI.setText("");
            txtEdad.setText("");
            txtNombre.setText("");
            nivelBasica.setSelected(false);
            nivelMedio.setSelected(false);
            nivelSuperior.setSelected(false);
            }
        }
        
    }
    
    
    public static <T> void escribeFicheroGenericoToObject(T cadena, String fichero) {    
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(cadena);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    public static <T>T leerFicheroObjectToGenerico(String fichero) {
        T cadena = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            cadena = (T)ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return cadena;
    }
    
}

