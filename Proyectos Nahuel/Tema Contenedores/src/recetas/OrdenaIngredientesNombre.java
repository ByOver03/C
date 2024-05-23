package recetas;

import java.util.Comparator;

public class OrdenaIngredientesNombre implements Comparator<Ingrediente> {
    @Override
    public int compare(Ingrediente o1, Ingrediente o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
