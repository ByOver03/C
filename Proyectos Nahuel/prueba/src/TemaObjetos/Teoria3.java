package TemaObjetos;
import java.util.*;
public class Teoria3 {

	public static void main(String[] args) {
		int[] arrayOrigen= {-4, -2, 0, 2, 11, 145, 666, 1000};
		int valornumero=7;
		int indiceDeInsercion=-1;
		
		System.out.println("Origen:                      "+ Arrays.toString(arrayOrigen));
		System.out.println("****************************************************************");
		arrayOrigen= sinRepetidos(arrayOrigen);
		System.out.println("Origen sin repetidos:        "+ Arrays.toString(arrayOrigen));
		
		indiceDeInsercion= Arrays.binarySearch(arrayOrigen, valornumero);
		
		System.out.println("indiceDeInsercion: "+ indiceDeInsercion);
		if(indiceDeInsercion<0) {
			indiceDeInsercion= -(indiceDeInsercion +1);
		}
		System.out.println("indiceDeInsercion real: "+ indiceDeInsercion);
		int[] nuevoArray= Arrays.copyOf(arrayOrigen, arrayOrigen.length +1);
		
		System.arraycopy(arrayOrigen, indiceDeInsercion, nuevoArray, indiceDeInsercion +1, arrayOrigen.length - indiceDeInsercion);
		
		nuevoArray[indiceDeInsercion]= valornumero;
		
	}
	
	private static int[] sinRepetidos(int[] t) {
		
		int[] temporal= new int[0];
		
		for(int elemento: t) {
			if(!buscar(temporal, elemento)) {
				temporal = Arrays.copyOf(temporal, temporal.length +1);
				temporal[temporal.length-1]=elemento;
			}
		}
		
		return temporal;
	}
	private static boolean buscar(int[] t, int valorBuscado) {
		
		boolean encontrado= false;
		
		for(int i=0; i < t.length; i++) {
			if(t[i] == valorBuscado) {
				encontrado=true;
				break;
			}
		}
		
		return encontrado;
	}

}
