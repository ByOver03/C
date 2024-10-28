package ejercicioHilos3;

import java.util.Scanner;

public class Hilo extends Thread {
    int i = 1;
    @Override
    public void run() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un Corredor:");
        String s = read.nextLine();
        read.close();
        while (i!=31) {
            System.out.print(i +"km, ");
            i +=1;
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(s + "ha llegado a la meta");
    }
}
