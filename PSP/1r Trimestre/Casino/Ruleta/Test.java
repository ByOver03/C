package Casino.Ruleta;

public class Test {
    public static void main(String[] args) {
        Banca b = new Banca();

        ParImpar p1 = new ParImpar("Ameller", b);
        ParImpar p2 = new ParImpar("Cold Palmer", b);
        ParImpar p3 = new ParImpar("Umtiti", b);
        ParImpar p4 = new ParImpar("Maricon", b);

        Aleatorio a1 = new Aleatorio("Nahuel", b);
        Aleatorio a2 = new Aleatorio("Yoshwa", b);
        Aleatorio a3 = new Aleatorio("Tebas", b);
        Aleatorio a4 = new Aleatorio("Laporta", b);

        Martingala m1 = new Martingala("Robo", b);
        Martingala m2 = new Martingala("Eloy", b);
        Martingala m3 = new Martingala("Mbappe", b);
        Martingala m4 = new Martingala("Morata", b);

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        a1.start();
        a2.start();
        a3.start();
        a4.start();

        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
