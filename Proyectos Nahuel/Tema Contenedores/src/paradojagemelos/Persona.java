package paradojagemelos;

public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;

    //Getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    Persona(String nombre, int edad){
        setEdad(edad);
        setNombre(nombre);
    }

}
