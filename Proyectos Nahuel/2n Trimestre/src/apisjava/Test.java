package apisjava;

public class Test {
    public static void main(String[] args) {
        Prova prova1= new Prova();
        Prova prova2= new Prova();

        int comparacion= prova1.compareTo(prova2);
        //si prova1.compareTo(prova2) <0 -> prova1 va antes que prova2.
        //si prova1.compareTo(prova2) >0 -> prova1 va despues que prova2.
        System.out.println(comparacion);
    }
}
