package exercici_sumadors;

import java.io.FileWriter;
import java.io.IOException;

public class Sumador {
    @SuppressWarnings("null")
    public static void main(String[] args) throws IOException {
        if(args.length < 2) {
            System.out.println("Debes introducir 2 numeros");
            return;
        }

        int suma = 0;
        

        suma = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

        try (FileWriter writer = new FileWriter("suma.txt")) {
            writer.write(""+suma); // Convierte a String
            System.out.println("La suma se ha guardado en suma.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
