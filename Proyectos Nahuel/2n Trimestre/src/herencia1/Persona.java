package herencia1;

public class Persona {
	//Atributos
	private String nombre;
	protected int edad;
	public double estatura;
	double peso;
	
	Persona(){
		
	}
	Persona(String nombre, int edad, double estatura, double peso){
		this.nombre=nombre;
		this.edad=edad;
		this.estatura=estatura;
		this.peso=peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	void mostrarinformacion() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(estatura);
		System.out.println(peso);
	}
	@Override
	public String toString(){
		return "Nombre: "+  nombre + "\nEdad: " + edad;
	}
	
}

