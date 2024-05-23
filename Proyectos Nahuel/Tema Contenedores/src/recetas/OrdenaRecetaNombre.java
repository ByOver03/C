package recetas;

import java.util.Comparator;

public class OrdenaRecetaNombre implements Comparator<Receta> {
    @Override
    public int compare(Receta o1, Receta o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
