package Process;

import java.io.File;
import java.io.IOException;

public class Ejemplo1_4 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p;
        File directorio = new File("C:\\Users\\nahue\\Desktop\\Clase_Casa\\PSP\\1r Trimestre\\Process");
        ProcessBuilder pb = new ProcessBuilder("javac", "LeerNombre.java");
        
        
        pb.directory(directorio);
        p = pb.start();
        int i = p.waitFor();
        
        if(i == 0){
            System.out.println("La cosa va bien");
            ProcessBuilder pb2 = new ProcessBuilder("java", "LeerNombre.class");
            
            pb2.directory(directorio);
            p = pb2.start();
            
            
        }else{
            System.out.println("algo va mal");
        }
        
    }
}
