package ejercicio8;

import java.util.*;

//import generar.GeneraCadena;

public class TestCliente {
    public static void main(String[] args) {
        Cliente[] aClientes = {new Cliente("Joan", "1973-01-01"), new Cliente("Nahuel", "1999-01-01"), 
                                          new Cliente("Gabi", "2001-01-01"), new Cliente("Jose", "2000-01-01")};

        
        Map<String, DatosCliente> mapa = new LinkedHashMap<>();

        for (int i = 0; i < aClientes.length; i++) {
            try {
                //mapa.put(GeneraCadena.dni(), new DatosCliente(aClientes[i]));
            } catch (Exception e) {
                i--;
            }
        }

        for (String dni : mapa.keySet()) {
            System.out.println(dni + " " + mapa.get(dni));
        }




    }
}
