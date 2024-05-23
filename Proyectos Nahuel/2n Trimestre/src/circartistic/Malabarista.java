package circartistic;

public class Malabarista extends ArtistaCirc{
    
    //Atributo
    int numPilotes;

    //Constructor
    Malabarista(String nom, int edat, TipusActuacio tipusActuacio, int numPilotes){
        super(nom, edat, tipusActuacio);
        this.numPilotes=numPilotes;
    }

    //Metodod para realizar la actuacion del mago
    @Override
    void realitzarActuacio(){
        System.out.println("A continuacion el Malabarista " + this.getNom() + " hará " + this.getTipusActuacio());
    }

    //Metodo para mostrar la informacion del objeto
    @Override
    public String toString(){

        return "El malabarista " + this.getNom() + " de edad " + this.getEdat() + " hará " + this.getTipusActuacio() + " con " + this.numPilotes + " pelotas";
    }
}
