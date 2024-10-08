package Process;

import java.io.*;
import java.util.Scanner;

public class Ejemplo1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        // Le pedimos al usuario que quiere hacer
        System.out.println("Que desea hacer?:\n" +
                "[1]Apagar el Dispositivo\n" +
                "[2]Reiniciar el dispositivo\n" +
                "[3]Suspender el dispositivo");

        Scanner s = new Scanner(System.in);
        String[] p ={};
        int opcion;
        String tiempo;
        opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(
                        "Introduzca la cantidad de tiempo que quiere que tarde el dispositivo en apagarse por completo");
                tiempo = s.next();
                p = new String[] { "shutdown", "/s", "/t", tiempo };
                break;

            case 2:
                System.out.println(
                        "Introduzca la cantidad de tiempo que quiere que tarde el dispositivo en reiniciarse por completo");
                tiempo = s.next();
                p = new String[] { "shutdown", "/r", "/t", tiempo };
                break;
            case 3:
                p = new String[] { "shutdown", "/h" };
                break;
                
        }
        Process proceso = new ProcessBuilder(p).start();
        s.close();
        
    }
}
