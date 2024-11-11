package ejercicioSyncronized;

public class Cliente extends Thread {
    Puerta p;
    int cont = 0;

    Cliente(Puerta c) {
        this.p = c;
    }

    @SuppressWarnings("deprecation")
    public void run() {
        synchronized (this.p) {
            while (this.p.acceso == true) {
                this.cont++;
                try {
                    this.p.wait();
                } catch (Exception e) {
                }
            }
        }

        this.p.pasar();
        if(this.cont <10){
            if(this.p.unidades >0){
                this.p.unidades--;
                System.out.println("El Cliente " + getId() + " ha cogido un producto");
            }else{
                System.out.println("El cliente "+getId()+" ha entrado pero no ha cogido nada");
            }
        }else{
            System.out.println("El cliente "+getId()+" ha intentado demasiadas veces entrar y se ha ido como un maricon");
        }
        this.p.salir();
    }
}
