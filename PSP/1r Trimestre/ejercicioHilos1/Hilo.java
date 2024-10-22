package ejercicioHilos1;

import java.util.Scanner;

public class Hilo extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del trabajador");
        String s = sc.nextLine();
        System.out.println("Introduzca el dia");
        String s1 = sc.nextLine();
        System.out.println("Introduzca la hora");
        double hora = sc.nextDouble();
        sc.close();
        if(hora>8.00){
            System.out.println(s+ " llegó tarde el dia " + s1);
        }else if(hora<8.00){
            System.out.println(s+ " llegó temprano el dia " + s1);
        }
    }
}
