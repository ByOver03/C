package examen1.banco;

import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class ComparaHoras implements Comparator {

    public int compare(Object o1, Object o2){
        Persona p1 = (Persona)o1;
        Persona p2 = (Persona)o2;

        return p2.numerodehorastrabajadas()- p1.numerodehorastrabajadas();
    }
    
}
