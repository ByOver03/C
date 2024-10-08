package exercici1_4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo1_4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException, InterruptedException {
        //Creeamos las Variables necesarias
        Process p;
        File directorio = new File("C:\\Users\\nahue\\Desktop\\Clase_Casa\\PSP\\1r Trimestre\\Process");
        ProcessBuilder pb = new ProcessBuilder("java", "LeerNombre.java" ,"Ametller Marica");
        InputStream is;
        int cSalida;
        
        //ponemos la direccion donde esta el fichero y iniciamos el proceso
        pb.directory(directorio);
        p = pb.start();
        
        //Miramos que valor saca segun lo que hemos introducido
        try {
            cSalida = p.waitFor();
            System.out.println(cSalida);
        } catch (Exception e) {
            
        }

        //Imprimimos el valor introducido previamente por el
        try {
            is = p.getInputStream();
            int c;
            while ((c = is.read()) !=-1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            
        }
        
        
    }
}
