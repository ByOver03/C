package ejercicioSyncronized;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        ArrayList<Cliente> c = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            c.add(new Cliente());
        }
    }
}
