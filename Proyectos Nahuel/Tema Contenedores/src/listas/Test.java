package listas;

import java.util.ArrayList;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        
      //List
      //es una coleccion que almacena los elementos junto a un identificador asociado a cada elemento

      /*
      * Es una interface que cuelgan Arraylist Linkedlist y Vectors
      * Es de tamaño variable -- se puede acceder a los elementos de la coleccion (leer, editar, eliminar) a traves de su posicion
      * Puede contener elemntos duplicados
      */

      ArrayList<String> lista1 = new ArrayList<>();
      //Vector<String> lista2= new Vector<>();
      //LinkedList<String> lista3 = new LinkedList<>();

      List<String> lista4 = new ArrayList<>();

      //Metodos Basicos de List(Generales)

      /*
      * add(Object o) -- lista4.add("hola")
      * add(int pos, Object o) -- lista4.add(5, "hola")
      * 
      */

      lista4.add("Jose");
      lista4.add("es");
      lista4.add("un");
      lista4.add("maricon");
      lista4.add("y");
      lista4.add("Nahuel");
      lista4.add("tambien");
      //for(int i = 0; i< lista4.size(); i++){
      //  System.out.println(lista4.get(i));
      //}

      // for (String string : lista4) {
      //   System.out.println(string);
      // }
      // int i = lista4.indexOf("maricon");

      // System.out.println(i);

      // lista4.clear();

      lista1.add("marica");
      lista1.add("el que lo lea");

      lista4.addAll(lista1);

      for (String string : lista4) {
        System.out.println(string);
      }

      /*Metodos exclusivos linkedlist
       * addfirst(Object o) -- añade ese elemento al inicio de la lista
       * addLast(Object o) -- añade ese elemento al final de la lista
       * getFirst() -- recoge el primer elemento de la lista
       * getLast() -- recoge el ultimo elemento de la lista
       * peek() -- devuelve el primer elemento de la lista
       * poll() -- devuelve y elimina el primer elemento de la lista
       * removeFirst() -- devielve y elimina el primer elemento de la lista
       * removeLast() -- devuelve y elimina el ultimo elemento de la lista
       */

       /*Metodos exclusivos de ArrayList
        * clone() -- devuelve im boleano
        * removeRange() -- ¯\º/¯
        */

        /*Metodos exclusivos de Vector
         * ensureCapacity(int tamaño) -- Da un Vector un minimo de capacidad
         * copyInto(Array[] array) -- copia su contenido en un array
         */
    }

    
}