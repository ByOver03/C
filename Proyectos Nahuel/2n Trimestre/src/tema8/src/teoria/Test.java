package tema8.src.teoria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    
    public static void main(String[] args) {
        Teoria t = new Teoria(20, 0);

        t.division();

        //Excepciones
        /*
         *  los flujos pueden ser de entrada o de salida
         * dependiedo de si queremos recuperar o guardar informacion
         * 
         * Hay 2 tipos de flujos, de texto(vienen asociados a archivos de texto) y los flujos de binarios (Lo seran en caso de que lo que transmiten son bites(0-255)(Pueden trabajar con cualquier tipo de dato))
         * 
         * SI o SI se producen errores
         * 
         * Cuando se produce un error en un metodo se genera un objeto de la clase Throwable y se lanza a la maquina virtual(con info del error)
         * Puede ser captirado y analizado para dar una respuesta si se procede, sino se interrumpe el programa
         * 
         * La clase error es hija de throwable
         * 
         * No nos vamos a ocupar de las excepciones en tiempo de ejecucion
         * 
         * Los errores que trataremos producen 
         */

         //BufferedReader
         String texto = "";

         FileReader fr= null;
         BufferedReader bf = null;
        try{
         fr=new FileReader("Proyectos Nahuel\\tema8\\src\\teoria\\texto.txt");
         bf = new BufferedReader(fr);
         String linia= bf.readLine();
         //int c = fr.reed();

         while(linia !=null){
            texto+= linia + "\n";
            linia=bf.readLine();
         }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println("Error de i/o: " + e.getMessage());
        }finally{
            try{
            if(bf != null){
                bf.close();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        }
        System.out.println(texto);

        //File Writer que hereda de la clase OutputStreamWriter

        //FileWriter (String nombreArchivo)
        //FileWriter (String nombreArchivo, boolean append)

        //BufferedWriter
        /*Metodos:
         * -void write(int caracter)
         * -voi write(String cadena)
         * -void newLine()
         * -void push()
         * -void close()
         */

        //IOException

//         String path="Proyectos Nahuel\\tema8\\src\\";
//         String fichero="Libros.txt";
//         String carpeta="teoria\\";
//         BufferedReader br= null;
        
        

//         try{
//             br= new BufferedReader(new FileWriter(path+carpeta+fichero));

//             String cadena="En un lugar de la mancha";//Primera linea

//             for(int i = 0; i< cadena.length(); i++){
//                 //Escribimos caracter a caracter
//                 br.write(cadena.charAt(i));
//             }

//             cadena ="de cuyo nombre no quiero acordarme";//Segunda Linea
//             br.newLine();

//             br.write(cadena);
//         }catch(IOException e){
//             System.out.println("Error: " +e.getMessage());
//         }finally{
//             if(br != null){
//                 try{
//                     br.close();
//                 }catch(IOException e){
//                     System.out.println("Error: " + e.getMessage());
//                 }
//             }
//         }
     }
}
