package ejerciciosprevios;
import java.util.Scanner;
public class Binarioaentero {
	public static void main(String[]args) {
	//Iniciamos el Scanner para poder registrar las respuestas del usuario
		Scanner sc=new Scanner(System.in);
		//Iniciamos el String bienvenida para darle un mensaje de bienvenida al usuario
	String bienvenida="Bienvenido, ingresa un numero binario para convertirlo a decimal.";
	System.out.println(bienvenida);
	//Declaramos el String para saber que numero quiere introducir el usuario
	String numerousuario=sc.nextLine();
	//le decimos al usuario cual es el numero  decimal que ha ingresado como binario
	String resultado="Aqui tienes tu numero convertido a decimal: ";
	int salida= conversionbinario(numerousuario);
	System.out.println(resultado+ salida);
	sc.close();
}
	/*Creamos una nueva funcion para convertir el numero binario a decimal
	 *Iniciamos la variable entre parentesis como String para poder pasarlo a char sin que genere ningun problema
	 */
	public static int conversionbinario(String entero){
		
		//Declaramos el int para saber cuantos digitos tiene el numero binario y hacer la formula correspondiente
		int longitud=entero.length();
		//Declaramos la variable resultado para posteriormente hacer el calculo que nos dira el numero decimal.
		int resultado=0;
		//Declaramos las siguientes variables para hacer posteriormente el calculo con un bucle
		char numerobinario;
		int i;
		int digitoentero;
		
		//Hacemos un for para hacer el bucle y hacer la formula necesaria para convertirlo a decimal
		for(i=0; i<longitud;i++) {
			
			//convertimos el String a char para elevar el numero segun la posicion en la que este
			numerobinario=entero.charAt(longitud-1-i);
			//Convierte el carácter a un número entero restando el valor del carácter '0'
			digitoentero=numerobinario-'0';
			// Suma el valor del dígito multiplicado por 2 elevado a la posición
			resultado+=digitoentero*Math.pow(2,i);
			}
			
		//Creamos una salida que nos muestre el resultado final.		
		return resultado;
	}
}
