package generador;

public class GeneraCadenas {

    public static String generadorDNIs(){
        String s ="";
        
        for (int i = 1; i < 8; i++) {
            int n=(int)(Math.random()*9)+1;
            s += String.valueOf(n);    
        }
        char c= (char) ((char)(Math.random()*25)+65);
        s+= String.valueOf(c);
         
        return s;
    }
}
