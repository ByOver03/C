package examenes;
import java.util.*;
public class Especies {
public static void main(String[]args) {
	//Decladamos un Scanner para registrar las respuestas del usuario
	Scanner sc=new Scanner(System.in);
	//Declaramos los Strings para poder mostrar el texto necesario
	String explicacion="En esta aplicacion te pediremos que introduzcas un tipo de pescado, y a continuacion de daremos un poco de informacion de este";
	String introduccion="Introduce un pescado ya sea lubina, dorada o mero";
	String pescadousuario;
	String lubinaexplicacion="Es una espacie muy común en Menorca. Recomendación: Se encuentra con mayor frecuencia en aguas profundas";
	String doradaexplicacion="Es una especie muy popular entre los pescadores de la región. Recomendación: Suelen encontrarse en zonas de aguas más cálidas.";
	String meroexplicacion="Es una especie de gran tamaño que habita en las aguas de Menorca. Recomendación: Pueden encontrarse cerca de formaciones rocosas";
	
	
	//Declaramos los Strings para declarar las posibles respuestas
	String lubina="Lubina";
	String dorada="Dorada";
	String mero="Mero";
	
	//Le pedimos al usuario que introduzca un pescado y le explicacmos de que va el programa.
	System.out.println(explicacion+"\n\n"+ introduccion);
	pescadousuario=sc.nextLine();
	
	/*Con esta condicion le pedimos que si el usuario introduce lubina
	 * de qualquier forma ya que el equalsIgnore hace que se lea el nombre
	 *  le damos la informacion de este
	 */
	if(lubina.equalsIgnoreCase(pescadousuario)) {	
		System.out.println(lubinaexplicacion);
	//En caso de que introduzca dorada le mostraremos la informacion de este
	}else if(dorada.equalsIgnoreCase(pescadousuario)) {
		System.out.println(doradaexplicacion);
	//En caso de que el usuario introduzca mero le daremos la informacion de este
	}else if(mero.equalsIgnoreCase(pescadousuario)){
		System.out.println(meroexplicacion);
	}
	sc.close();
}
	


}
