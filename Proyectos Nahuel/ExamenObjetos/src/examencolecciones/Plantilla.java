package examencolecciones;

import java.util.Map;
import java.util.Scanner;

public class Plantilla{

    //Metodo para dar de alta a un jugador
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        Scanner read= new Scanner(System.in);
        System.out.println("Introduzca el nombre del jugador");
        String nombre= read.nextLine();
        System.out.println("Introduzca el DNI del jugador");
        String dni = read.nextLine();
        System.out.println("Introduzca la edad del jugador");
        int edad = read.nextInt();
        System.out.println("Introduzca la posicion del jugador");
        String posicion= read.next();
        Posicion pos = null;

        posicion = posicion.toLowerCase();
        if (posicion.equals("delantero")) {
            pos = Posicion.DELANTERO;
        }else if(posicion.equals("portero")){
            pos = Posicion.PORTERO;
        }else if(posicion.equals("defensa")){
            pos= Posicion.DEFENSA;
        }else if(posicion.equals("centrocampista")){
            pos = Posicion.CENTROCAMPISTA;
        }
        
        Jugador j= new Jugador(nombre, edad, dni, pos);
        plantilla.put(dorsal, j);
        read.close();
    }

    //Metodo para eliminar a un jugador
    static Jugador eliminarJugador(Map <Integer, Jugador> plantilla, Integer dorsal){
        
        return plantilla.remove(dorsal);
        
        
    }

    //Metodo para mostrar los dorsales con los nombres de los jugadores ordenados por el dorsal
    static void mostrar(Map <Integer, Jugador> plantilla){
        for (Integer dorsal : plantilla.keySet()) {
            System.out.println("Jugador: " + plantilla.get(dorsal).getNombre() + ", Dorsal: " + dorsal);
        }
    }

    //Metodo para mostrar a loso jugadores con la misma posicion
    static void mostrar(Map<Integer,Jugador> plantilla, String posicion){
        @SuppressWarnings("unused")
        Posicion pos = null;
        
        switch (posicion) {
            case "delantero":
                pos= Posicion.DELANTERO;
                break;
        
            case "portero":
                pos= Posicion.PORTERO;
                break;

            case "centrocampista":
                pos = Posicion.CENTROCAMPISTA;
                break;
            case "defensa":
                pos= Posicion.DEFENSA;
                break;

            
        }
    }

    //Metodo para editar a algun jugador excepto su DNI y su dorsal
    static boolean editarJugador(Map <Integer,Jugador> plantilla, Integer dorsal){
        Scanner read= new Scanner(System.in);
        String nombre= read.nextLine();
        @SuppressWarnings("unlikely-arg-type")
        String dni = plantilla.get(nombre).getDni();
        int edad = read.nextInt();
        String posicion= read.next();
        Posicion pos = null;

        switch (posicion) {
            case "delantero":
                pos= Posicion.DELANTERO;
                break;
        
            case "portero":
                pos= Posicion.PORTERO;
                break;

            case "centrocampista":
                pos = Posicion.CENTROCAMPISTA;
                break;
            case "defensa":
                pos= Posicion.DEFENSA;
                break;
        }
        
        Jugador j= new Jugador(nombre, edad, dni, pos);
        plantilla.remove(dorsal);
        plantilla.put(dorsal, j);
        read.close();
        return true;

    }
}
