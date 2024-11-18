package Casino.Ruleta;

public class Banca{

    int dinInicial = 50000;

    //Se sacara un numero cada 3.000 milisegundos
    synchronized int sacarNumero(){


        while (dinInicial!= 0) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
            int n = (int)(Math.random()*37);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            notifyAll();
            System.out.println(n + " Dinero de la Banca: " + dinInicial);
            return n;
            
        }
                return 0;
    }
}
