package Barberos;

public class Silla {
    //Decidir cantidad sillas
    boolean disponibilidad= true;

    synchronized void disponible(){
        disponibilidad = true;
        notifyAll();
    }

    synchronized void noDisponible(){
        disponibilidad = false;
        notifyAll();
    }
}
