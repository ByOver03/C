package marvel;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Test {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        //Declaramos la clase funcions para escribir a los personajes en un fichero Binario
        //Funcions f = new Funcions();

        //Establecemos la direccion del fichero
        String fichero= "Marvel.dat";

        //Declaramos las listas necesarias
        List<Personatge> personatges= new ArrayList<>();
        Map<Personatge, List<Superpoder>> perssup= new HashMap<>();
        //Iterator<Personatge> personajes = personatges.iterator();
        

        //Creamos y añadimos a los personajes a la lista
        Personatge a= new Personatge("Petter Parker", "Spiderman");
        Personatge b = new Personatge("Tony Stark", "Iron Man");
        Personatge c = new Personatge("Bruce Banner", "Hulk");

        personatges.add(a);
        personatges.add(b);
        personatges.add(c);


        //Creamos los diferentes superpoderes
        Superpoder s1 = new Superpoder("Super Fuerza", 3);
        Superpoder s2 = new Superpoder("Sentido Aracnido", 8);
        Superpoder s3 = new Superpoder("Escalar Por Paredes", 1);

        Superpoder s4= new Superpoder("Super Fuerza", 6);
        Superpoder s5 = new Superpoder("Rayos Gamma", 10);

        Superpoder s6 = new Superpoder("Super Traje", 8);


        //Creamos las listas de los superpoderes y añadimos los superpoderes de cada personaje
        List<Superpoder> superpodersSpiderman = new ArrayList<>();
        superpodersSpiderman.add(s1);
        superpodersSpiderman.add(s2);
        superpodersSpiderman.add(s3);


        List<Superpoder> superpodersIronman = new ArrayList<>();
        superpodersIronman.add(s6);

        List<Superpoder> superpodersHulk = new ArrayList<>();
        superpodersHulk.add(s4);
        superpodersHulk.add(s5);

        //Añadimos a los personages con las listas de sus superpoderes
        perssup.put(c, superpodersHulk);
        perssup.put(b, superpodersIronman);
        perssup.put(a, superpodersSpiderman);


        //Mostramos los personajes con sus superpoderes
        for (Personatge pers : perssup.keySet()) {
            System.out.println("Personaje: " + pers.toString() +", Superpoderes " + perssup.get(pers).toString());
        }

        System.out.println("==============================================");
        //Ordenamos los personajes por orden alfabetico de los nombres
        Collections.sort((List)personatges);
        for (Personatge pers : personatges) {
            System.out.println(pers.toString());
        }

        System.out.println("==============================================");
        //Ordenamos a los personajes segun el Alias que tienen
        ComparaAlias ca = new ComparaAlias();
        Collections.sort((List)personatges, ca);
        for (Personatge pers : personatges) {
            System.out.println(pers.toString());
        }

        //Escribimos y leemos en el fichero binario
        Funcions.escriurePersonatges(personatges, fichero);
        Funcions.llegirPersonatges(fichero);

        
    }
}
