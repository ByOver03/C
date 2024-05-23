package examenficheros.nombres;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class TestNombres {
    

    public static void main(String[] args) {
        
        //Declaramos el Scanner
        Scanner sc= new Scanner(System.in);
        //Declaramos las variables
        String nombre;
        String[] nombres= new String[0];
        String fichero="nombres.dat";
        String seguirString;
        boolean seguir;
        //Le pedimos nombres al usuario hasta que diga que no
        do {
            System.out.println("introduce un nombre");
            nombre = sc.next();
            nombres = Arrays.copyOf(nombres, nombres.length+1);
            nombres[nombres.length -1]= nombre;
            System.out.println("deseas seguir?");
            seguirString=sc.next();
            seguirString= seguirString.toLowerCase();
            if (seguirString.equals("si")) {
                seguir=false;
            } else {
                seguir= true;
            }
        } while (seguir== false);

        escribeFicheroArraysStringToObject(nombres, fichero);
        for (String s : leerFicheroObjectToStringArray(fichero)) {
            System.out.println(s);
        }
        
        sc.close();
        
    }

    //Metodo para escribir en el fichero
    public static void escribeFicheroArraysStringToObject(String[] cadena, String fichero) {    
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(cadena);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }
    //Metodo para leer el fichero
    public static String[] leerFicheroObjectToStringArray(String fichero) {
        String[] cadena = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            cadena = (String[])ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return cadena;
    }
    //Metodo para ordenar los nombres alfabeticamente
    public static int[] ordenar(String[] nombres){
        int[] j = new int[0];
        j= Arrays.copyOf(j, j.length +1);
        return null;
    }
}
