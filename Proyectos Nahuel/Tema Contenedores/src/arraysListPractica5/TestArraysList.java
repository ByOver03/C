package arraysListPractica5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class TestArraysList {
    public static void main(String[] args) {
        

        ArrayList<Integer> al= new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(9);
        al.add(10);
        al.add(3);
        al.add(6);
        al.add(4);
        al.add(20);
        al.add(8);
       System.out.println(encontrarSumapares(al));
       al2.add("iker");
       al2.add("Messi");
       al2.add("Nahuel");
       al2.add("jose");
       al2.add("Robop");
       imprimirPalabra(al2, scanner);

        
    }

    //Este Metodo devuelve la suma de numeros pares de una Lista
    private static Integer encontrarSumapares(List<Integer> lista){
        
        Integer suma= 0;
        Integer numeroActual= 0;
        
        Iterator<Integer> iterator = lista.iterator();
        
        while(iterator.hasNext()){
            numeroActual = iterator.next();
            if(numeroActual%2== 0){
                suma+=numeroActual;
            }
        }

        return suma;
    }

    //Este metodo devuelve el Las palabras de la longitud que el usuario introduzca
    private static void imprimirPalabra(List<String> lista, Scanner scanner){
        System.out.println("Introduzca la longitud que quiere imprimir");

        int longitud= scanner.nextInt();
        

        Iterator<String> iterator= lista.iterator();

        while(iterator.hasNext()){
            String nombre= iterator.next();
            if(nombre.length() == longitud){
                System.out.println("Nombre: " + nombre);
            }
        }
    }
}
