package examen1.ejericicio2;

public class Mag {
	
	//Atributos
	String nom;
	TrucMagic[] trucsRealitzats;
	
	//Constructor
	Mag(String nom){
		this.nom= nom;
	}
	
	//Metodo para agregar trucos con un Array
	public void agregarTruc(int cuantitat,String nomTruc, int dificultat, double espectacularitat) {
		
		TrucMagic[] t= new TrucMagic[10];
		t[1]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[0]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[2]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[3]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[4]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[5]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[6]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[7]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[8]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[9]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		t[10]= new TrucMagic(nomTruc, dificultat, espectacularitat, 1 );
		
		
		this.trucsRealitzats= t;
	}
	
	//Metodo para mostrar la informacion del truco
	public void mostrarInformacio() {
		System.out.println();
	}
}
