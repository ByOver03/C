package coches;


import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Coche> coche= new TreeSet<>();
        CarreraCoches carrcoch= new CarreraCoches(coche);
        Coche a= new Coche("Toyota", 20.5);
        Coche b= new Coche("Ford", 25.4);
        Coche c= new Coche("Lamborghinni", 32.8);
        Coche d= new Coche("Masseratti", 50.5);
        Coche e= new Coche("Volksvagen", 21.3);
        
        carrcoch.añadirCoche(a);
        carrcoch.añadirCoche(b);
        carrcoch.añadirCoche(c);
        carrcoch.añadirCoche(d);
        carrcoch.añadirCoche(e);
        

        carrcoch.eliminarCoche("Toyota");


        comprovaIterator(carrcoch.coches);

        System.out.println(carrcoch.getGuanyador());
    }
    
    //Metodo para recorrer la coleccion de la clase CarreraCoches
    static void comprovaIterator(TreeSet<Coche> coches){
        
        Iterator<Coche>coche= coches.iterator();
        Coche c;
        while (coche.hasNext()) {
            c=coche.next();
            System.out.println(c.toString());
            
        }
    } 
}
