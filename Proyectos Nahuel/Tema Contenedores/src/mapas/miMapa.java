package mapas;


import java.util.Iterator;
import java.util.ArrayList;


public class miMapa {
    public static void main(String[] args) {
        //Map<Integer,String> miMapa = new HashMap<>();

//         miMapa.put(20, "Pedro");
//         miMapa.put(33, "Ana");
//         miMapa.put(12, "Juan");
//        
//        for (Integer integer : miMapa.keySet()) {
//            System.out.println("Clave: " +integer + "Valor: " + miMapa.get(integer));
        
        
//        }
        
        ArrayList<String> lista= new ArrayList<>();
        
        lista.add("Joan");
        lista.add("Joan");
        lista.add("Jose");
        lista.add("Joan");
        lista.add("Joan");
        
        Iterator<String> i = lista.iterator();

        /*Metodos Iterator
         * 
         *  hasNext() -- Indica si hay mas elementos a devolver(devuelve un bolean)
         *  next() -- devuelve el siguiente elemento de la lista si existe y avanza el puntero hacia el siguiente elemento
         *  remove() -- elimina el elemento actual(donde este el puntero)
         * 
         *  Se suele utilizar un do while para revoger el iterador
         */

         while(i.hasNext()){
          String nombre= i.next();
          System.out.println(nombre);
          i.remove();
         }
		}
    }

