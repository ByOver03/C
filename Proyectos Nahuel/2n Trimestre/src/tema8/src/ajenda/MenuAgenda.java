package tema8.src.ajenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MenuAgenda {
    public static void main(String[] args) {
        menu();
    }

    // Esta funcion contiene las funciones del menu de la agenda, incluyendo la lectura y la escritura de la misma
    static void menu() {
        String path = "segundoTrimestre\\";
        String carpeta = "archivosTexto\\";
        String fichero = "agenda.txt";
        String destino = path + carpeta + fichero;

        String opcion = "";
        String buscar = "";
        String nombre = "";
        String telefono = "";
        String contacto = "";

        String[] contactos = new String[0];

        Scanner sc = new Scanner(System.in);
        

        BufferedReader br = null;
        BufferedWriter bw = null;


        try {
            br = new BufferedReader(new FileReader(destino));

            String linea = br.readLine();

            while (linea != null) {
                contactos = Arrays.copyOf(contactos, contactos.length + 1);
                contactos[contactos.length - 1] = linea;
                linea = br.readLine();
            }
                   
         } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
         } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
         }

        System.out.println("Este programa permite añadir contactos a la agenda y ver dichos contactos mediante una busqueda o saliendo todos ellos");


        while (!opcion.equals("4")) {
            System.out.println("Escriba la opción que quiere realizar: \n" + 
                               "Nuevo contacto [1]\n" +
                               "Buscar por nombre [2]\n" +
                               "Mostrar todos [3]\n" +
                               "Salir [4]\n");
            opcion = sc.next();

        if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4")) {
           while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4")) {
                System.out.println("Por favor escriba una opción posible");
                opcion = sc.next();
           } 
        }
        
        if (opcion.equals("1")) {
            if (contactos.length == 20) {
                System.out.println("La agenda ya está llena");
            } else {
                contactos = Arrays.copyOf(contactos, contactos.length + 1);
                contactos[contactos.length - 1] = "NULL";
                System.out.println("Escriba el nombre del nuevo contacto y su número de teléfono");
                nombre = sc.next();
                telefono = sc.next();
                contacto = nombre + " " + telefono;

                if (contactos.length == 1) {
                    System.out.println("contacto añadido");
                    contactos[0] = contacto;
                } else {
                    for (int i = 0; i < contactos.length; i++) {
                        if (i == contactos.length - 1 && contactos[i].equals("NULL")) {
                            System.out.println("Contacto añadido");
                            contactos[contactos.length - 1] = contacto;
                            break;
                        }
                        if (contactos[i].contains(nombre)) {
                            System.out.println("Este nombre ya está en la agenda");
                            contactos = Arrays.copyOf(contactos, contactos.length - 1);
                            break;
                        }
                    }
                }               
            } 
        } else if(opcion.equals("2")){
            System.out.println("Ingresa el nombre que quiere buscar");
            buscar = sc.next();
            try {
                for (int i = 0; i < contactos.length; i++) {
                    if (contactos[i].contains(buscar)) {
                        Arrays.sort(contactos);
                        System.out.println(contactos[i]);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }            
        } else if(opcion.equals("3")) {
            if (contactos.length > 0) {
                Arrays.sort(contactos);
                for (int i = 0; i < contactos.length; i++) {
                    System.out.println(contactos[i]);
                }
            } else {
                System.out.println("No hay ningun contacto en la agenda");
            }
        }
        }

        System.out.println("Ha salido correctamente");


        try {
            bw = new BufferedWriter(new FileWriter(destino));

            for (String linea : contactos) {
                bw.write(linea);
                bw.newLine();
            }           
         } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
         } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
         }
         sc.close();
    }
    
}
