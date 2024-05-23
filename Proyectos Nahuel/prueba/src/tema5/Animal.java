package tema5;

public class Animal {
	
	String especie;
	int patas;
	boolean mamifero;
	
	Animal(String especie, int patas, boolean mamifero){
		this.especie= especie;
		this.patas= patas;
		this.mamifero= mamifero;
	}
	Animal(String especie, int patas){
		this.especie= especie;
		this.patas=patas;
		this.mamifero=true;
	}
	Animal(boolean mamifero){
		this("humano",2,mamifero);
	}
	void muestraInfo() {
		System.out.println("Especie: "+ this.especie);
		System.out.println("Patas: "+ this.patas);
		System.out.println("Mamifero: "+ this.mamifero);
	}
}
