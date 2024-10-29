package ejercicioSyncronized;

public class Puerta extends Thread{
    boolean acceso;
    private int unidades = 100;

    public synchronized boolean pasar (){
        if (acceso){
            notify();
            if(unidades >0){
                System.out.println("El cliente ha entrado y se ha llevado una unidad");
                unidades-=1;
            }else{
                System.out.println("El cliente ha entrado pero no se ha llevado el producto");
            }
            notifyAll();
            acceso =true;
            return true;
        }else{
            System.out.println("El cliente no ha conseguido entrar");
            try {
                wait();
            } catch (Exception e) {
            }
            return false;
        }
    }
}
