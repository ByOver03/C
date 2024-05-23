package teoriaContenedores;

public class Test {
    public static void main(String[] args) {
        Contenedor <Integer> c = new Contenedor<Integer>();

        c.guardarObjeto(15);

        System.out.println(c.extraerObjeto());
        
        Cliente c2 = new Cliente("Nahuel", "1");
        
        Contenedor<Cliente> c3 = new Contenedor<>();
        c3.guardarObjeto(c2);
        
        System.out.println(c3.extraerObjeto().nom);
        //System.out.println(c3.extraerObjeto().dni);

    }
}
