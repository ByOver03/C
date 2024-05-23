package socios;
import java.util.Comparator;
@SuppressWarnings("rawtypes")
public class ComparaEdades implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        //Socio sp2 = (Socio)o2;
        return ((Socio)o1).edad() - ((Socio)o2).edad();
    }
    

}
