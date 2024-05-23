package ejercicio7;

import java.time.LocalDateTime;

public class Cliente {
    private String nombre;
    private int añoNacimiento;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return LocalDateTime.now().getYear()-añoNacimiento;
    }

    //Setters
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    Cliente(String nombre, int añoNacimiento){
        setAñoNacimiento(añoNacimiento);
        setNombre(nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad();
    }
}
