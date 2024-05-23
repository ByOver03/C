package examen1.ejercicio1;

public class Actuacio {

	//Atributos
	String nom;
	String artista;
	double durada;
	
	//Constructores
	Actuacio(String nom, String artista){
		this.nom=nom;
		this.artista=artista;
		this.durada=60;
	}
	Actuacio(String nom, double durada, String artista){
		this.nom=nom;
		this.artista= artista;
		this.durada=durada;
	}
	Actuacio(double durada){
		this("Presentació", durada, "Presentador");
	}
	//Metodo
	public void mostrarinformacio() {
		//Enseñamos la informacion al usuario
		System.out.println("Actuacion: "+ nom+ " Artista: " + artista + " Durada: "+ durada+ " minutos");
		
	}
}
