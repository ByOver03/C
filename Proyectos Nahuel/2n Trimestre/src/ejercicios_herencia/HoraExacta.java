package ejercicios_herencia;

public class HoraExacta extends Hora{
    //Atributos
    int segon;

    //Constructor
    HoraExacta(int hora, int minut, int segon){
        super(hora, minut);
        this.segon=segon;
    }

    //Metodo para incrementar en 1 segundo la hora
    @Override
    public void inc(){
        this.segon++;
        if(this.segon>=60){
            this.segon-=60;
            super.inc();
        }
    }

    //Metodo para saber si el valor introducido es correcto
    public boolean setSegon(int segon){
        if(this.segon>=0 && this.segon<=59){
            return true;
        }
        return false;
    }

    //metodo para mostrar la hora
    @Override
    public String toString(){
        return (this.hora<10? "0":"")+this.hora+":"+(this.minut<10?"0":"")+this.minut+":"+(this.segon<10?"0":"")+ this.segon;
    }

    //Metodo para comparar dos horas
    boolean Comparar(int hora, int minut, int segon){
        if(this.hora== hora&& this.minut==minut&&this.segon==segon){
            return true;
        }
        
        return false;
    }
}