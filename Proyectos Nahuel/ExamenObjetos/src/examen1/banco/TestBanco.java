package examen1.banco;

import java.util.Arrays;

public class TestBanco {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Persona p1= new Persona("41513352P", "Nahuel", true, false, 0, 3135434);
        Persona p2= new Persona("41513353Q", "Robo", false, true, 7, 0);
        Persona p3 = new Persona("41513354R", "Yoshwa", true, true, 7, 65443413);


        Persona[] personas= {p1, p2, p3};

        ComparaDNI c1 = new ComparaDNI();
        Arrays.sort(personas,c1);
        System.out.print(Arrays.deepToString(personas));

        ComparaHoras c2 = new ComparaHoras();
        Arrays.sort(personas, c2);
        System.out.print(Arrays.deepToString(personas));

        ComparaSaldo c3 = new ComparaSaldo();
        Arrays.sort(personas, c3);
        System.out.print(Arrays.deepToString(personas));
    }
}
