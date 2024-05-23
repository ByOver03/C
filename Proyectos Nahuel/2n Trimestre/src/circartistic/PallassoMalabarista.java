package circartistic;

public class PallassoMalabarista extends Malabarista{
    //Atributos
    String tipusPallasso;

    //Constructor
    PallassoMalabarista(String nom, int edat, TipusActuacio tipusActuacio,int numPilotes,  String tipusPallasso){
        super(nom, edat, tipusActuacio, numPilotes);
        this.tipusPallasso= tipusPallasso;
    }

    //Metodo para realizar una broma
   public void realitzarBroma(){
        System.out.println("El payaso ha realizado una broma a una persona del publico");
    }

    //Metodo para mostrar la informacion del Objeto
    @Override
    public String toString(){

        return "El Acrobata " + this.getNom() + " de edad " + this.getEdat() + " hará " + this.getTipusActuacio() + " y es un payaso que hace " + this.tipusPallasso;

    }
}
