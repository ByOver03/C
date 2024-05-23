package circartistic;

public class Acrobata extends ArtistaCirc{
    
    //Atributs
    String especialitat;

    //Constructor
    Acrobata(String nom, int edat, TipusActuacio tipusActuacio, String especialitat){
        super(nom, edat, tipusActuacio);
        this.especialitat=especialitat;
    }

    //Metodo para que diga la actuacion que hara
    @Override
    void realitzarActuacio(){
        System.out.println("A continuacion el Malabarista " + this.getNom() + " hará " + this.getTipusActuacio());
    }

    //Metodo para mostrar la informacion del objeto
    @Override
    public String toString(){
        
        return "El Acrobata " + this.getNom() + " de edad " + this.getEdat() + " hará " + this.getTipusActuacio() +" y su especialidad es " + this.especialitat;
    }
}
