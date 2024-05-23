package gestuiogimnas;

public interface Entrenador extends Soci {

    void donarInstruccions(String instruccio);
    void avaluarRendiment();
    default void realitzarEntrenamentPersonalitzat(){
        System.out.println("Ha realizado un entrenamiento");
    }
    static void anunciarNouEntrenador(){
        System.out.println("Ha anunciado un nuevo entrenador");
    }
    private void realitzarSeguiment(){
        System.out.println("Ha realizado el seguimiento");
    }

    default void seguiment(){
        anunciarNouEntrenador();
        realitzarSeguiment();
    }

    
}
