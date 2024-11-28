package Barberos;

public class Barbero extends Thread {
    // Decidir cantidad barberos
    Silla[] s;
    int id;
    int CANTIDAD_SILLAS;
    boolean trabajando = false;

    Barbero(Silla[] s, int CANTIDAD_SILLAS, int id) {
        this.s = s;
        this.id = id;
        this.CANTIDAD_SILLAS = CANTIDAD_SILLAS;
    }

    void trabajando() {
        for (int i = 0; i < CANTIDAD_SILLAS - 1; i++) {
            if (!s[i].disponibilidad) {
                trabajando = true;
                System.out.println("El Barbero " + id + " esta cortando el pelo...");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                trabajando = false;
                s[i].disponible();
                break;
                
            }
        }
        System.out.println("El Barbero " + id + " esta durmiendo.... 'ZZZ'");
    }

    @Override
    public void run() {
        synchronized (s) {
            trabajando();
        }
    }
}
