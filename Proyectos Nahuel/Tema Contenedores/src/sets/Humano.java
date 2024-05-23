package sets;

public class Humano {
    
    private String nombre;
    private String apellido;

    public Humano(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
