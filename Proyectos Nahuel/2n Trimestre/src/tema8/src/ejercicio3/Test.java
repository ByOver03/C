package tema8.src.ejercicio3;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre tu edad y tu altura:");
        String nombre= sc.next();
        
        int edad= sc.nextInt();
        
        double altura= sc.nextDouble();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        sc.close();
    }
}
