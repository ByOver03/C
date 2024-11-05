package ejercicioSyncronized;

public class Cliente extends Thread {
    @Override
    public void run() {
        Puerta p = new Puerta();

        p.pasar();
    }
}
