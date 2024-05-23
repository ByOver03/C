package tema8.src.binarioObjeto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestionFicheros {
    
    public static void escribeFicheroStringToObject(String cadena, String fichero){
        
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))){
            ous.writeObject(cadena);
        }catch (IOException e) {
            e.getMessage();
        }

    }   
    public static String leeFicheroObjectToString(String fichero) {
        String cadena= "";
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            cadena = (String)ois.readObject();
        }catch (IOException e) {
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
        return cadena;
    }

    public static void escribirFicheroDoubleArrayToObject(String fichero, double[] numerosUsuario){
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))){
            ous.writeObject(numerosUsuario);
        }catch (IOException e) {
            e.getMessage();
        }
    }

    public static double[] leerFicheroObjectToDoubleArray(String fichero){
        double[] numerosUsuario=null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            numerosUsuario = (double[])ois.readObject();
        }catch (IOException e) {
            e.getMessage();
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
        return numerosUsuario;
    }
}
