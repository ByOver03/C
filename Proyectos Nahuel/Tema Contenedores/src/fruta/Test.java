package fruta;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        
        //Declaramos variables
        ArrayList<Fruit> frutas = new ArrayList<>();
        BotigaDeFruites bdf= new BotigaDeFruites(frutas);
        Fruit a= new Fruit("Banana", 3.3);
        Fruit b= new Fruit("Papaya", 1.2);
        Fruit c= new Fruit("Melon", 2.5);
        Fruit d= new Fruit("Sandia", 2.0);
        Fruit e= new Fruit("Piña", 5.4);


        //Añadimos elementos a la lista
        bdf.afegirFruit(a);
        bdf.afegirFruit(b);
        bdf.afegirFruit(c);
        bdf.afegirFruit(d);
        bdf.afegirFruit(e);

        //Mostramos los elementos
        testIterator(frutas);

        //Mostramos el precio total de todas las frutas
        System.out.println("El precio total es: " + bdf.getPreuTotal());

        //Eliminamos el elemento indicado
        bdf.eliminarFruit("Melon");

        //Volvemos a mostrar la lista despues de eliminar el elemento
        testIterator(frutas);
    }
    //Recorrer coleccion de BotigaDeFruites con un iterator
    static void testIterator(ArrayList<Fruit> frutas){
        BotigaDeFruites frut = new BotigaDeFruites(frutas);
        Iterator<Fruit> fruta= frut.frutas.iterator();

        while(fruta.hasNext()){
            Fruit fruit = fruta.next();
            System.out.println(fruit.toString());
        }
    }
}
