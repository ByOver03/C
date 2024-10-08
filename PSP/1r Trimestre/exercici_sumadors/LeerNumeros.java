package exercici_sumadors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LeerNumeros {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File ruta = new File("C:\\Users\\nahue\\Desktop\\Clase_Casa\\PSP\\1r Trimestre\\exercici_sumadors");
        Process p;


        System.out.println("Ingresa dos números a sumar");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();


        ProcessBuilder pb = new ProcessBuilder("java", "Sumador.java", String.valueOf(a), String.valueOf(b));
        pb.directory(ruta);

       
        try {
            p = pb.start();
            InputStream is = p.getInputStream();
            int c;

            while((c = is.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (new File("actividades\\suma.txt").exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader("actividades\\suma.txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println("Suma: " + linea); 
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            }
        }

    }
}
