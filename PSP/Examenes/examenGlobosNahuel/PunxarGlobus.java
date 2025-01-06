package Examenes.examenGlobosNahuel;

public class PunxarGlobus extends Thread {

    // Declaramos la clase Globus para syncronizarlas
    Globus g;
    // Le damos un id y lo volvemos estatico para que las demas clases puedan acceder
    static int id;

    //Declaramos el Constructor para poder instanciarlo en la clase Lanzador
    PunxarGlobus(Globus g, int id) {
        this.g = g;
        this.id = id;
    }

    //Hacemos un metodo que nos devolvera un tiempo aleatorio que hara que el globo se pinche
    int tiempoAleatorio(){
        return (int)(Math.random()*10000)+1000;
    }
    @Override
    public void run() {
        //Declaramos la variable que utilizaremos posteriormente
        boolean cant;

        //Hacemos que cada cierto tiempo se pinche un globo
        do {
            try {
                Thread.sleep(tiempoAleatorio());
            } catch (Exception e) {
            }
            cant = g.pinchGlobo();
        } while (!cant);
    }
}
