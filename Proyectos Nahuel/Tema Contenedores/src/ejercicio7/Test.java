package ejercicio7;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Cliente[] aClients = new Cliente[3];
        aClients[0] = new Cliente("Nahuel", 2003);
        aClients[1] = new Cliente("Yoshwa", 2004);
        aClients[2] = new Cliente("Josemi", 1996);

        Stream<Cliente> orden = Stream.of(aClients);
        orden.sorted((s1,s2)-> s1.getNombre().compareTo(s2.getNombre())).forEach(System.out::println);
    }
}
