package generador;

public class GeneradorDeNumeros {
    public static int generadorNumerosEnteros(int numMaximo){
        return (int) ((Math.random()*numMaximo)+1);
    }
    public static double generadorDeNumerosConDecimales(double numMaximo){
        return (Math.random()*numMaximo)+1;
    }
}
