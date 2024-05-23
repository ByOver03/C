package ejerciciosprevios;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// iniciamos un Scanner para saber la respuesta del usuario
		
		Scanner sc= new Scanner(System.in);
		
		//Introducimos las diferentes variables como String para preguntarle al usuario
		String euros= "Dime cuanto dinero quieres convertir a euros";
		String pregunta="Quieres convertir a dolares o a libras?";
		/*Introducimos estas variables para decirle que introduzca a o b en mayusculas para hacerle la conversión 
		 * y en caso de que no ponga ninguna de las opciones el programa le ponga que ha fallado
		 */
		String opciones="Si deseas convertirlo a dolares introduce 'A' \nSi quieres convertirlo a libras introduce 'B'";
		String error="Lo siento esta respuesta no es valida, vuelve a intentar introducir un valor adecuado ";
		//introducimos cambioa y cambio b para determinar las respuestas
		String cambioa="A";
		String cambiob="B";
		//Introducimos las variables char para cambiar los strings a char y poder ejecutar bien el programa
		char A= cambioa.charAt(0);
		char B= cambiob.charAt(0);
		//le pedimos al usuario que introduzca la cantidad que quiere cambiar
		System.out.println(euros);
		double euro=sc.nextInt();
		//le pedimos al usuario a que moneda lo quiere cambiar
		System.out.println(pregunta+"\n"+opciones);
		String cambio=sc.next();
		char C= cambio.charAt(0);
		//introducimos los double para hacer la operacion posteriormente
		double dolares= 1.18;
		double libras= 0.9;
		/*Hacemos un ternario para que dependiendo de la respuesta del usuario nos de un resultado o otro 
		 * o nos de error 
		 * y le imprimimos el resultado
		 */
		String aob=(C==A)?dolares*euro + " dolares":(C==B)?libras*euro + " libras":error;
		System.out.println(aob);
		sc.close();

	}

}
