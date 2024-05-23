package ejercicio8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nombre;
    private LocalDateTime añoNacimiento;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return LocalDateTime.now().getYear()-añoNacimiento.getYear();
    }
    public LocalDateTime getAñoNacimiento() {
        return añoNacimiento;
    }

    //Setters
    public void setAñoNacimiento(String añoNacimiento) {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.añoNacimiento= LocalDateTime.parse(añoNacimiento, f);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    Cliente(String nombre, String añoNacimiento){
        setAñoNacimiento(añoNacimiento);
        setNombre(nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad();
    }
}
