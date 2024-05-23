package examen;

import java.util.Map;
import java.util.Scanner;
import java.examen.MetodosAuxiliares;

public class Plantilla {
    
    //Metodo para dar de alta a un jugaor
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        MetodosAuxiliares m = new MetodosAuxiliares();
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        String DNI = leer.next();
        String posicion = leer.next();
        int edad = leer.nextInt();
        
        Jugador j = new Jugador(nombre, edad, DNI, m.establecerPosicion(posicion));
        plantilla.put(dorsal, j);
    }

    //Metodo para dar de baja a un jugador segun el dorsal introducido
    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal){

        return null;
    }

    //Metodo parea mostrar a los jugadores segun la posicion Introducida por el usuario
    static void mostrar(Map<Integer, Jugador>plantilla, String posicion){

    }

    //Metodo parea mostrar a los jugadores
    static void mostrar(Map<Integer, Jugador> plantilla){

    }

    //Metodo para editar los datos de un jugador
    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        return false;
    }
}
