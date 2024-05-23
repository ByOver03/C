package teoriaContenedores;

public class Contenedor <T> {
    private T objeto;

    Contenedor(){
        
    }
    public void guardarObjeto(T nuevo){
        objeto= nuevo;
    }

    public T extraerObjeto(){
        T aux = objeto;
        objeto= null;
        return aux;
    }


}
