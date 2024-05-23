package ejercicios_herencia;

public class Atleta {
    
    //Atributos
    String nom;
    int edat;

    //Constructores
    Atleta(String nom, int edad){
        this.nom= nom;
        this.edat=edad;
    }
    Atleta(){
        
    }

    //Presentacion atleta
    @Override
    public String toString(){
        return "A continuacio presentamos el atleta "+ this.nom + " de "+ this.edat+ " años de edad.";
    }

    //Metodo para comparar la igualdad entre atletas
    @Override
    public boolean equals(Object o){
        if(this.toString().equals(o.toString())){
            return true;
        }
        return false;
    }
}
