package abstractopractica;

public class NauGuerra extends NauEspacial {
    int numArmes;

    NauGuerra( String nom, int capacitatTripulants, int numArmes){
        super(nom, capacitatTripulants);
        this.numArmes= numArmes;

    }

    //Metodo para hacer volar la nave a un planeta
    @Override
    void enlairar(){
        System.out.println("Esta volando con "+this.numArmes+ " armas");

    }

    //Metodo para mostrar la informacion de la nave
    @Override
    public String toString(){
        String salida="Nombre de la nave: "+ this.nom + "\nCapacidad de la Nave: "+ this.capacitatTripulants + "\nCantidad de Armas: " +this.numArmes;
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
