package gestionFicheros;

import java.io.BufferedReader;  
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFicherosTexto {
    // Este metodo escribe en un fichero una cadena de texto (el boolean append es para saber si debe sobreescribir el fichero si ya existe o no)
    public static void escribirFicheroStringToText(String cadena, String fichero, boolean append) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, append))) {
            bw.write(cadena);
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }

    // Este metodo escribe un salto de linea en el fichero
    public static void saltoDeLinea(String fichero) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true))) {
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve en forma de cadena (el boolean seguido es para saber si coger los datos del archivo y colocar como estan los saltos de linea o ponerlos todos en la misma)
    public static String leerFicheroTextToString(String fichero, boolean seguido) {
        String linea = "";
        String texto = "";
        try(BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            if (seguido) {
                while ((linea = br.readLine()) != null) {
                    texto += " " + linea;
                }
            } else {
                while ((linea = br.readLine()) != null) {
                    texto += "\n" + linea;
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
        return texto.trim();
    }


}
