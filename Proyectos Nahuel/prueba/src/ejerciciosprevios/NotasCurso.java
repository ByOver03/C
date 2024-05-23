package ejerciciosprevios;
	import java.util.Scanner;
public class NotasCurso {

	public static void main(String[] args) {
		
		//introducimos el scaner
		Scanner sc= new Scanner (System.in);
		
		//Le pedimos al usuario que inserte un valor con notaPrimerT 
		System.out.println("Dime tu nota del primer trimestre");
		int notaPrimerT= sc.nextInt();
		//Le pedimos al usuario que inserte un valor con notaSegunT
		System.out.println("Dime tu nota del segundo trimestre");
		int notaSegunT= sc.nextInt();
		//Le pedimos al usuario que inserte un valor con notaTercerT
		System.out.println("Dime tu nota del tercer trimestre");
		int notaTercerT= sc.nextInt();
		
		//introducimos la variable notaMedia que nos de la media de los tres trimestres con decimales y entera
		double notaMedia=((double)notaTercerT+notaSegunT+notaPrimerT)/3;
		int notaMedia1=(notaTercerT+notaSegunT+notaPrimerT)/3;
		//Le damos al usuario el resultado de la media de su nota
		System.out.println("Aqui tienes tu nota media del curso: " + notaMedia);
		System.out.println("Aqui tienes tu nota media redondeada: "+ notaMedia1);
		sc.close();
	}

}
