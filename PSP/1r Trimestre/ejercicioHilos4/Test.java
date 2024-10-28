package ejercicioHilos4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca el nombre del primer animal");
        String nombre1 = read.nextLine();
        System.out.println("Introduzca el nombre del segundo animal");
        String nombre2 = read.nextLine();
        System.out.println("Introduzca el nombre del tercer animal");
        String nombre3 = read.nextLine();
        read.close();

        Hilo1 h1 = new Hilo1(nombre1);
        Hilo2 h2 = new Hilo2(nombre2);
        Hilo3 h3 = new Hilo3(nombre3);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);

        t1.run();
        t2.run();
        t3.run();
    }
}
