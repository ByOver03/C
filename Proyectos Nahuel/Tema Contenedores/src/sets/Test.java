package sets;

import java.util.HashSet;
import java.util.Set;

public class Test<T> {
    public static void main(String[] args) {
        HashSet<String> conjunto= new HashSet<>();

        String s= "Marica el que lo lea";
        insertar(conjunto, s);

        /*Metodos especificos
         * Set
         *  
         *  -add(Object ob) -- devuelve un booleano(si ya esta este objeto no lo añade y devuelve false) y añade un elemento a la lista
         *  -siza() -- Devuelve el tamaño del conjunto
         *  -remove(Object ob) -- Elimina un objeto - 
         *  -
         * 
         * TreeSet
         * 
         * Va a ordenar(o no) ascendentemente, es decir si este permite un orden natural o utilizamos las interfaces Comparable-Comparator para utilizarlo
         * Este tiene un rendimiento peor que los demas
         * 
         *  -clone() -- devuelve una copia del indicado
         *  -ceiling(Object ob) -- devuelve el valor superior (si existe) de ese parametro en caso de que no, este devolveria null
         *  -floor(Object ob) -- devuelve un elemento igual o inferior de ese parametro, en caso de que no haya uno menor devolvera null
         *  -first(Object ob) -- devuelve una vez ordenados los elementos, el primer elemento
         *  -last(Object ob) -- devuelve el ultimo elemento una vez esten ordenados.
         *  -headSet(Object ob) -- devuelve los elementos menores al introdicido
         *  -tailSet(Object ob) -- devuelve los elementos mayores al introducido
         *  -subSet(int desde, int hasta) --  devuelve los elementos comprendidos entre los especificados(los elementos serian los indices que ocupan)
         * 
         * HashSet
         * 
         * Ofrece el mejor rendimiento de todos los conjuntos
         * 
         * 
         *  -clone() -- devuelve una copia del indicado
         * 
         * LinkedHashSet
         * 
         *  Su rendimiento es parecido al HashSet -- el orden que tiene el conjunto es el de insercion
         * 
         * 
         */
        

         

    }
    
    //esta funcion recorre el contenedor y nos muestra la informacion de este
    private static <T> void recorreSet(Set<T> conjunto){
        for (T elemento: conjunto) {
            System.out.println(elemento);
        }
    }
    //esta funcion intenta insertar elementos en un conjunto generico
    private static <T> void insertar(Set<T> conjunto, T elemento){
        esperar(500);
        if(conjunto.add(elemento)){
            System.out.println("Elemento insertado");
        }else{
            System.out.println("Elemento no insertado");
        }
        recorreSet(conjunto);
    }
    //esta funcion espera el tiempo estipulado por "t"
    private static void esperar(long t){
        try{
            Thread.sleep(t);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


}
