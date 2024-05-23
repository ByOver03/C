package tema8.src.ejercicio4;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FileReader fr= null;
        BufferedReader br = null;
        String texto= "";

        
        System.out.println("Introduce el nombre del fichero que quieres leer:");
        String nombredocumento= sc.nextLine();
        sc.close();
        try {
            if(nombredocumento == "prueba"){
                fr = new FileReader("Proyectos Nahuel\\tema8\\src\\ejercicio4\\"+nombredocumento+".txt");
            br= new BufferedReader(fr);
            String linia= br.readLine();

            while (linia!= null){
                texto += linia + "\n";
                linia = br.readLine();
            }
            }else{
                System.out.println("El documento no ha sido encontrado y se ha utilizado el por defecto"+"\n");
            fr = new FileReader("Proyectos Nahuel\\tema8\\src\\ejercicio4\\prueba.txt");
            br= new BufferedReader(fr);
            String linia= br.readLine();

            while (linia!= null){
                texto += linia + "\n";
                linia = br.readLine();
            }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
            System.out.println(texto);
        }

    }
    
}
