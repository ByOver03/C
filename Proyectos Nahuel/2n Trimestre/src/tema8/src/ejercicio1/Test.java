package tema8.src.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test {
    public static void main(String[] args) {
        FileReader fr = null;
        fileReader(fr);
        bufferedReader(fr);
    }

    static void fileReader(FileReader fr){
        String texto="";
        try {
            fr = new FileReader("Proyectos Nahuel\\tema8\\src\\ejercicio1\\explicacion.txt");
            int a = fr.read();
            while(a!= -1){
                texto +=(char) a;
                a= fr.read();
            }
        } catch (Exception e) {
        }finally{
            if(fr !=null){
                try{
                    fr.close();
                }catch(IOException e){
                }
            }
        }
        System.out.println(texto);
    }

    static void bufferedReader(FileReader fr){
        String texto= "";
        String linea= "";
        BufferedReader br= null;
        try{
            fr=new FileReader("Proyectos Nahuel\\tema8\\src\\ejercicio1\\explicacion.txt");
            br = new BufferedReader(fr);
            linea= br.readLine();

            while (linea !=null){
                texto += linea + "\n";
                linea = br.readLine();
            }
        }catch(FileNotFoundException e){
        }catch(IOException e){
        }finally{
            try{
              if(br != null)  {
                br.close();
              }
            }catch(IOException e){}
        }
        System.out.println(texto);
    }
}
