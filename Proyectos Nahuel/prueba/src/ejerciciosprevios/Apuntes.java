package ejerciciosprevios;


import java.util.Arrays;

public class Apuntes {
public static void main(String[]args) {
//	/*arrays
//	 * 
//	 * 1 Elementos homogenios
//	 * 2 Indice -> Numero natural -> Primer elemento == 0
//	 * 3 Tamaño fijo(En java)
//	 */
//	//Declaracion:
//	//tipodedato [] nombredelarray
//	
//	
//	//inicialización directa
//	
//	int []numeros = {5, 10, -1, 6};
//	
//	//inicialización indirecta
//	
//	int[] numeros2= new int[5];
//	numeros2[0] = 3;
//	numeros2[1] = 0;
//	numeros2[2] = 354;
//	numeros2[3] = 94;
//	numeros2[4] = -12;
//	
//	int primernumero = numeros[0];
//	int otronumero = numeros2[4];
//	System.out.println(primernumero + " y " + otronumero);
//	
//	int longituddenumeros = numeros.length;
//	int longituddenumeros2 = numeros2.length;
//	System.out.println(longituddenumeros +" y " +longituddenumeros2);
//	
	//Recorrido arrays
	
	//Bucle for
	
//	int []numeros = {5, 10, -1, 6};
	
//	for(int i= 0; i<numeros.length; i++) {
//		System.out.println(i +" " + numeros[i]);
//	}
	
	//Bucle for each
	
//	for(int numero : numeros) {
//		System.out.println();
//		
//	}
	
//	String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Es Castell"};
//	
//	for (String ciudad : ciudades) {
//		System.out.println("La ciudad es: "+ciudad);
//	}
	
	//Metodos
	
	//clone: crea una copia del array
//	int[] numeros = {1,2,3,4,5};
//	
//	int[] copia = numeros.clone();
//	
//	System.out.println(numeros);
//	System.out.println(copia);
	
	//equals(Object o) (Se utiliza para comparar objeto)
	
//	int[] numeros= {1,2,3};
//	int[] otrosnumeros= {1,2,3};
//	
//	boolean soniguales= Arrays.equals(numeros, otrosnumeros);
//	System.out.println(soniguales);
	
	// toString()
	
//	String arraycomocadena= Arrays.toString(numeros);
//	System.out.println(arraycomocadena);
	
	//sort
	
	int[] numeros= {1,5,3,4,2};
	System.out.println(Arrays.toString(numeros));
	Arrays.sort(numeros);
	System.out.println(Arrays.toString(numeros));
	
	//binarisearch
	
//	int[] numeros= {1,2,3,4,5};
//	String[] cadenas = {"una","dos", "tres", "cuatro", "cinco"};
//	
//	int indice = Arrays.binarySearch(cadenas, "dos");
	
	//fill()
	
//	int[] numeros= new int[5];
//	
//	Arrays.fill(numeros, 0);
//	
//	for(int numero:numeros) {
//		System.out.println(numero);
//		
//	}
	//copyof()
	
//	int[] numeros= {1,2,3,4,5};
//	int[]copia=Arrays.copyOf(numeros, 3);
//	
//	for(int numero:copia) {
//		System.out.println(numero);
//	}
	
	//copyofRange()

//	int[] numeros= {1,2,3,4,5};
//	int[] copia= Arrays.copyOfRange(numeros, 1, 4);
//	for(int numero:copia) {
//		System.out.println(numero);
//	}
	
//	int[] numeros= {1,2,3,4,5};
//	int suma=0;
	
//	for(int i=0; i>numeros.length;i++) {
//		suma += numeros[i];
//		System.out.println(suma);
//	}
	
//	for(int numero: numeros) {
//		suma += numero;
//		System.out.println(suma);
	}
	}

