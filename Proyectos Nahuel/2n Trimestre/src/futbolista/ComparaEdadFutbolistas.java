package futbolista;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class ComparaEdadFutbolistas implements Comparator{
    
    public int compare(Object o1, Object o2){
        return ((Futbolista)o2).edat-((Futbolista)o1).edat;
    }
}
