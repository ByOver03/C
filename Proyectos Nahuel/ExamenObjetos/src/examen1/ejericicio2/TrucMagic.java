package examen1.ejericicio2;

public class TrucMagic {
	
	//Atributos
	private String nom;
	int dificultat;
	double espectacularitat;
	int comptadorTrucs;
	//Constructor
	TrucMagic(String nom, int dificultat, double espectacularitat, int comptadorTrucs){
		this.nom= nom;
		this.dificultat= dificultat;
		this.espectacularitat= espectacularitat;
		this.comptadorTrucs= comptadorTrucs;
	}
	//getters y setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Metodo para mostrar el impacto del truco
	public double impacteTruc(int dificultat, double espectacularitat) {
		
		this.dificultat=dificultat;
		this.espectacularitat=espectacularitat;
		
		double espectacularitatTruc= dificultat*espectacularitat;
		return espectacularitatTruc;
	}
	
}
