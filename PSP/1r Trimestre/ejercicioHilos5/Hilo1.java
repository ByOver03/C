package ejercicioHilos5;

public class Hilo1 extends Thread {
    @Override
    public void run() {
        System.out.println("2");
        System.out.println("4");
        System.err.println("6");
        System.out.println("8");
        System.out.println("10");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        int i = 2+4+6+8+10;
        System.out.println("El resultado de la suma de pares es: " +i);

    }
}
