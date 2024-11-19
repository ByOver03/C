package Casino.RuletaBien;

public class Ruleta extends Thread {

    Banca banca;
    static boolean disponible = false;

    Ruleta(Banca banca) {
        this.banca = banca;
    }

    @Override
    public void run() {
        while (banca.dinero > 0) {
            girarRuleta();
        }
    }

    void girarRuleta() {
        synchronized (banca) {
            int numero = (int) (Math.random() * 37);
            banca.numero = numero;
            System.out.println("Número generado por la banca: " + numero + " Dinero de la Banca: " + banca.dinero);

            disponible = true; 
            banca.notifyAll(); 

            while (disponible) {
                try {
                    banca.wait();
                } catch (InterruptedException e) {
                }
            }
        }
        try {
            sleep(3000); 
        } catch (InterruptedException e) {
        }
    }
}
