package abstracto;

public abstract class A {
    
    public String nombre= "Nahuel";
    
    public abstract void metodo();

    void metodoNoAbstracto(){
        System.out.println("Soy un metodo de la clase A");
    }
}
