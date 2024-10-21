package exercici2_2;

public class Test {
    public static void main(String[] args) {
        HiloTAC tac = new HiloTAC();
        HiloTIC tic = new HiloTIC();

        Thread h1 = new Thread(tac);
        Thread h2 = new Thread(tic);

        h1.start();
        h2.start();
    }
}
