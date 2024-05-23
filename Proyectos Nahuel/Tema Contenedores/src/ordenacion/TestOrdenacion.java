package ordenacion;

import java.util.Set;
import java.util.TreeSet;

public class TestOrdenacion {
    public static void main(String[] args) {
        Set<Humano> p= new TreeSet<>();
        System.out.println(p);

    }
    
}
class Humano {
    String nombre;
    int edad;

}