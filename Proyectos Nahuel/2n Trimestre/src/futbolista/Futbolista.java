package futbolista;
@SuppressWarnings("rawtypes")
public class Futbolista implements Comparable{

    //Atributos
    String dni;
    String nom;
    int edat;
    int nombregols;

    //Constructor
    Futbolista(String dni, String nom, int edat, int nombregols){
        this.dni= dni;
        this.nom=nom;
        this.edat=edat;
        this.nombregols=nombregols;
    }

    //Metodo para imprimir
    public String toString(){
        return "DNI: "+ this.dni + ", Nombre: " + this.nom + ", Edad: "+ this.edat + ", Numero de goles: " + this.nombregols + "\n";
    }

    //Metodos para comparar el dni
    public boolean equals(){
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Futbolista sp = (Futbolista)o;
        
        return this.dni.compareTo(sp.dni);
    }


}
