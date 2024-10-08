package exercici1_5;

import java.io.File;
import java.io.IOException;

public class CapturarError {
    public static void main(String[] args)throws IOException, InterruptedException  {
        Process p;
      
        File error = new File("./exercici1_5/error.txt");
        ProcessBuilder pb = new ProcessBuilder( "obobobobuebueongenge");
       
        pb.redirectError(error);

        try{
            p = pb.start();
           
        }catch(Exception e){
            
        }
    }
}
