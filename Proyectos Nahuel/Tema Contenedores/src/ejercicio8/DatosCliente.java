package ejercicio8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DatosCliente {
    private String nombre;
    private LocalDateTime fechaNacimiento;

    public DatosCliente(Cliente c) {
        nombre = c.getNombre();
        fechaNacimiento = c.getAñoNacimiento();
    }

    public int edad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    
    public String toString() {
        return "Nombre: " + nombre + "    Edad: " + edad();
    }
    
}
