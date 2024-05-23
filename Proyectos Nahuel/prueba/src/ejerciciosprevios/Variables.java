package ejerciciosprevios;

import java.util.Scanner;

public class Variables {
	

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
			//Declaramos e iniciamos una entrada de datos
			Scanner sc= new Scanner (System.in);
			
			//nombre nos permite almacenar el dato introducido
			String nombre;
			String nombre_;
			//Detenemos la ejecucion del programa a la espera de la repeticion del dato numérico
			System.out.println("¿Cual es tu nombre?");
			nombre = sc.nextLine();
			//Mostramos el resultado
			System.out.println("¿Estas seguro de que " + nombre + " es tu nombre?");
			nombre_ = sc.nextLine();
			
			String respuesta= "no";			
			String respuesta2= "No";	
			
			
			
			System.out.println("Perfecto " + nombre + ", hoy te chupo el pito");
			sc.close();
	}

}
