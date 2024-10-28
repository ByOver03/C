package ejercicioHilos4;

public class Hilo2 implements Runnable{
    String nombre;

    Hilo2(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run() {
        int i = 1;
        int r =(int) (Math.random()*500)+1500;
        while (i!= 31) {
            System.out.print(i + "m, ");
            i+=1;
            try {
                Thread.sleep(r);
            } catch (Exception e) {
            }
        }
        System.out.println(nombre + "ha terminado la carrera");
    }
}
