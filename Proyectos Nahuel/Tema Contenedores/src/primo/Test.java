package primo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    
    public static void main(String[] args) {
        
        List<Integer> numeros= new ArrayList<>();
        numeros= Primo.cienNumeros();
        System.out.println(numeros.toString());
        
        //2.A
        Stream<Integer>s = numeros.stream();
        System.out.println("Orden De Mayor a Menor");
        s.sorted((x,y) -> x-y).forEach(System.out::println);
        //2.B
        System.out.println("Orden de Menor a Mayor");
        Stream<Integer> s2= numeros.stream();
        s2.sorted((x,y) -> y-x).forEach(System.out::println);
        //2.C
        System.out.println("Numeros entre 200 y 800 ordenados de mayor a menor");
        Stream<Integer> s3 = numeros.stream();
        s3.sorted((x,y) -> x-y).filter(a -> a<800 && a>200).forEach(System.out::println);
        //3.A
        Stream<Integer> list= numeros.stream();
        List<Integer> lista= list.toList();
        System.out.println(lista.toString());
        //3.B
        Stream<Integer> array= numeros.stream();
        Object[] integers =  array.toArray();
        System.out.println(Arrays.toString(integers));; 
    }

}