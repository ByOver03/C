package battleship;

public class Barco implements IBarco{
    
    String nombre;
    String[] casillas;
    
    @Override
    public void ObtenerNombre() {
        System.out.println("Que barco quieres introducir?");
    }
    @Override
    public void Tamaño() {
        
    }
    
}
