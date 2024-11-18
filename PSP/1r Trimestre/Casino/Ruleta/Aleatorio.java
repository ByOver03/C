package Casino.Ruleta;

public class Aleatorio extends Thread{
    int dineroInicial = 1000;
    int apuesta = 10;
    Banca b;
    String nombre;

    Aleatorio(String nombre, Banca b){
        this.nombre = nombre;
        this.b = b;
    }

    //Se elige un numero al azar del 1 al 36
    //Se apuestan 10€ y se devolveran 360€ al ganar
    void elegirnumero(){
        while (true) {
            int n = 1;
            while (0<= b.dinInicial) {
                dineroInicial -= apuesta;
                b.dinInicial +=apuesta;
                n = (int)(Math.random()*36)+1;
                if(b.sacarNumero() == n){
                    apuesta *= 36;
                    dineroInicial += apuesta;
                    b.dinInicial-= apuesta;
                    System.out.println(nombre +" Ha ganado la apuestay gana " + apuesta + " euros" + " Con el numero : " + n);
                }else{
                    System.out.println(nombre + " Ha perdido la apuesta " + "Con el numero : " + n);
                }
                
            }
        }
        
    }

    @Override
    public void run() {
        elegirnumero();
    }
}
