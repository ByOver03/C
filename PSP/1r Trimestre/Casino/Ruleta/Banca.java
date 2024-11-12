package Casino.Ruleta;

public class Banca{

    int dinInicial = 50000;

    //Se sacara un numero cada 3.000 milisegundos
    synchronized int sacarNumero(){

        while (true) {
            int n = (int)(Math.random()*37);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            notifyAll();
            System.out.println(n);
            return n;
            
        }
    }
}
