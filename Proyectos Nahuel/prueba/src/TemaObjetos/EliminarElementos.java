package TemaObjetos;
import java.util.*;
public class EliminarElementos {
	public static void main(String[] args) {
	
		int[] numeros= {3, 0, 22, -243, 14, -1, 98};
		int[] nuevoArray= new int [numeros.length -1];
		int valorAEliminar=3;
		int indiceAEliminar=-1;
		
		for(int i = 0; i< numeros.length; i++){
			if(numeros[i]== valorAEliminar) {
				indiceAEliminar=i;
				break;
			}
		
		
	
		}
		if(indiceAEliminar != -1) {
			System.arraycopy(numeros, 0, nuevoArray, 0, indiceAEliminar);
			System.arraycopy(numeros, indiceAEliminar +1, nuevoArray, indiceAEliminar, nuevoArray.length - indiceAEliminar);
		}
		System.out.println("nuevoArray: "+  Arrays.toString(nuevoArray));
		System.out.println("numeros:    "+ Arrays.toString(numeros));
	}
}
