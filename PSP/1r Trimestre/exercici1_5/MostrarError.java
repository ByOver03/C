package exercici1_5;

import java.io.IOException;
import java.io.InputStream;

public class MostrarError {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p;
        ProcessBuilder pb = new ProcessBuilder("BAMAL" );

        
        

        try {
            p = pb.start();
            InputStream is= p.getInputStream();
            int c;
            while ((c = is.read()) !=-1) {
               System.out.println((char) c); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
