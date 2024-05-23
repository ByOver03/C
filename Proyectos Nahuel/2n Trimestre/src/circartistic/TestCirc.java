package circartistic;

public class TestCirc {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        
        //Declaramos los objetos Malabarista Acrobata y PallassoMalabarista como ArtistaCirc para poder utilizarlos en un mismo array
        Malabarista a1= new Malabarista("Nahuel", 20, TipusActuacio.ACROBATA, 4);
        Malabarista a2= new Malabarista("Yoshwa", 19, TipusActuacio.ACROBATA, 5);
        Malabarista a3= new Malabarista("Robo", 18, TipusActuacio.ACROBATA, 6);
        Acrobata b1 = new Acrobata("Iker", 18, TipusActuacio.ACROBATA, "Cuerda Floja");
        Acrobata b2 = new Acrobata("Gabi", 24, TipusActuacio.ACROBATA, "Bomba de humo");
        Acrobata b3 = new Acrobata("Ametller", 18, TipusActuacio.ACROBATA, "Equilibrismo");
        PallassoMalabarista c1= new PallassoMalabarista("Gustabo", 19, TipusActuacio.ACROBATA, 4, "Teatro Tragico");
        PallassoMalabarista c2= new PallassoMalabarista("Guiem", 18, TipusActuacio.ACROBATA, 5, "Malabarista");
        PallassoMalabarista c3= new PallassoMalabarista("Genis", 18, TipusActuacio.ACROBATA, 6, "Gracioso");

        //Presentamos a los diferentes Artistas

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println("======================");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println("======================");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println("======================");

        //Ahora comparamos a los artistas
        System.out.println(a1.equals(c1));
        System.out.println("======================");
        System.out.println(a2.equals(c2));
        System.out.println("======================");
        System.out.println(a3.equals(c3));
        System.out.println("======================");
        System.out.println(b1.equals(a1));
        System.out.println("======================");
        System.out.println(b2.equals(a2));
        System.out.println("======================");
        System.out.println(b3.equals(a3));
        System.out.println("======================");
        System.out.println(c1.equals(b1));
        System.out.println("======================");
        System.out.println(c2.equals(b2));
        System.out.println("======================");
        System.out.println(c3.equals(b3));
        System.out.println("======================");

        //Ahora les hacemos realizar los trucos a los artistas

        a1.realitzarActuacio();
        a2.realitzarActuacio();
        a3.realitzarActuacio();
        System.out.println("======================");
        b1.realitzarActuacio();
        b2.realitzarActuacio();
        b3.realitzarActuacio();
        System.out.println("======================");
        c1.realitzarBroma();
        c2.realitzarBroma();
        c3.realitzarBroma();
        System.out.println("======================");


        //Declaramos un array para guardar a todos los artistas
        ArtistaCirc[] artistas= {a1,a2,a3,b1,b2,b3,c1,c2,c3};

        //Declaramos un array para guardar todos los dias de la semana
        DiesSetmana[] semana= {DiesSetmana.DILLUNS, DiesSetmana.DIMARTS, DiesSetmana.DIMECRES, DiesSetmana.DIJOUS, DiesSetmana.DIVENDRES, DiesSetmana.DISSABTE, DiesSetmana.DIUMENGE};

        //Creamos un array bidimensional para guardar que artistas actuan cada dia
        ArtistaCirc[][] actuaciones= new ArtistaCirc[7][9];


        for(int i = 0; i< actuaciones.length; i++){
            for(int j = 0; i<actuaciones[i].length; j++){
                actuaciones[i][j]= artistas[(int)(Math.random()*6)];
            }
        }

        for(int i= 0; i < actuaciones.length; i++){
            System.out.println(semana[i]);
            for(int j = 0; j <actuaciones[0].length; j++){
                System.out.println(actuaciones[i][j]);
            }
        }
    }
}
