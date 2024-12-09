package Examenes.examenGlobosNahuel;

public class InflarGlobus extends Thread {
    // Declaramos la clase Globus para syncronizarlas
    Globus g;
    // Le damos un id y lo volvemos estatico para que las demas clases puedan acceder
    static int id;

    // Hazemos un constructor para poder inicializar la clase
    InflarGlobus(Globus g, int id) {
        this.g = g;
        this.id = id;
    }

    @Override
    public void run() {
        // Creamos las siguientes variables para utilizarlas mas tarde
        int i;
        boolean est;

        //Hacemos que cuando llege a un maximo de 5 infladas el Globo explote
        while (true) {
            if ((i=g.libGlobo()) == 5) {
                break;
            }
            do {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                est = g.inflarGLobo(i);
            } while (!est);
        }

    }
}
