package examen1.ejercicio1
;

import java.util.Scanner;

public class TestActuacio {
	public static void main(String[]args) {
		
		//Declaramos la explicacion para darle informacion al usuario sobre la explicacion
		String explicacion="En esta aplicacion te pediremos los nombres de diferentes actuaciones, la duracion de estas y los nombres de los artistas para enseñarte posteriormente la informacion de todos";
		System.out.println(explicacion);
		
		//Declaramos las variables para introducir los valores necesarios
		String introduccioActuacio1="Introduzca el nombre de la primera actuación";
		String introduccioActuacio2="Introduzca el nombre de la segunda actuacion";
		String introduccioArtista1="Introduzca el nombre del primer artista";
		String introduccioArtista2="Introduzca el nombre del segundo artista";
		String introduccioDurada1="Introduzca la duracion del segundo espectaculo";
		String introduccioDurada2="Introduzca la duracion del tercer espectaculo";
		
		//Declaramos el Scanner para establecer los nombres del usuario
		Scanner sc= new Scanner(System.in);
		
		//Declaramos los nombres de las actuaciones
		System.out.println(introduccioActuacio1);
		String primeraActuacio= sc.nextLine();
		System.out.println(introduccioActuacio2);
		String segonaActuacio= sc.nextLine();
		//Declaramos los nombres de los artistas
		System.out.println(introduccioArtista1);
		String primerArtista= sc.nextLine();
		System.out.println(introduccioArtista2);
		String SegonArtista= sc.nextLine();
		
		//Declaramos la duracion de las actuaciones
		System.out.println(introduccioDurada1);
		double durada1= sc.nextDouble();
		System.out.println(introduccioDurada2);
		double durada2= sc.nextDouble();
		
		//Declaramos los objetos de las tres actuaciones
		Actuacio a= new Actuacio(primeraActuacio, primerArtista);
		Actuacio b= new Actuacio(segonaActuacio,durada1, SegonArtista );
		Actuacio c= new Actuacio(durada2);
		
		//Mostramos la informacion de las tres actuaciones
		a.mostrarinformacio();
		b.mostrarinformacio();
		c.mostrarinformacio();
		
		//Cerramos el Scanner
		sc.close();
	}

}
