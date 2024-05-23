package marvel;

public class Superpoder {

    //Atributos
    private String nombre;
    private int nivel;

    //Getters
    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    Superpoder(String nombre, int nivel){
        setNivel(nivel);
        setNombre(nombre);
    }

    //Metodo toString para mostrar la informacion
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Nivel: " + getNivel();
    }
}
