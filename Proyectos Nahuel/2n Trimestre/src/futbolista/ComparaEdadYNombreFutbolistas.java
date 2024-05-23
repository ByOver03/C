package futbolista;
import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class ComparaEdadYNombreFutbolistas implements Comparator {
    
    public int compare(Object o1, Object o2){
        Futbolista f1 = (Futbolista)o1;
        Futbolista f2 = (Futbolista)o2;
        
        if(f1.edat==f2.edat){
            return f1.nom.compareTo(f2.nom);
        }else{
            return ((Futbolista)o2).edat-((Futbolista)o1).edat;
        }
    }
}
