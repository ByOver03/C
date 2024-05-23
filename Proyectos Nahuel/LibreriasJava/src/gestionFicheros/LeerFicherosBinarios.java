package gestionFicheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeerFicherosBinarios {
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
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T>List<T> leerFicheroObjetoAListaGenerica(String fichero){
        List<T> lista= null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            lista = (List)ois.readObject();
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            System.out.println("Error de conversion de datos: " + e.getMessage());
        }
        return lista;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static<T> Set<T> leerFicheroObjetoASetGenerico(String fichero){
        Set<T> set = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            set = (Set)ois.readObject();
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            System.out.println("Error de conversion de datos: " + e.getMessage());
        }
        return set;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T,V> Map<T,V> leerFicheroObjetoAMapaGenerico(String fichero){
        Map<T,V> mapa = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            mapa = (Map)ois.readObject();
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            System.out.println("Error de conversion de datos: " + e.getMessage());
        }
        return mapa;
    }
}
