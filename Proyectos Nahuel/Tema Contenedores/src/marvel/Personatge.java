package marvel;

public class Personatge implements Comparable<Personatge> {

    //Atributos
    private String nombre;
    private String alias;

    //Getters
    public String getAlias() {
        return alias;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    Personatge(String nombre, String alias){
        setAlias(alias);
        setNombre(nombre);
    }
    //Metodo compareTo para ordenarlos alfabeticamente por el nombre
    @Override
    public int compareTo(Personatge o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Alias: " + getAlias();
    }
    
}
