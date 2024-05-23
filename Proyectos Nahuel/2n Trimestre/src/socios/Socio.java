package socios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;@SuppressWarnings("rawtypes")

public class Socio implements Comparable {

    int id;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento){
        this.id = id;
        this.nombre= nombre;
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }
    
    int edad(){
        
        return (int) this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public int compareTo(Object o){
        

        Socio sp = (Socio)o;

//        if(this.id < sp.id){
//            return -1;
//        }else if(this.id > sp.id){
//            return 1;
//        }else{
//        return 0;
//        }
        return this.id - sp.id;
    }

    public String toString(){
        return "id: " + this.id + ", Nombre: " + this.nombre + ", Edad: " + edad() + "\n";
    }
}