package examenficheros.ocurrencias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestOcurrencias {
    //mostrar contenido del fichero
    //mostrar longitud del contenido del fichero
    //mostrar cadena de texto
    //buscar ocurrencias  de cadna de texto en el fichero

    public static void main(String[] args) {
        String fichero="poema.txt";
        boolean seguido= true;
        int contadorCaracteres=0;

        leerFicheroTextToString(fichero, seguido, contadorCaracteres);
    }

    public static void leerFicheroTextToString(String fichero, boolean seguido, int contador) {
        String linea = "";
        String texto = "";
        try(BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            if (seguido) {
                while ((linea = br.readLine()) != null) {
                    texto += " " + linea;
                    contador++;
                }
            } else {
                while ((linea = br.readLine()) != null) {
                    texto += "\n" + linea;
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
        System.out.println(texto.trim());
        System.out.println(contador);
    }
    public static void leerFicheroPorCaracteres(String fichero, int contador){
        
        try{
        }catch(Exception e){
            
        }
    }
}
