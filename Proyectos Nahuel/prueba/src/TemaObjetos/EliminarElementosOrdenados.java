package TemaObjetos;
import java.util.*;
public class EliminarElementosOrdenados {
	public static void main(String[] args) {
		int[] numeros= {-4, -1, 0, 2, 11, 145, 666, 1000};
		int valorAEliminar= 11;
		int indiceAEliminar = Arrays.binarySearch(numeros, valorAEliminar);
		
		System.out.println("indiceAEliminar:   " + indiceAEliminar);
		
		if(indiceAEliminar < 0) {
			indiceAEliminar= -(indiceAEliminar+1);
			System.out.println("indice a insertar: " + indiceAEliminar);
		}else {
			int[] nuevoArray= new int[numeros.length -1];
			System.arraycopy(numeros, 0, nuevoArray, 0, indiceAEliminar);
			System.arraycopy(numeros, indiceAEliminar +1, nuevoArray, indiceAEliminar, nuevoArray.length - indiceAEliminar);
			System.out.println("nuevoArray: " +Arrays.toString(nuevoArray));
		}
		
		
		
	}
}
