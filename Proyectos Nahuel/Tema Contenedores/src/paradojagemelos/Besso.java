package paradojagemelos;

public class Besso extends Persona{

    //Atributos
    private boolean viatja;

    //getters
    public boolean getViatja(){
        return viatja;
    }

    //Setters
    public void setViatja(boolean viatja) {
        this.viatja = viatja;
    }

    //Constructor
    Besso(String nombre, int edad, boolean viatja) {
        super(nombre, edad);
        setViatja(viatja);
    }
    
}
