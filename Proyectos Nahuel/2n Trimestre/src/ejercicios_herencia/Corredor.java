package ejercicios_herencia;

public class Corredor extends Atleta {
    
    //Atributo
    int velocitat;

    //Constructor
    Corredor(String nom, int edat, int velocidad){
        this.edat=edat;
        this.nom=nom;
        this.velocitat= velocidad;
    }

    //Metodo para decir velocidad del Corredor
    @Override
    public String toString(){

        return"El Atleta " + this.nom + " se presentara como corredor, y su velocidad media es de " +this.velocitat + " km/h.";
    }

    //Metodo para comparar igualdad entre corredores
    @Override
    public boolean equals(Object o){
        if(this.toString().equals(o.toString())){
            return true;
        }
        
        return false;
    }
}
