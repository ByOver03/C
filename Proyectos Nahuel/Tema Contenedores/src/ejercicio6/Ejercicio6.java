package ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista= new ArrayList<>();
        generadorNumeros(lista);
        Stream<Integer> positivos= lista.stream();
        System.out.println("Numeros Positivos");
        positivos.filter(s-> s>= 0).distinct().forEach(System.out::println);;
        Stream<Integer> negativos= lista.stream();
        System.out.println("Numeros Negativos");
        negativos.filter(s-> s<0).distinct().forEach(System.out::println);

        Stream<Integer> diezMenosDiez= lista.stream();
        System.out.println("Numeros entre 10 y -10");
        diezMenosDiez.filter(s-> s>-10&&s<10).distinct().forEach(System.out::println);

    }

    public static void generadorNumeros(List<Integer> lista){
        int n;
        
        for (int i = 1; i < 40; i++) {
            n= (int)(Math.random()*41)-20;
            lista.add(n);
        
        }
        
    }
}
