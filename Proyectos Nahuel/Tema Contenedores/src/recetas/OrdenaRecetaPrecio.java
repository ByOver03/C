package recetas;

import java.util.Comparator;

public class OrdenaRecetaPrecio implements Comparator<Receta> {
    @Override
    public int compare(Receta o1, Receta o2) {
        return (int)(o1.getPrecioTotal()-o2.getPrecioTotal());
    }
}
