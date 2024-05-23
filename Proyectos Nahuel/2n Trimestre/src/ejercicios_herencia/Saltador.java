package ejercicios_herencia;

public class Saltador extends Atleta{

    //Atributo
    double alturaSalt;

    //Constructor
    Saltador(String nom, int edat, double alturaSalt){
        this.nom= nom;
        this.edat= edat;
        this.alturaSalt=alturaSalt;
    }

    //Metodo para especificar el salto del Atleta
    @Override
    public String toString(){
        return "El Atleta " + this.nom + " se presentara hoy como Saltador, su media de salto es: " + this.alturaSalt + " metros.";
    }

    //Metodo para compararSaltadores
    public boolean equal(Object o){
        if(this.toString().equals(o.toString())){
            return true;
        }
        return false;
    }
}
