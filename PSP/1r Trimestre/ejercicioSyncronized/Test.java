package ejercicioSyncronized;

public class Test {
    public static void main(String[] args) {

        Puerta p = new Puerta();        
        for (int i = 0; i < 300; i++) {
            Cliente c = new Cliente(p);
            c.start();
        }
    }
}
