package primo;

import java.util.ArrayList;
import java.util.List;

public class Primo {
    static boolean esPrimer(Integer n){
        
        int contador= 0;
        for (int i = 1; i < n; i++) {
            if (n% i == 0) {
                contador++;
            }
        }
        if (contador== 2) {
            return true;
        }
        return false;
    }
    
    static List<Integer> cienNumeros(){
        List<Integer> numeros = new ArrayList<>();
        int n;
        do {
                
                n= (int)(Math.random()*1000)+1;
                if(!esPrimer(n)){
                    numeros.add(n);
                }
        } while (numeros.size()!=100);
        return numeros;
    }

    
}
