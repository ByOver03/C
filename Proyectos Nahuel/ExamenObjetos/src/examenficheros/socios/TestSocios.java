package examenficheros.socios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class TestSocios {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Socio s[]= new Socio[0];
        String fichero="socio.dat";
        boolean sigo;
        String seguir;
        
        do{
        System.out.println("Introduzca el nombre del usuario");
        String nombre=sc.next();
        System.out.println("Introduzca la fecha de nacimiento del usuario con formato'dd-mm-yyy'");
        String fechaNacimiento=sc.next();
        System.out.println("Introduzca la fecha de alta del usuario con formato'dd-mm-yyy'");
        String fechaAlta=sc.next();

        s= Arrays.copyOf(s, s.length+1);
        Socio s1= new Socio(s.length, nombre, fechaNacimiento, fechaAlta);
        s[s.length-1]= s1;
        System.out.println("desea introducir otro usuario?");
        seguir=sc.next();
        seguir = seguir.toLowerCase();
        if (seguir.equals("si")) {
            sigo = false;
        } else {
            sigo=true;
        }
        }while(sigo== false);
        escribirFicheroArrayClassToObject(s, fichero);
        System.out.println(leerFicheroObjectToArrayClass(fichero));
        for (Socio socio : leerFicheroObjectToArrayClass(fichero)) {
            System.out.println(socio);
        }
        sc.close();

    }
    
    public static void escribirFicheroArrayClassToObject(Object[] array, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(array);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve como un array de una clase
    public static Socio[] leerFicheroObjectToArrayClass(String fichero) {
        Socio[] array = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            array = (Socio[])ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return array;
    }
}
