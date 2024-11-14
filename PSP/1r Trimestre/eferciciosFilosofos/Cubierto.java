package eferciciosFilosofos;

public class Cubierto {
    boolean disponible = true;

    synchronized void cogido(){
        try {
            wait();
        } catch (InterruptedException e) {
        }
        disponible = false;
    }

    synchronized void libre(){
        notifyAll();
        disponible = true;
    }
}
