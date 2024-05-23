package actividad1;
import java.util.*;
public class Test {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		//Explicacion del programa
		String explicacion="En esta aplicacion te pedimos el nombre de un usuario para saber el numero de intentos que ha hecho en el examen teorico y practico de conducir y si ha aprovado o suspendido y si ha obtenido el carnet";
		String introduceNombre="Introduce ele nombre del usuario";
		
		//Le pedimos al usuario que nos introduzca un nombre
		System.out.println(explicacion+"\n"+introduceNombre);
		String nombre=sc.nextLine();
		
		//Objetos
		Alumne a= new Alumne(nombre);
		Autoescuela b= new Autoescuela();
		System.out.println(a.getNombre());
		
		//Metodos para saber si el usuario ha suspendido o ha aprovado
		b.examenPractic();
		b.examenTeorico();
		b.buclesCarnet();
		b.donarCarnet();
		b.mostrarinfo();
		sc.close();
		
	
	
	}
		
}
