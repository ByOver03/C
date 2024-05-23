package fruta;

public class Fruit {
    
    //Atributos
    String nombre;
    private double precio;

    //getters
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Constructor
    Fruit(String nombre, double precio){
        this.nombre= nombre;
        setPrecio(precio);
    }

    public String toString(){
        return "Nombre: " + getNombre() + " Precio: " + getPrecio();
    }
}
