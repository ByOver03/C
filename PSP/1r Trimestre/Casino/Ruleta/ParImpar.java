package Casino.Ruleta;

public class ParImpar extends Thread{
    
    int dineroInicial = 1000;
    int apuesta = 10;
    Banca b;
    String nombre;
    
    ParImpar(String nombre, Banca b){
        this.nombre = nombre;
        this.b = b;
    }

    //Se elige apostar por pares o Impares
    //Se apostaran 10€ y se duplicara al acertar
    void parimpar(){
        dineroInicial -= apuesta;
        b.dinInicial +=apuesta;
        int n = (int)(Math.random()*2)+1;
        n=b.dinInicial/n;
        if((b.dinInicial/n)== n){
            apuesta *= 2;
            dineroInicial += apuesta;
            b.dinInicial -=apuesta;
            System.out.println(nombre +" Ha ganado la apuesta y gana " + apuesta + "€"+ " Con el numero : " + n);
        }else{
            System.out.println(nombre + " Ha perdido la apuesta" + " Con el numero : " + n);
        }
    }

    @Override
    public void run() {
        parimpar();
    }

    

    
}
