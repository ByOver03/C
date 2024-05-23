package teleco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("rawtypes")
public class Telefonada implements Comparable{
    
    //Atributos
    int numCliente;
    int numInterlocutor;
    boolean llamadaSaliendo;

    ZonaInterlocutor zona;
    LocalDateTime fechaInicioLlamada;
    LocalDateTime fechaFinLlamada;

    static int[] tarifas= {20, 95, 5, 105, 354};
    
    //Constructor
    Telefonada(int numCliente, int numInterlocutor, boolean llamadaSaliendo, ZonaInterlocutor zona, String fechaInicioLlamada, String fechaFinLlamada){

        this.numCliente= numCliente;
        this.numInterlocutor = numInterlocutor;
        this. llamadaSaliendo= llamadaSaliendo;
        this.zona = zona;
        DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.fechaInicioLlamada= LocalDateTime.parse(fechaInicioLlamada, f);
        this. fechaFinLlamada=LocalDateTime.parse(fechaFinLlamada,f);


    }

    //Metodo para determinar la duracion de la llamada
    public int duracionLlamada(){
        
        
        return (fechaFinLlamada.getHour()- fechaInicioLlamada.getHour())*60 + (fechaFinLlamada.getMinute() - fechaInicioLlamada.getMinute());
    }
    

    //Metodo para determinar el coste de la llamada
    public int costeLlamada(){
        int duracionllamada= duracionLlamada();
        @SuppressWarnings("unused")
        int coste;
        switch (zona) {
             case ZONA1:
             return coste=duracionllamada*tarifas[0];
             case ZONA2:
             return coste=duracionllamada*tarifas[1];
             case ZONA3:
             return coste=duracionllamada*tarifas[2];
             case ZONA4:
             return coste=duracionllamada*tarifas[3];
             case ZONA5:
             return coste=duracionllamada*tarifas[4];
             default:
             return 0;
        }
        
    }
    
    //Metodo para mostrar la informacion de la llamada
    public String toString(){
        return "Numero del cliente:" + this.numCliente + ", Numero del interlocutor: " + this.numInterlocutor + ", Dia y hora de la llamada: " + this.fechaInicioLlamada + ", Duracion de la llamada: " + duracionLlamada() + " minutos , Coste de la llamada: " + costeLlamada() + " Centimos de Euro";
    }

    //Metodo para comparar las llamadas
    public int compareTo(Object o) {
        Telefonada t1= (Telefonada)o;
        
        
        if(t1.numCliente== this.numCliente){
            return t1.fechaFinLlamada.compareTo(this.fechaInicioLlamada);
        }
        return ((Telefonada)t1).numCliente- ((Telefonada)this).numCliente;
    }
}
