package tema8.src.ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        
        
       System.out.println(Suma());
       System.out.println(media());
    }

    static double media(){
        double media= 0;
        String[] array= leerdocumento().split(" ");
        for(int i = 0; i < array.length; i++){
            media+= Double.valueOf(array[i]);
        }
        
        return media;
    }

    static String leerdocumento(){
        String texto= "";
        FileReader fr = null;
        BufferedReader br= null;
        try{
            fr=new FileReader("Proyectos Nahuel\\tema8\\src\\ejercicio2\\numeros.txt");
            br = new BufferedReader(fr);
            String linea= br.readLine();

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
        return texto;
        
    }

    static double Suma(){
        String[] textoseparado=leerdocumento().split(" ");
        double suma= 0;
        

        for (int i = 0; i < textoseparado.length ; i++){
        suma+= Double.valueOf(textoseparado[i]);
        }

         return suma;

        

    }
}
