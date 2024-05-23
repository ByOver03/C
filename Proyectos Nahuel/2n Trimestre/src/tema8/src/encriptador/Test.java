package tema8.src.encriptador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println("Este programa codifica y descodifica mensajes de ficheros");
        codificarMensaje();
        descodificarMesnaje();
    }

      // Esta funcion lee el mensaje sin codificar y lo codifica en el fichero secreto.txt
    static void codificarMensaje() {
        String path = "Proyectos Nahuel\\tema8\\src\\";
        String carpeta = "encriptador\\";
        String fichero = "codigo.txt";

        String codificacion = "";

        String destino = path + carpeta + fichero;
        
        BufferedWriter bw = null;
        BufferedReader br = null;
        BufferedReader br2 = null;

         try {
            br = new BufferedReader(new FileReader(destino));

            String linea1 = br.readLine();
            String linea2 = br.readLine();

            String[][] codigo = {linea1.split(" "), linea2.split(" ")};

            destino = path + carpeta + "missatge.txt";
            br2 = new BufferedReader(new FileReader(destino));
            destino = path + carpeta + "secret.txt";
            bw = new BufferedWriter(new FileWriter(destino));

            int letra = br2.read();

            while (letra != -1) {
                for (int i = 0; i < codigo[0].length; i++) {
                    if (String.valueOf((char)letra).equals(codigo[0][i])) {
                        codificacion += codigo[1][i];
                    } else if(String.valueOf((char)letra).equals(" ")) {
                        codificacion += " ";
                        break;
                    }
                }
                letra = br2.read();
            }

            bw.write(codificacion);
         } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
         } finally {
            if (bw != null) {
                try {
                    // Hacemos que se escriba lo que faltase y se cierre
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (br != null) {
                try {
                    // Hacemos que se escriba lo que faltase y se cierre
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (br2 != null) {
                try {
                    // Hacemos que se escriba lo que faltase y se cierre
                    br2.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
         }
    }

    // Esta funcion lee el mensaje codificado y lo descodifica para mostrarlo pro consola
    static void descodificarMesnaje() {
        String path = "Proyectos Nahuel\\tema8\\src\\";
        String carpeta = "encriptador\\";
        String fichero = "codigo.txt";

        String desCodificacion = "";

        String destino = path + carpeta + fichero;
        
        BufferedReader br = null;
        BufferedReader br2 = null;

         try {
            br = new BufferedReader(new FileReader(destino)); 

            String linea1 = br.readLine();
            String linea2 = br.readLine();

            String[][] codigo = {linea1.split(" "), linea2.split(" ")};

            destino = path + carpeta + "secret.txt";
            br2 = new BufferedReader(new FileReader(destino));
            

            int letra = br2.read();

            while (letra != -1) {
                for (int i = 0; i < codigo[0].length; i++) {
                    if (String.valueOf((char)letra).equals(codigo[1][i])) {
                        desCodificacion += codigo[0][i];
                    } else if(String.valueOf((char)letra).equals(" ")) {
                        desCodificacion += " ";
                        break;
                    }
                }
                letra = br2.read();
            }

            System.out.println(desCodificacion);

         } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
         } finally {
            if (br != null) {
                try {
                    // Hacemos que se escriba lo que faltase y se cierre
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (br2 != null) {
                try {
                    // Hacemos que se escriba lo que faltase y se cierre
                    br2.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
         } 
    }
}
