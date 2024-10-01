package Process;

import java.util.Scanner;

public class LeerNombre {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el Nombre");
        String nom= sc.next();
        if(nom.equals(nom.isEmpty())|| nom.equals(nom.matches(".*\\d.*")) ){
          System.exit(-1);  
        }else{
            System.exit(1);
        }
        
        sc.close();
        System.out.println(nom);
    }
}
