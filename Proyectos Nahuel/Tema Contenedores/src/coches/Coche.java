package coches;

@SuppressWarnings("rawtypes")
public class Coche implements Comparable{
    String nombre;
    private double velocidad_maxima;

    //Getters

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad_maxima() {
        return velocidad_maxima;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVelocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    //Constructor
    Coche(String nombre, double velocidad_maxima){
        this.nombre= nombre;
        setVelocidad_maxima(velocidad_maxima);
    }

    
    //Metodo compareto
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    //ToString para devolver la informacion de los coches
    @Override
    public String toString() {
        return "Nombre del Coche: " + getNombre() + " Velocidad Maxima Del Coche: " + getVelocidad_maxima();
    }

    
    
}
