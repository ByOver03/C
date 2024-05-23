package ejercicios_herencia;

public class Hora {

    //Atributos
    int hora;
    int minut;
    

    //Constructor
    Hora(int hora ,int minut){
        this.hora= hora;
        this.minut= minut;
    }

    Hora(){

    }
    

    //Metodo que nos sirve para añadir un minuto a la hora establecida por el usuario
    public void inc(){
        this.minut++;
        if(this.minut>=60){
            this.hora++;
            this.minut-=60;
            if(this.hora>=24){
                this.hora-=24;
            }
        }
    }
    //Estos dos metodos nos sirven para saber si el usuario establece horas y minutos son los correctos o no
    public boolean setMinuts(int minuts){
    if(minuts>=0 && minuts <=59){
        this.minut=minuts;
        return true;
    }
    return false;
    }

    public boolean setHora(int hora){
        if(hora>=0 && hora<=23){
            this.hora=hora;
            return true;
        }
        return false;
    }

    

    //Este Metodo lo utilizamos para mostrar la hora
    @Override
    public String toString(){
        return (this.hora<10? "0":"")+this.hora+":"+(this.minut<10?"0":"")+this.minut;
    }

}