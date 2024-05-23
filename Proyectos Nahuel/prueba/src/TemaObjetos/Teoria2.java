package TemaObjetos;
import java.util.*;
public class Teoria2 {

	public static void main(String[] args) {
		
		int[] arrayOrigen= {1, 2, 3, 4,5,6,7,8};
		int[] arrayDestino= new int[4];
		System.out.println("destino: "+ Arrays.toString(arrayOrigen));
		System.arraycopy(arrayOrigen, 7, arrayDestino, 0, 1);
		
		System.out.println("destino: "+ Arrays.toString(arrayDestino));
		
		//ArrayCopy - System
		//Copia dos elementos consecutivos entre dos arrays.
		
		/*void arrayCopy (Object arrayOrigen, int posorigrn, Object arrayDestino, int posdestino, int Longitud)
		 * 
		 * Copia en arrayDestino a partir del indicie posdestino, los datos de arrayOrigen comenzando en el indice posorigen.
		 * int Longitud indica el numero de elementos que se copiaran.
		 */
		
	}

}
