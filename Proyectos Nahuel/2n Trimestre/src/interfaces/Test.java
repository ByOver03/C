package interfaces;

public class Test {
    public static void main(String[] args) {
        Perro p = new Perro();
        Gato g = new Gato();

        System.out.print("El perro dice: ");
        p.voz();
        System.out.print("El gato dice: ");
        g.voz();

        System.out.println(Sonido.VERSION);

        p.vozDurmiendo();

        Sonido.bostezo();
    }
    
}
