package futbolista;

import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class ComparaNombreFutbolistas implements Comparator{
    
    public int compare(Object o1, Object o2){
        Futbolista f1 = (Futbolista)o1;
        Futbolista f2 = (Futbolista)o2;


        
        return f1.nom.compareTo(f2.nom);
    }
}
