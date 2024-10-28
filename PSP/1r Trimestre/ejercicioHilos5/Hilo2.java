package ejercicioHilos5;

public class Hilo2 extends Thread {
    @Override
    public void run() {
        System.out.println("1");
        System.out.println("3");
        System.err.println("5");
        System.out.println("7");
        System.out.println("9");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        int i = 1+3+5+7+9;
        System.out.println("El resultado de la suma de impares es: " +i);
    }
}
