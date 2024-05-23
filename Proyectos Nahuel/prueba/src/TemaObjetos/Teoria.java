package TemaObjetos;
import java.util.*;
public class Teoria {
	public static void main(String[]args) {
//		int [] original= new int[5];
//		original[0]=32;
//		original[1]=33;
//		original[2]=34;
//		original[3]=35;
//		original[4]=36;
//		
//		System.out.println("Longitud original:"+ original.length);
//		original= redimensionArray(original, original.length +1);
//		System.out.println("Longitud nuevo original: " + original.length);
		
//		int[] apuesta= {1, 8, 36, 12, 17, 20};
//		int[] combinacionganadora= {1, 2, 20, 25, 30,43,};
//		//numeros del 1 al 49 (6 numeros)
//		//Encontrar numero de aciertos
//		System.out.println("El numero de aciertos es: "+numeroaciertos(apuesta, combinacionganadora));
//		
//	}
//	private static int[] redimensionArray(int[] original, int nuevalongitud) {
//		int[] nuevoArray=new int[nuevalongitud];
//		for(int i=0; i< original.length; i++) {
//			nuevoArray[i]=original[i];
//		}
//		return nuevoArray;
	}
	public static int numeroaciertos(int[] apuestas, int[] combinacion) {
		int indice=0;
		int valorbuscado=0;
		Arrays.sort(apuestas);
//		Arrays.binarySearch(apuestas, 1);
//		Arrays.binarySearch(apuestas, 2);
//		Arrays.binarySearch(apuestas, 20);
//		Arrays.binarySearch(apuestas, 25);
//		Arrays.binarySearch(apuestas, 30);
//		Arrays.binarySearch(apuestas, 43);
	while(indice< combinacion.length){
			if(combinacion[indice] == apuestas[indice]) {
				valorbuscado++;
			}indice++;
			
		}return valorbuscado;
	}

}
