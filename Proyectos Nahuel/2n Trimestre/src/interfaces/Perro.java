package interfaces;

public class Perro  implements Sonido{

    public Perro(){

    }

    @Override
    public void voz() {
        
        System.out.println("MIAU");
    }

    
}