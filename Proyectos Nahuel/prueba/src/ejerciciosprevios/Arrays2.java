package ejerciciosprevios;
import java.util.*;
public class Arrays2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String[] nombres;
		String explicacion="";
		String bienvenida="";
		String pregunta="?";
		System.out.println(explicacion+"\n\n"+bienvenida);
		System.out.println(pregunta);
		
		int numeropersonajes=sc.nextInt();
		sc.nextLine();
		
		nombres= new String[numeropersonajes];
		
		for(int i=0; i<nombres.length;i++) {
			System.out.println("Ingrese un nuevo personaje");
			nombres[i]=sc.nextLine();
		}
		personajesusuario(nombres);
		for(String nombre:nombres) {
			System.out.println(nombre);
		}
		sc.close();
	}
		
public static void personajesusuario(String[] nombresaux) {
	
	String temporal;
	for(int i =0; i<nombresaux.length-1;i++) {
		for(int j=0; j<nombresaux.length -i -1;j++) {
			if(nombresaux[j].length()> nombresaux[j+1].length()) {
				temporal=nombresaux[j];
				nombresaux[j] = nombresaux[j+1];
				nombresaux[j+1]= temporal;
			}
		}
	}
}
}
