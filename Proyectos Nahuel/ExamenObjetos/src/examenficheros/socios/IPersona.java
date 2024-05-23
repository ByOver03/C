package examenficheros.socios;

import java.time.LocalDate;

public interface IPersona {

    String modificarNombrePersona(String nombre);
    String modificarFechaNacimiento(LocalDate fecha);
    String validaFechaNacimiento();
}
