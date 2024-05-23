package colecciones10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Chochwa");
        Cliente c2 = new Cliente("Iker");
        Cliente c3 = new Cliente("Gabi");
        Cliente c4 = new Cliente("Naswel");

        List<Cliente> lClientes = new ArrayList<>();

        lClientes.add(c4);
        lClientes.add(c3);
        lClientes.add(c2);
        lClientes.add(c1);

        //LAMBDA
        Comparator<Cliente> comp =(o1, o2) -> o1.nombre.compareTo(o2.nombre);

        

        Collections.sort(lClientes,comp);
        for (Cliente cliente : lClientes) {
            System.out.println(cliente.nombre);
        }
    }
}
