package generador;


import java.util.HashMap;
import java.util.Map;

import java.util.function.Function;

public class MetodoDevuelve {
    private static Map<Integer, Function<?,?>> registro = new HashMap<>();

    //Getter
    public static Map<Integer, Function<?, ?>> getRegistro() {
        return registro;
    }

    //Setter
    public static void setRegistro(Map<Integer, Function<?, ?>> registro) {
        MetodoDevuelve.registro = registro;
    }

    //Metodo para añadir un metodo al mapa
    public static <T,V> void añadirMetodo(Integer num, Function<T,V> metodo){
        registro.put(num, metodo);
    }

    
    //Metodo para ejecutar el metodo registrado
    public static <T, V> void ejecutar(Integer num, T parametro){
        @SuppressWarnings("unchecked")
        Function<T,V> metodo= (Function<T,V>) registro.get(num);
        if(metodo != null){
            V resultado =metodo.apply(parametro);
            System.out.println(resultado);
        }else{

        }
    }
}
