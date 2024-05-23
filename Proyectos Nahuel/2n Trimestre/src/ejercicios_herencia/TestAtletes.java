package ejercicios_herencia;

public class TestAtletes {
    public static void main(String[] args) {

        //Declaramos los Atleta Saltador para inicializar a los deportistas
        Atleta a = new Atleta("Nahuel", 20);
        Atleta b = new Atleta("Chochwa", 19);
        
        //Declaramos los Objetos Corredor para inicializar a los deportistas
        Corredor c= new Corredor("Robo", 18, 6);
        Corredor d= new Corredor("Iker", 18, 3);

        //Declaramos los Objetos Saltador para inicializar a los deportistas
        Saltador s= new Saltador("Guiem", 18, 0.5);
        Saltador t= new Saltador("Ametller", 18, 0.3);

        //Presentamos a los deportistas
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("=================");
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println("=================");
        System.out.println(s.toString());
        System.out.println(t.toString());

        //Comparamos los distintos tipos de deportistas
        System.out.println(a.equals(b)==false?"Los Atletas no tienen las mismas caracteristicas":"Los Atletas tienen las mismas caracteristicas");
        System.out.println(c.equals(d)==false?"Los Corredores no tienen las mismas caracteristicas":"Los Corredores tienen las mismas caracteristicas");
        System.out.println(s.equals(t)==false?"Los Saltadores no tienen las mismas caracteristicas":"Los Saltadores tienen las mismas caracteristicas");


    }
    
}
