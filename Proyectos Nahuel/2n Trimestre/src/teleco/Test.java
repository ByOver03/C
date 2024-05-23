package teleco;

public class Test {
    public static void main(String[] args) {
       
        //Inicializamos los objetos como llamadas
        Telefonada t1= new Telefonada(616985932, 971354514, true, ZonaInterlocutor.ZONA1,"31-01-2024 15:00", "31-01-2024 16:30");
        Telefonada t2= new Telefonada(616985932, 971354514, true, ZonaInterlocutor.ZONA1,"31-01-2024 15:00", "31-01-2024 15:30");

        
        //Mostramos la informacion de las llamadas
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        //Comparamos las llamadas
        System.out.println(t1.compareTo(t2));
    }
}
