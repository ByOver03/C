package examen1.ejericicio2;
import java.util.*;
public class TestEspectacleMagic {
	public static void main(String[]args) {
		
		//Declaramos las variables que pediran los valores de cada variable
		String introduccioNomTruc="Quin nom tindra el truc?";
		String introduccioDificultatTruc="Quina dificultat tindra el truc en nombres enters?";
		String introduccioEspectacularitatTruc="Quina espectacularitat tindra el truc?";
		String introduccioComptadorTrucs="Cuants de trucs fara el mag?";
		String introduccioNomMag="Quin Nom tindra el mag?";
		
		//Declaramos El Scanner para registrar las respuestas del usuario
		Scanner sc= new Scanner(System.in);
		
		//Le pedimos al usuario la informacion de los trucos de magia y los magos
		System.out.println(introduccioNomTruc);
		String nomtruc=sc.nextLine();
		System.out.println(introduccioDificultatTruc);
		int dificultattruc=sc.nextInt();
		System.out.println(introduccioEspectacularitatTruc);
		double espectacularitattruc=sc.nextDouble();
		System.out.println(introduccioComptadorTrucs);
		int comptadortrucs=sc.nextInt();
		System.out.println(introduccioNomMag);
		String nomMag= sc.next();
		
		//Declaramos el objeto para registrar la informacion del truco establecido por el mago
		@SuppressWarnings("unused")
		TrucMagic t= new TrucMagic(nomtruc, dificultattruc, espectacularitattruc, comptadortrucs);
		
		//Declaramos el objeto Mag
		Mag m= new Mag(nomMag);
		
		//Declaramos el metodo agregar truco
		m.agregarTruc(comptadortrucs, nomtruc, dificultattruc, espectacularitattruc);
		
		//Cerramos el Scanner
		sc.close();
	}
}
