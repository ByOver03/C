package fruta;

import java.util.ArrayList;
import java.util.Iterator;

public class BotigaDeFruites {
    
    //Atributos
    ArrayList<Fruit> frutas;

    //Constructor
    BotigaDeFruites(ArrayList<Fruit> frutas){
        this.frutas= frutas;
    }
    //Metodo para añadir una fruta a la lista
    void afegirFruit(Fruit fruit){
        frutas.add(fruit);
    }

    //Metodo para eliminar una fruta de la lista
    void eliminarFruit(String nom){

        Fruit numeroActual;
        
        Iterator<Fruit> fruit = frutas.iterator();
        do{
            numeroActual= fruit.next();
            if(numeroActual.getNombre().equals(nom)){
                fruit.remove();
            }
        }while(fruit.hasNext());
        
    }

    //Metodo para devolver el precvio total de todas las frutas
    double getPreuTotal(){
        Fruit numeroActual;
        double total=0;
        Iterator<Fruit> fruit = frutas.iterator();
        do{
            numeroActual= fruit.next();
            double precio= numeroActual.getPrecio();
            total +=precio;
            
            
        }while(fruit.hasNext());
        return total;
    }

    
}
