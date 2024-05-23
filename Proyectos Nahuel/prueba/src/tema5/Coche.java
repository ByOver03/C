package tema5;

public class Coche {
	
	String modelo;
	int caballos;
	String marca;
	
	public void acelera(){
		System.out.println("brrum, brrum");
	}
	public void frena() {
		System.out.println("\nPero que haces?! ACELERA!!!");
		acelera();
	}
	public void gira() {
		System.out.println("\nDRIFT *Deja marcas de ruedas emn el suelo*");
	}
}
