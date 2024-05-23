package ejerciciosprevios;
import java.util.Scanner;
public class BinarioConFunciones {

	public static void main(String[] args) {
		//Iniciamos el Scanner para saber el numero del usuario
		Scanner sc= new Scanner(System.in);
		//Iniciamos el int para saber el numero del usuario
		int numerousuario;
		//Declaramos los siguientes Strings para mostrarle el texto necesario al usuario
		@SuppressWarnings("unused")
		String inicio="Bienvenido, introduce un numero para pasarlo a binario";
		String error="Lo siento has introducido un valor inadecuado";
		String numerin="Aqui tienes tu numero en binario: ";
		numerousuario=sc.nextInt();
		
		/*Le pedimos a la aplicacion si es positivo el numero
		 * En caso de que sea negativo le mostramos el mensaje de error
		 * Pero en caso de que sea positivo le pedimos que nos muestre el binario mediante la formula que hemos utilizado en la funcion de despues
		 */
		if(numerousuario<0) {
			
		System.out.println(error);
		
		}else {
		
		System.out.println(numerin);
		System.out.println(converisionbinario(numerousuario));
		
		}
		sc.close();
	}
	//Creamos la funcion conversion binario para poder hacer la conversion a parte
	public static int converisionbinario(int binario){
		/*Le pedimos a la aplicacion si el numero es igual a 0
		 * en caso de que lo sea le decimos que la salida sea 0
		 * en caso de que no lo sea mediante una formula con el residuo le pedimos que nos muestre el binario
		 */
		if (binario==0) {
			return 0;
		}else {
			int resultado;
			int resultado2;
			
			resultado= binario%2;
			resultado2= converisionbinario(binario/2)*10 +resultado;
			return resultado2;
		}
		
	}
}
