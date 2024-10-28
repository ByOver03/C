package ejercicioHilos2;

public class Hilo extends Thread {
    int i = 1;

    @Override
    public void run() {
        while (i != 21) {
            System.out.println(i);
            i+=1;
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
            }
        }
    }
    
}
