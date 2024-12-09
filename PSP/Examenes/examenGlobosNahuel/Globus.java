package Examenes.examenGlobosNahuel;

public class Globus {
    
    //Declaramos los valores que no cambiaran en todo el programa
    final int mVol = 5;
    final int inflMax = 3;
    final int globosTot = 10;
    
    //Declaramos las variables necesarias
    int infl = 0;
    int id = 1;
    int[] g;

    public Globus() {

        g = new int[globosTot];

        for (int i = 0; i < globosTot; i++) {
            g[i] = 0;
        }
    }

    //Metodo para inflar los globos
    synchronized boolean inflarGLobo(int n) {
        if (g[n - 1] <= mVol) {
            g[n - 1]++;
        }
        if (g[n - 1] > mVol + 1) {
            infl--;
            System.out.println("GLOBUS " + n + "EXPLOTA");
            return true;
        } else {
            return false;
        }
    }

    //Metodo para pinchar los globos
    synchronized boolean pinchGlobo() {
        if (id == globosTot) {
            return true;
        }

        for (int i = 0; i < globosTot; i++) {
            if (g[i] > 0 && g[i] <= mVol) {
                System.out.println("GLOBUS " + (i+1) + " PUNXAT PER PG" + PunxarGlobus.id );
                g[i] = 6;
                infl--;
                notifyAll();
                break;
            }
        }
        return false;
    }


    //Metodo para librear los globos
    synchronized int libGlobo() {
        while (id != globosTot + 1 && infl == inflMax) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        g[id - 1] = 1;
        System.out.println("GLOBUS " + id + " LLIURAT A IG" + InflarGlobus.id);
        infl++;
        notifyAll();
        return id++;
    }
}
