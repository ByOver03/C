package tema5;

public class Persona {
	
	//Atributos (o propiedades)
	String nombre;
	int edad;
	double altura;
	
	//Constructores
	Persona(){
		
	}
	Persona(String nombre){
		this.nombre=nombre;
	}
	Persona(int edad){
		this.edad= edad;
	}
	Persona(double altura){
		this.altura= altura;
	}
	
	Persona(String nombre, int edad, double altura){
		this.nombre= nombre;
		this.edad= edad;
		this.altura= altura;
	}
	
	
	//Metodos
	public void saludar() {
		System.out.println("Hola!! :)");
	}
	public void caminar() {
		System.out.println("Estoy caminando");
	}
	
	public void cumple() {
		edad ++;
	}
	
}
