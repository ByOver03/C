package Casino.RuletaBien;

public class Test {
    public static void main(String[] args) {
        Banca b = new Banca();
        Jugador j1 = new Jugador(b, 1, Juego.ALEATORIO);
        Jugador j2 = new Jugador(b, 2, Juego.ALEATORIO);
        Jugador j3 = new Jugador(b, 3, Juego.ALEATORIO);
        Jugador j4 = new Jugador(b, 4, Juego.ALEATORIO);

        Jugador j5 = new Jugador(b, 5, Juego.MARTINGALA);
        Jugador j6 = new Jugador(b, 6, Juego.MARTINGALA);
        Jugador j7 = new Jugador(b, 7, Juego.MARTINGALA);
        Jugador j8 = new Jugador(b, 8, Juego.MARTINGALA);

        Jugador j9 = new Jugador(b, 9, Juego.PARIMPAR);
        Jugador j10 = new Jugador(b, 10, Juego.PARIMPAR);
        Jugador j11 = new Jugador(b, 11, Juego.PARIMPAR);
        Jugador j12 = new Jugador(b, 12, Juego.PARIMPAR);

        Ruleta r = new Ruleta(b);

        r.start();
        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
        j6.start();
        j7.start();
        j8.start();
        j9.start();
        j11.start();
        j12.start();
        j10.start();
    }
}
