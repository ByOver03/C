package ejerciciosprevios;
import java.util.Scanner;
public class Binario {

	public static void main(String[] args) {
		//Iniciamos el Scanner para saber la respuesta del usuario 
		Scanner sc= new Scanner(System.in);
		//Le damos un mensaje de bienvenida al usuario
		 String inicio="Bienvenido, introduce un numero para pasarlo a binario";
		 System.out.println(inicio);
		 //Le decimos al usuario que el numero que ha dicho es incorrecto o le decimos el numero
		 String error="Lo siento has introducido un valor inadecuado";
		 
		 //El usuario introduce su numero
		 int numerousuario=sc.nextInt();
		 //Declaramos los siguientes int para hacer posteriores calculos
		 int numerobinario;
		 int i;
		 //Declaramos el String para determinar la salida en binario
		 String salida="";
		 numerobinario=numerousuario;
		 //Vemos si el numero es positivo o negativo
		 sc.close();
		 if(numerousuario>0) {
			 //Hacemos el bucle necesario para que salga el binario
			 	for(i= numerobinario; i !=0; i=i/2){
			 		if(i%2 == 0) {
			 			salida= "0"+salida;
			 		}else {
			 			salida="1"+salida;
			 		}
			 		numerobinario= numerobinario/2;
			 		System.out.println(salida+"^2");
			 	}
		//En caso de que este no sea positivo le damos un mensaje de error
		 }else {
			 System.out.println(error);
		 }
		 //Cerramos el Scanner
		 

	}

}
