package exercici2_2;

public class HiloTIC implements Runnable {
    
    @Override
    public void run() {
        while (true) {
            System.out.println("TAC");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
}
