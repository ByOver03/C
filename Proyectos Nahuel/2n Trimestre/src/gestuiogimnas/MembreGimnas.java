package gestuiogimnas;

public class MembreGimnas implements Entrenador{

    String nombre;

    MembreGimnas(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void registrarAssistència() {
        System.out.println("El Socio "+ this.nombre+ " ha entrado al gimnasio");
    }

    @Override
    public void realitzarExercici(String exercici) {
        System.out.println(this.nombre + " esta haciendo " + exercici);
    }

    @Override
    public void obtenirNom() {
        System.out.println("El miembro se llama: " + this.nombre);
        
    }

    @Override
    public void donarInstruccions(String instruccio) {
        System.out.println("Haz 20 Flexiones!!");
    }

    @Override
    public void avaluarRendiment() {
        
    }

    

   

    

    
    
}
