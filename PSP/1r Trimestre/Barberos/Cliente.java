package Barberos;

public class Cliente extends Thread {
    Silla[] s;
    int CANTIDAD_SILLAS;
    int id;
    Cliente (Silla[]s, int CANTIDAD_SILLAS, int id){
        this.s = s;
        this. CANTIDAD_SILLAS = CANTIDAD_SILLAS;
        this.id= id;
    }

    void buscarSilla(){
            for (int i = 0; i < CANTIDAD_SILLAS-1; i++) {
                if (s[i].disponibilidad=true) {
                    s[i].noDisponible();
                    break;
                }
            }
            esperar();
    }

    void esperar(){
        
    }

    void irse(){

    }

    @Override
    public void run() {
        synchronized(s){
            buscarSilla();
        }
    }
}
