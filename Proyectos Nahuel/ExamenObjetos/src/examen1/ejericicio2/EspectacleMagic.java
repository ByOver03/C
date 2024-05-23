package examen1.ejericicio2;

public class EspectacleMagic {
	
	//Atributos
	String nom;
	Mag[] magsParticipants;
	
	//Constructores
	EspectacleMagic( String nom){
		this.nom= nom;
	}
	
	//Metodo para agregar magos
	public void agregarMags(int cuantitatMags) {
		Mag[] m= new Mag[cuantitatMags];
		this.magsParticipants= m;
	}
	
	//Metodo para mostrar la informacion del espectaculo
	public void mostrarInformacio() {
		Mag m= new Mag(nom);
		System.out.println("Espectacle Màgic: "+ nom);
		System.out.println("Mags Participants:");
		m.mostrarInformacio();
	}
}
