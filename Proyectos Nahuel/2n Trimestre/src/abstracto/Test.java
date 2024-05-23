package abstracto;

public class Test {
    public static void main(String[] args) {
        B b = new B();

        b.metodo();
        b.metodoNoAbstracto();

        System.out.println(b.nombre);
        
        A a = b;

        a.metodo();
        System.out.println(a.nombre);
    }
}
