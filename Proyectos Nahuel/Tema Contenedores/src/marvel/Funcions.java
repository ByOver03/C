package marvel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Funcions implements  Serializable{

    //Metodo para leer los personajes
    public static void escriurePersonatges(List<Personatge> personatge, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(personatge);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    //Metodo para escribir a los personajes
    @SuppressWarnings("unchecked")
    public static List<Personatge> llegirPersonatges(String fichero) {
        List<Personatge> personatge= null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            personatge = (List<Personatge>)ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return personatge;
    }
    
}
