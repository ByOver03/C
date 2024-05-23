package examencolecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Declaramos el fichero
        String file = "plantilla.dat";
        //Mostramos la informacion del fichero
        @SuppressWarnings("unused")
        Map <Integer, Jugador> plantilla2 = TratamientoFicheros.llegirPersonatges(file);
//        for (Integer string : plantilla2.keySet()) {
//            System.out.println("Dorsal: " + string + " Jugador: " + plantilla2.get(string).toString());
//        }
        //Creamos las variables necesarias
        Map<Integer, Jugador> plantilla= new HashMap<>();
        Scanner read = new Scanner(System.in);
        MetodosAuxiliares aux = new MetodosAuxiliares();
        @SuppressWarnings("unused")
        Map <Integer, Jugador> plantilla3 = TratamientoFicheros.llegirPersonatges(file);
        //Mostramos el menu y guardamos las respuestas
        aux.menu();
        Integer respuesta= read.nextInt();
        aux.respuesta(respuesta, plantilla, read);

        //Escribimos la infromacion en el fichero
        TratamientoFicheros.escriurePersonatges(plantilla, file);
        
        //Volvemos a mostrar la infromacion del fichero
//        for (Integer string : plantilla3.keySet()) {
//            System.out.println("Dorsal: " + string + " Jugador: " + plantilla2.get(string).toString());
//        }
    }
}
