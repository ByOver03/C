package tema8.src.ejercicio5;


import java.util.Scanner;
import tema8.src.binarioObjeto.GestionFicheros;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numerosUsuario= null;
        
        String fichero="decimales.dat";
        
        System.out.println("introduzca una cantidad de numeros, positivos y decimales, que quiere guardar:");
        int numeros= sc.nextInt();
        numerosUsuario= new double[numeros];
        for(int i=0; i<numerosUsuario.length; i++){
            System.out.println("Introduce un numero");
            numerosUsuario[i]=sc.nextDouble();
        }
        sc.close();
        GestionFicheros.escribirFicheroDoubleArrayToObject(fichero, numerosUsuario);
        double[] array= GestionFicheros.leerFicheroObjectToDoubleArray(fichero);
        System.out.println("Aqui tienes los numeros que has introducido: ");
        for (double d : array) {
            
            System.out.println(d);
        }
    }    
}
