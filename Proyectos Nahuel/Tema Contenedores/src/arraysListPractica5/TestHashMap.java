package arraysListPractica5;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hs= new HashMap<>();

        String[] nombres= new String[10];
        
        nombres[0]= "Jose";
        nombres[1]= "Nahuel";
        nombres[2]= "Iker";
        nombres[3]= "Guiem";
        nombres[4]= "Robo";
        nombres[5]= "Ametller";
        nombres[6]= "Tommy";
        nombres[7]= "Gabi";
        nombres[8]= "Yoshwa";
        nombres[9]= "Nahewl";


        //Foreach para ir registrando cada nombre en el hasMap
        for (String string : nombres) {
            
            int random=(int)(Math.random()*99)+1;
            
            //Este while lo que hace es que si la clave se repite la vuelve a hacer
            while(hs.containsKey(random)){
                random=(int)(Math.random()*99)+1;
            }
            hs.put(random, string);
        }

        //Este for each imprime el HashMap
        for (Integer integer : hs.keySet()) {
            System.err.println("Clave: " + integer + " Valor: "  + hs.get(integer));
        }

        

    }
    
}