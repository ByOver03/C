package paradojagemelos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Funcions implements Serializable {
    //Metodo para leer el archivo binario
    public static void escriurePersonatges(Map<List<Besso>, Integer> plantilla, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(plantilla);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }
    //Metodo para leer el fichero binario
    @SuppressWarnings("unchecked")
    public static Map<List<Besso>, Integer> llegirPersonatges(String fichero) {
        Map<List<Besso>, Integer> plantilla= null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            plantilla = (Map<List<Besso>, Integer>)ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return plantilla;
    }
    //Metoddo para calcular la edad del gemelo que se ha quedado en la tierra una vez el que viaja ha vuelto

    public static int tiempoDiferencia(int tiempoviaje, double velocidad){
        int tiempogemelo;
        tiempogemelo= (int)(tiempoviaje/(Math.sqrt(1-velocidad)));
        return tiempogemelo;
    }

    //Metodo para actualizar la edad del que se queda en la tierra
    public static void nuevaEdad(Map<List<Besso>, Integer> bessons, int añosnuevos, String nombre){
        for (List<Besso> besso : bessons.keySet()) {
            for (Besso besso2 : besso) {
                if (besso2.getNombre().equals(nombre)) {
                    besso2.setEdad(besso2.getEdad()+añosnuevos);
                }
            }
        }
        
        
    }
}
