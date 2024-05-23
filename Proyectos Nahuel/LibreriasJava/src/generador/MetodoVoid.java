package generador;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MetodoVoid<T> {
    
    //Map para guardar los metodos
    private static Map<Integer, Consumer<?>> metodos = new HashMap<>();

    //Getter
    public static Map<Integer, Consumer<?>> getMetodos() {
        return metodos;
    }

    //Setter
    public static void setMetodos(Map<Integer, Consumer<?>> metodos) {
        MetodoVoid.metodos = metodos;
    }

    //Metodo para añadir voids
    //Los metodos añadidos deben ser genericos para evitar los errores posibles del codigo
    public static <T> void añadirMetodo(Integer num, Consumer<T> metodo) {
        metodos.put(num, metodo);
    }


    //Metodo para ejecutar el metodo añadido
    @SuppressWarnings("unchecked")
    public static <T> void ejecutarMetodo(Integer num, T parametro) {
        Consumer<T> consumer = (Consumer<T>) metodos.get(num);
        if (consumer != null) {
            consumer.accept(parametro);
        } else {
            System.out.println("No se encontró el método para el número: " + num);
        }
    }
}