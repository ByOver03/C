package hashMap;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        //A)

        
        Map<Integer,String> hm=  new HashMap<>();

        //B)

        hm.put(31, "HOLA");
        hm.put(25, "ADIOS");
        hm.put(45, "BUENAS");
        hm.put(18, "Hello");
        hm.put(99, "CIAO");


        //C)

        hm.replace(45, "Malas");
        System.out.println(hm.get(45));

        //D)

        System.out.println(hm.size());

        //E)

        hm.remove(18);
        System.out.println(hm.get(18));

        //F)

        System.out.println(hm.get(99));

        //G)

        for (Integer integer : hm.keySet()) {
            System.err.println(integer);
        }

        //H)

        for (String string : hm.values()) {
            System.out.println(string);
        }

        //I)

        System.out.println(hm.containsKey(45));

        //J)

        hm.clear();


    }
}
