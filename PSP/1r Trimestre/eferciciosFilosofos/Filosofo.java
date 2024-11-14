package eferciciosFilosofos;

public class Filosofo extends Thread {
    Cubierto uno;
    Cubierto dos;
    String nombre;

    Filosofo(Cubierto uno, Cubierto dos, String nombre){
        this.uno= uno;
        this.dos = dos;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (true) {
            if(this.uno.disponible && this.dos.disponible){
                this.uno.cogido();
                this.dos.cogido();
                System.out.println( nombre +"esta Comiendo");
                try {
                    Thread.sleep((int)(Math.random()*1000)+4000);
                } catch (InterruptedException e) {
                }
                this.uno.libre();
                this.dos.libre();
            }else{
                System.out.println(nombre + " Esta pensando...");
            }
        }
    }
}
