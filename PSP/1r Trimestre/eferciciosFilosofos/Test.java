package eferciciosFilosofos;

public class Test {
    public static void main(String[] args) {
        Cubierto a = new Cubierto();
        Cubierto b = new Cubierto();
        Cubierto c = new Cubierto();
        Cubierto d = new Cubierto();
        Cubierto e = new Cubierto();

        Filosofo f1 = new Filosofo(a, b, "Ametller");
        Filosofo f2 = new Filosofo(b, c, "Yoshwa");
        Filosofo f3 = new Filosofo(c, d, "Robo");
        Filosofo f4 = new Filosofo(d, e, "Otamendi");
        Filosofo f5 = new Filosofo(e, a, "Daniel Mariano Jesus Delacaridad");

        f1.start();
        f2.start();
        f3.start();
        f4.start();
        f5.start();
    }
}
