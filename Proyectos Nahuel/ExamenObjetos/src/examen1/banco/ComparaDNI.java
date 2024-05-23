package examen1.banco;

import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class ComparaDNI implements Comparator {

    public int compare (Object o1, Object o2){
        Persona p1 = (Persona)o1;
        Persona p2 = (Persona)o2;

        return p1.dni.compareTo(p2.dni);
    }
    
}
