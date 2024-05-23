package examencolecciones;

import java.io.Serializable;

public class Jugador implements IPersona, Serializable {

    private String nombre;
    private int edad;
    private String dni;
    private Posicion posicion;
    
    //Getters
    @Override
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    //Setters
    @Override
    public void setEdad(int edad) {
        this.edad= edad;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    //Constructor
    Jugador(String nombre, int edad, String dni, Posicion posicion){
        setDni(dni);
        setNombre(nombre);
        setEdad(edad);
        setPosicion(posicion);
    }

    //Metodo toString para mostrar la informacion del jugador
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", DNI: " + getDni() + ", Posicion: " + getPosicion();
    }
}
