package examen1.jornadalaboral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("rawtypes")
public class Jornada implements Comparable{
    
    //Atributos
    String dniTrabajador;
    LocalDateTime fechahoraEntrada;
    LocalDateTime fechahoraSalida;

    //Constructor
    Jornada(String dniTrabajador, String fechahoraEntrada, String fechahorsSalida){

        this.dniTrabajador= dniTrabajador;
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.fechahoraEntrada= LocalDateTime.parse(fechahoraEntrada, f);
        this. fechahoraSalida=LocalDateTime.parse(fechahorsSalida, f);
    }

    //Metodos para mostrar la cantidad de minutos trabajados
    double minutosTrabajadosJornada(){
        return (fechahoraSalida.getHour()- fechahoraEntrada.getHour())*60 + (fechahoraSalida.getMinute() - fechahoraEntrada.getMinute());
    }

    //Metodo para ordenar los objetos
    @Override
    public int compareTo(Object o) {
        Jornada j = (Jornada)o;
        if(j.dniTrabajador == this.dniTrabajador){
            return j.fechahoraEntrada.compareTo(this.fechahoraEntrada);
        }

        return j.compareTo(this.dniTrabajador);
    }

    //Metodo para mostrar la informacion de la jornada del trabajador
    public String toString(){
        return "El DNI del trabajador es: " +this.dniTrabajador + " Ha entrado el dia: " + this.fechahoraEntrada + " y ha trabajado: " + minutosTrabajadosJornada() + " minutos";
    }



}
