package examenes;
import java.util.*;
public class Capturas {

	public static void main(String[]args) {
		//Declaramos un Scanner para registrar las respuestas del usuario
		Scanner sc=new Scanner(System.in);
		
		//Declaramos las variables de texto para registrar el texto que tiene que decir la aplicacion
		String explicacion="En este programa te pediremos la cantidad de capturas que has hecho y el peso de estas \n Segun el peso introducido te diremos si la captura es apta o no";
		String introduccionpeso="Introduzca el peso de la captura";
		String cuantascapturas="¿Cuantas capturas ha hecho?";
		
		//Declaramos los int para hacer las operaciones necesarias posteriormente
		int numerocapturas;
		int pesopescados;
		int aptos=0;
		int noaptos=0;
		
		//Declaramos el String salida para no tener que poner todo el texto en los sysos
		String salida;
		
		//le explicamos la aplicacion al usuario y le pedimos la cantidad de capturas que quiere registrar
		System.out.println(explicacion+"\n\n"+cuantascapturas);
		numerocapturas=sc.nextInt();
		
		//Con este bucle determinaremos la cantidad de capturas aptas y no aptas introducidas
		for(int i=0; i<numerocapturas; i++){
			//Le pedimos al usuario que introduzca el peso de un pescado
			System.out.println(introduccionpeso);
			pesopescados=sc.nextInt();
			
			//Con esta condicion le pedimosque en caso de que la funcion sea "true" que diga que la captura ha sido apta y sume 1 al contador de aptos
		if(aptas(pesopescados)) {
			System.out.println("Captura apta");
			aptos++;
			//En caso contrario le dira que la captura no es apta y que añada 1 al contador de no aptas
		}else {
			System.out.println("Captura no apta");
			noaptos++;
		}
		}
		//Al final le diremos al usuario la cantidad de capturas aptas y no aptas
		salida= "Este es el numero de capturas aptas: "+ aptos+ "\nEste es el numero de capturas no aptas: "+noaptos;
		System.out.println(salida);
		sc.close();
	}
	/*Con esta funcion declararemos si las capturas son aptas
	 * Si la captura supera los 50 kg le diremos que devuelva true
	 * en caso contrario le pediremos que devuelva false
	 */
	public static boolean aptas(int peso) {
		if(peso>=50) {
			return true;
		}else {
			return false;
		}
	}
}
