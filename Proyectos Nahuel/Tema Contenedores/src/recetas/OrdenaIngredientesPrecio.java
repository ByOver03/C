package recetas;

import java.util.Comparator;

public class OrdenaIngredientesPrecio implements Comparator<Ingrediente> {

    @Override
    public int compare(Ingrediente o1, Ingrediente o2) {
        return (int)(o1.getPrecio()-o2.getPrecio());
    }
    
}
