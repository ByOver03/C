package ejerciciosprevios;
import java.util.*;
public class CajaSecreta {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//Declaramos las variables de texto para poder decir lo que queremos en la aplicacion
		String explicacion="En este juego tienes que introducir una antidad de digitos que tendra la caja secreta\ny despues tendras que adivinar el numero generado aleatoriamente que estara compuesto por digitos del 1 al 5\nposteriormente la consola te dira si el numero es mas alto o mas bajo si has fallado";
		String introduccionusuario="Cuantos dijitos tiene que tener el codigo de la caja secreta?";
		String adivinar="Ingresa un numero para abrir la caja secreta: ";
		String masalto="El numero es mas alto";
		String masbajo="El numero es mas bajo";
		String error="Lo siento el valor que has introducido no es correcto";
		String adivinado="Enhorabuena has adivinado el numero";
		
		//Declaramos los int para poder hacer los calculos con numeros
		int cantidadusuario;
		int guessusuario=0;
		//Le explicamos al usuario de que va la aplicacion y le pedimos que introduzca la cantidad de digitos necesarios
		System.out.println(explicacion+"\n\n"+ introduccionusuario);
		cantidadusuario=sc.nextInt();
		//declaramos un Array para generar el codigo de la caja secreta
		int[] numeroaleatorio;
		numeroaleatorio=new int[cantidadusuario];
		//Le pedimos que con un bucle si el numero ingresado es menor o igual a 0 que le pida introducir otra cantidad
		while(cantidadusuario<=0) {
			System.out.println(error);
			cantidadusuario=sc.nextInt();
		}
		//Con otro bucle le pedimos que genere un numero de 1 al 5 paara ir haciendo el codigo de la caja
		for(int i=0; i<cantidadusuario;i++) {
			numeroaleatorio[i]= (int)(Math.random()*5)+1;
		}
		//Le pedimos al usuario que intente adivinar el codigo
		System.out.println(adivinar);
		guessusuario=sc.nextInt();
		/*Con otro bucle hacemos que si el numero introducido es mayor salga el texto de que el numero es menor
		 * en caso contrario que salga que el numero es mayor
		 * al salir del bucle le pedimos que diga que el numero es el correcto
		 */
		do{
			if(guessusuario<calculodigitos(cantidadusuario, numeroaleatorio)) {
			System.out.println(masalto+"\n"+adivinar);
			guessusuario=sc.nextInt();
		}else if(guessusuario>calculodigitos(cantidadusuario, numeroaleatorio)) {
			System.out.println(masbajo+"\n"+adivinar);
			guessusuario=sc.nextInt();
		}
		}while(guessusuario!=calculodigitos(cantidadusuario, numeroaleatorio));
		System.out.println(adivinado);
		sc.close();
	}
	//iniciamos una funcion para hacer el calculo y generar el codigo de la caja secreta
	public static int calculodigitos(int digitos, int[] numeroaleatorio) {
		//Declaramos la variable vuelta para poder hacer calculos sin cambiar la variable inicial
		int vuelta=numeroaleatorio[0];
			
			//Con un bucle hacemos que cuando genere un numero aleatorio lo multiplique por 10 y lo sume al siguiente y tener el codigo entero
			for(int i=1; i<digitos; i++) {
				vuelta= (vuelta*10)+numeroaleatorio[i];
			}return vuelta;
	}
}
