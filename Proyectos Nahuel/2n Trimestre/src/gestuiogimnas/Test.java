package gestuiogimnas;

public class Test {
    public static void main(String[] args) {
        MembreGimnas m= new MembreGimnas("Nahuel");

        m.registrarAssistència();
        m.realitzarExercici("Flecione");
        m.obtenirNom();
        m.donarInstruccions("Flexions");
        m.avaluarRendiment();

        m.seguiment();
        m.realitzarEntrenamentPersonalitzat();

    }
    
}
