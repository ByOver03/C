package mapas;


import java.util.*;

public class Teoria {
    public static void main(String[] args) {
        /*Map
         * 
         * No tienen un indice numerico -- tienen un indice propio que se añade segun el valor
         * El indice pasa a llamarse "Clave" -- Las claves seran diferentes mientras que los valores se podran repetir
         * 
         * Caracteristicas
         * 
         *  HashMap / TreeMap /  HasTable / LinkedHashMap
         * 
         *  Como en cualquiera no se pueden utilizar tipos primitivos, si no que se han de utilizar sus Clases
         *  Cuando declaramos un mapa habra que indicarle el tipo de clave y el tipo de valor de antemano
         *  No se pueden tener claves duplicadas
         *
         */

         //Map<Integer, String> hm = new HashMap<>();
         //Map<Integer, String> tm = new TreeMap<>();
         //Map<String, Integer> ht = new Hashtable<>();
         //Map<Integer,String> lhm = new LinkedHashMap<>();

        /*Metodos Map
         * put() -- Devuelve un objeto de valor String
         * get() -- Devuelve un valor como el indicado anteriormente
         * replace() -- Devuelve un boolean -- reemplaza un valor segun la posicion indicada por otro valor introducido por ti mismo(El valor debe existir para poder cambiarse)
         * size() -- Imprime el tamaño
         * remove() -- devuelve el valor eliminado elegido por el indice introducido -- cuando se intenta leer el elemento con ese indice devolvera null
         * clear() -- elimina todos los datos introducidos
         * containsKey() -- Devuelve un boolean -- Nos dice si existe un valor por el indice introducido
         * conteinsValue() -- Devuelve un Boolean -- Nos dice si el Valor introducido existe
         * values() -- devuelve todos los valores que hemos introducido
         * keySet() -- devuelve los indices introducidos
         * isEmpty() -- duevuelve un boolean -- nos dice si esta vacia
         * 
         */
        // String valor= tm.put(5, "Hola");
        // tm.put(-1, "Eres");
        // tm.put(0, "Un");
        // tm.put(99, "Hola");
        // tm.put(3, "Marica");

        // //System.out.println(tm.get(99));

        // //tm.replace(3, "adios");
        // //System.out.println(tm.get(3));

        // ArrayList<String> al= new ArrayList<>(tm.values());

        // for (String string : al) {
        //     System.out.println(string);
        // }

        // TreeSet<Integer> ts = new TreeSet<>(tm.keySet());

        // for (Integer integer : ts) {
        //     System.out.println(integer);
        // }

        // Set<Entry<Integer, String>> ss = tm.entrySet();

        

        /*Metodos especificos
         * 
         * TreeMap
         * 
         *  ceilingMap(clave) -- Devuelve el valor asociado a la siguiente clave superior
         *  floorEntry(clave) -- Devuelve el valor anterior a la clave introducida
         *  ceilingKey(clave) -- devuelve la clave superior
         *  floorKey(clave) -- devuelve la clave anterior
         *  firstEntry(clave) -- con los elementos ordenados el valor del valor de clave mas bajo
         *  firstKey(clave) -- devuelve la clave mas baja en caso de que esten ordenados
         *  lastEntry(clave) -- devuelve el valor mas alto
         *  lastKey(clave) -- devuelve la clave mas alta
         *  
         *  Nos garantiza que sus elementos estan ordenados ascendentemente por la clave(siempre que esta lo permita por orden natural)
         *  No se puede ordenar nunca por valor
         * 
         * HashMap
         *  
         *  clone() -- devuelve una copia de ese mapa
         * 
         *  No se puede garantizar el orden de los elementos, en tiempo de ejecucion puede cambiar el orden
         *  Puede tener claves null y valores null(Solo puede haber uno)
         * 
         * HashTable
         * 
         *  Muy parecifo a HashMap
         *  No permite claves ni valores null
         *  Rinde peor que el HashMap
         * 
         * LinkedHashMap
         *  
         *  Similar al HasMap
         *  Los valores tienen orden de insercion
         * 
         * 
         * 
         *  enterySet -- Map.Entry -- Metodos
         *  getValue() getKey()
         */

         //Como recorrer un MAPA

         //No se puede utilizar un for each


         Map<Integer,String> miMapa = new HashMap<>();

         miMapa.put(20, "Pedro");
         miMapa.put(33, "Ana");
         miMapa.put(12, "Juan");

         //Recorrer Valores

            // for (String string : miMapa.values()) {
            //     System.out.println(string);
            // }

            // Collection<String> valores = miMapa.values();

            // for (String string : valores) {
            //     System.out.println(string);
            // }

            //Recorrer las claves

            // for (Integer integer : miMapa.keySet()) {
            //     System.out.println(integer);
            // }

            // Collection<Integer> claves= miMapa.keySet();

            // for (Integer integer : claves) {
            //     System.out.println(integer);
            // }

            //Recorer Claves y Valores

            for (Integer integer : miMapa.keySet()) {
                System.out.println("Clave: " +integer + "Valor " + miMapa.get(integer));
            }
    }
}
