package ejercicioHilos5;

public class Test {
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();

        h1.run();
        System.out.println("*********************");
        h2.run();
    }
}
