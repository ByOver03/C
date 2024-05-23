package examen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

public class TratamientoFicheros implements Serializable{
    //Metodo para escribir en el Fichero binario
    public static void escriurePersonatges(Map<Integer, Jugador> plantilla, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(plantilla);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    //Metodo para leer el fichero binario
    public static Map<Integer, Jugador> llegirPersonatges(String fichero) {
        Map<Integer, Jugador> plantilla= null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            plantilla = (Map<Integer, Jugador>)ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return plantilla;
    }
}
