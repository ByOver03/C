package circartistic;

public abstract class ArtistaCirc {
    
    //Atributos
    private String nom;
    private int edat;
    private TipusActuacio tipusActuacio;

    //Constructor
    ArtistaCirc(String nom, int edad, TipusActuacio tipusActuacio){
        this.nom= nom;
        this.edat=edad;
        this.tipusActuacio=tipusActuacio;
    }

    //Getters
    public int getEdat() {
        return edat;
    }
    public String getNom() {
        return nom;
    }
    public TipusActuacio getTipusActuacio() {
        return tipusActuacio;
    }

    //Setters
    public void setEdat(int edat) {
        this.edat = edat;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTipusActuacio(TipusActuacio tipusActuacio) {
        this.tipusActuacio = tipusActuacio;
    }

    //Metodo Abstracto
    abstract void realitzarActuacio();

    //Metodo para mostrar toda la informacion de la clase
    @Override
    public String toString(){
        
        return"El artista: "+nom+" de edad " + edat + " hara "+tipusActuacio;
    }

    //Metodo para comparar los objetos
    @Override
    public boolean equals(Object obj){
        if(this.toString().equals(obj)){
            return true;
        }
        return false;
    }
}
