package ejercicioSyncronized;

public class Puerta extends Thread{
    boolean acceso = true;
    int unidades = 100;

    public synchronized void pasar(){
        acceso = true;
        notifyAll();
    }

    public synchronized void salir(){
        acceso = false;
        notifyAll();
    }
}
