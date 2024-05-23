package examenficheros.socios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio extends Persona {
    int numero;
    String nombre;
    LocalDate fechaNacimiento;
    LocalDate fechaAlta;

    Socio(int numero, String nombre, String fechaNacimiento, String fechaAlta){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento= LocalDate.parse(fechaNacimiento, f);
        this.fechaAlta= LocalDate.parse(fechaAlta, f);
        this.numero=numero;
        this.nombre=nombre;

    }
}
