package abstractopractica;

public class NauExploradora extends NauEspacial {
    TipusPlaneta tipusPlaneta;

    NauExploradora(String nom, int capacitatTripulants, TipusPlaneta tipusPlaneta){
        super(nom, capacitatTripulants);
        this.tipusPlaneta= tipusPlaneta;
    }

    //Metodo para hacer volar la nave a un planeta
    @Override
    void enlairar(){
        System.out.println("Actualment esteim volant al planeta: "+ this.tipusPlaneta);
    }

    //Metodo para mostrar la informacion de la nave
    @Override
    public String toString(){
        String salida="Nombre de la nave: "+this.nom+"\nCapacidad de la nave: "+this.capacitatTripulants+ "\nPlaneta al que esta volando actualmente: "+this.tipusPlaneta;
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
