package recetas;

public class Ingrediente {
    private double precio;
    private String nombre;

    Ingrediente(String nombre, double precio){
        this.precio= precio;
        this.nombre= nombre;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
