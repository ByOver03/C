package coches;

import java.util.Iterator;
import java.util.TreeSet;

public class CarreraCoches {
    TreeSet<Coche> coches;

    //Constructor
    CarreraCoches(TreeSet<Coche> coches){
        this.coches= coches;
    }
    
    //Metodo para añadir un coche
    void añadirCoche(Coche coche){
        coches.add(coche);
        
    }

    //Metodo para eliminar un coche
    void eliminarCoche(String nombre){
        Iterator<Coche> eliminador = coches.iterator();
        Coche coche;

        do{
            coche= eliminador.next();
            if(coche.getNombre().equals(nombre)){
                eliminador.remove();
            }
        }while(eliminador.hasNext());
    }


    //Metodo para retornar el ganador
    Coche getGuanyador(){
        
        double maximo = 0; // Inicializar con el valor mínimo posible de double
        
        for (Coche coche : coches) {
                if (coche.getVelocidad_maxima() > maximo) {
                    maximo = coche.getVelocidad_maxima();
                }
        }
        Iterator<Coche> coche = coches.iterator();
        Coche c;
        do{
            c=coche.next();
            if(c.getVelocidad_maxima()== maximo){
                return c;
            }
        }while(coche.hasNext());
        return null;
        
    }
}
