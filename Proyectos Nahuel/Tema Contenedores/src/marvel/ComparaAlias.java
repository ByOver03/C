package marvel;

import java.util.Comparator;

public class ComparaAlias implements Comparator<Personatge>{

    @Override
    public int compare(Personatge o1, Personatge o2) {
        return o1.getAlias().compareTo(o2.getAlias());
    }

    
    
}
