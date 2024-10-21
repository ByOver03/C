package exercici2_2;

public class HiloTAC implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("TIC");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
    
}
