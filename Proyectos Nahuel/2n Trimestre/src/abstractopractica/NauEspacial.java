package abstractopractica;

public abstract class NauEspacial {
    String nom;
    int capacitatTripulants;

    NauEspacial(String nom, int capacitatTripulants){
        this.nom=nom;
        this.capacitatTripulants=capacitatTripulants;
    }
    
    //Metodo abstracto
    abstract void enlairar();

    //Metodo para decir que la nave ha aterrizado
    void aterrar(){

        System.out.println("La nave ha aterrizado");
    }

    //Metodo para mostrar la informacion de la nave
    @Override
    public String toString(){
        String salida="Nombre de la nave: " + this.nom +"\nCapacidad de tripulantes: " + this.capacitatTripulants;
        return salida;
    }

    //Metodo para comparar naves por nombre y capacidad
    @Override
    public boolean equals(Object obj){
        if(this.toString().equals(obj.toString())){
            return true;
        }
        return false;
    }
}
