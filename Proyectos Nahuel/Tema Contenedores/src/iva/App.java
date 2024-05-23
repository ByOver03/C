package iva;

import java.util.function.Predicate;

//Interfaces Funcionales de la api de java
public class App {


        //Predicate:

        //se emplea para hacer una condicion en un valor de tipo generico
    
        //Metodo abstracto: boolean test(T valor), devuelve true si la condicion se verifica

        /*Otros Metodos
         * negate(): devuelve un nuevo predicado que es la negacion del original
         */

        public static void main(String[] args) {
            //Ejemplo:
            Predicate<Integer> esMayorQueDiez = x -> x>10;
            Predicate<Integer> menorOIgual = esMayorQueDiez.negate();
            Integer valor = 20;
            if(esMayorQueDiez.test(valor)){
                System.out.println(valor + " Es mayor que 10");
            }else{
                System.out.println(valor + " No es mayor a 10");
            }

            if(menorOIgual.test(valor)){
                System.out.println(valor + " Es mayor que 10");
            }else{
                System.out.println(valor + " No es mayor a 10");
            }
        }

        /*Teoria ed no entra:
         *  -procediment de proves tres punts de dins
         *  -estrategies de proves de programari
         *  -prova Unitaria(Unica cosa que entra)
         *  -7.5
         */
}