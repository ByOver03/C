package paradojagemelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //Gemelos
        Besso joan = new Besso("Joan", 25, false);
        Besso anna = new Besso("Anna", 25, true);
        Besso olga = new Besso("Olga", 40, false);
        Besso joel = new Besso("Joel", 40, true);
        Besso pere = new Besso("Pere", 65, false);
        Besso josep = new Besso("Jose", 65, true);

        //Listas
        List<Besso> parella1 = new ArrayList<>();
        parella1.add(joan);
        parella1.add(anna);
        List<Besso> parella2 = new ArrayList<>();
        parella2.add(olga);
        parella2.add(joel);
        List<Besso> parella3 = new ArrayList<>();
        parella3.add(pere);
        parella3.add(josep);
        
        //Cuando se termina el viaje el valor se actualizara

        Map<List<Besso>, Integer> bessons= new HashMap<>();
        bessons.put(parella1, 0);
        bessons.put(parella2, 0);
        bessons.put(parella3, 0);
        //Cuando se acabe el viaje se mostrara una lista de todos los gemelos ordenados por nombre, otra con las velocidades de las naves, otro del tiempo de vuelo  y otra de las diferencias de edad
        //List<Besso> gemelos;
        //List<NauEspacial> velocidadesNaves;
        //List<NauEspacial> tiempoViaje;
        //velocidades (0.7,0.8y0.9)
        //Las velocidades seran assignadas de manera aleatoria a cada una de las naves

        System.out.println(Funcions.tiempoDiferencia(5,0.9));
}
    
}