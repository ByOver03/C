package examenficheros.socios;

import java.time.LocalDate;

public class Persona implements IPersona{
    String nombre;
    LocalDate fechaNacimiento;
    
    public String modificarNombrePersona(String nombre) {
        this.nombre= nombre;
        
        return "El nombre ha sido cambiado a: " + this.nombre;
    }
    @Override
    public String modificarFechaNacimiento(LocalDate fecha) {
        
        return "La fecha ha sido cambiada";
        
    }
    @Override
    public String validaFechaNacimiento() {
        return "";
    };
}
