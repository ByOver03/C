public class Test {
    public static void main(String[] args) {
        String p1="Jose";
        String p2="Nahuel";
        String p3="Ametller";
        String p4="Bruno";

        String[] procesos= {p1,p2,p3,p4};
        System.out.println("FIFO");
        for (String string : procesos) {
            System.out.println(string);
        }
        System.out.println("Round Robin");
        for (String string : procesos) {
            for (int i = 2; i < 8; i++) {
                if (string.length()<=i) {
                    System.out.println(string);
                }
                i-=1;
            }
        }
    }
}
