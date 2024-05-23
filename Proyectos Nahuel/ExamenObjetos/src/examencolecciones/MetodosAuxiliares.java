package examencolecciones;

import java.util.Map;
import java.util.Scanner;

public class MetodosAuxiliares {

    //Metodo para printar el menu en el test
    void menu(){
        System.out.println("[1] Añadir Jugador\n" + 
        "[2] Eliminar a un jugador\n" + 
        "[3] Editara a un jugador\n" + 
        "[4] Mostrar lista de jugadores\n" + 
        "[5] Mostrar jugadores de la misma posicion");
    }

    //Metodo para guardar la respuesta del usuario
    void respuesta(int respuesta, Map<Integer, Jugador> plantilla, Scanner read){
        Integer dorsal;
        switch (respuesta) {
            case 1:
                System.out.println("Introduzca el dorsal del jugador que quiere introducir");
                dorsal = read.nextInt();
                Plantilla.altaJugador(plantilla, dorsal);
                break;
        
            case 2:
                System.out.println("Introduzca el dorsal del jugador que quiere eliminar");
                dorsal = read.nextInt();
                Plantilla.eliminarJugador(plantilla, dorsal);
                break;

            case 3:
                System.out.println("Introduzca el dorsal del jugador que quiere editar");
                dorsal = read.nextInt();
                Plantilla.editarJugador(plantilla, dorsal);
                break;

            case 4:
                Plantilla.mostrar(plantilla);
                break;
            
            case 5:
                System.out.println("Introduzca la posicion de jugador que quiere que aparezca");
                String posicion= read.nextLine();
                posicion= posicion.toLowerCase();
                Plantilla.mostrar(plantilla, posicion);
                break;
        }
    }
}
