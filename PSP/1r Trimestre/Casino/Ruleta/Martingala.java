package Casino.Ruleta;

public class Martingala extends Thread{
    int dineroInicial = 1000;
    int apuesta = 10;
    Banca b;
    String nombre;

    Martingala(String nombre, Banca b){
        this.nombre = nombre;
        this.b = b;
    }

    //Se apostaran 10€ a un numero aleatorio
    //Si ganan 360€, Si pierden duplicaran lo apostado
    void martingala(){
        dineroInicial -= apuesta;
        b.dinInicial +=apuesta;
        int n = (int)(Math.random()*36)+1;
        while (b.sacarNumero() == n) {
            if(b.sacarNumero() == n){
                apuesta *= 36;
                dineroInicial += apuesta;
                System.out.println(nombre +" Ha ganado la apuestay gana " + apuesta + "€" +  " Con el numero : " + n);
            }else{
                apuesta *= 2;
                dineroInicial-= apuesta;
                b.dinInicial -=apuesta;
                System.out.println(nombre + " Ha perdido la apuesta y ahora apostara el doble"+ " Con el numero : " + n);
            }
        }
    }

    @Override
    public void run() {
        martingala();
    }
}
