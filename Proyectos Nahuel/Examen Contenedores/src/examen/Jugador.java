package examen;

public class Jugador implements IPersona, Serializable {

    private String nombre;
    private int edad;
    private final String DNI;
    private Posicion posicion;
    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void serEdad(int edad) {
        this.edad= edad;
        
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre= nombre;
        
    }

    Jugador(String nombre, int edad, String DNI, Posicion posicion){
        serEdad(edad);
        setNombre(nombre);
        this.DNI = DNI;
        this.posicion= posicion;
    }
    
}
