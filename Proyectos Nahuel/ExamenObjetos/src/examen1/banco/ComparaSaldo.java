package examen1.banco;

import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class ComparaSaldo implements Comparator{
    
    public int compare(Object o1, Object o2){
        Persona p1 = (Persona)o1;
        Persona p2 = (Persona)o2;

        return (int)(p2.saldodelacuenta()-  p1.saldodelacuenta());
    }
}
