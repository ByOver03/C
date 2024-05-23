package herencia1;

public class Empleado extends Persona{
	
	
	double salario;
	boolean empleadodelmes;
	Empleado(){
		
	}
	public Empleado(String nombre, int edad, double estatura, double peso, double salario, boolean empleadodelmes){
		super(nombre, edad, estatura, peso);
		this.salario= salario;
		this.empleadodelmes=empleadodelmes;
	}
	@Override
	void mostrarinformacion() {
		super.mostrarinformacion();
		System.out.println(salario);
		System.out.println(empleadodelmes);
	}
	@Override
	public boolean equals(Object o){
		Empleado e = (Empleado)o;
		
		 if(this.getNombre(). equals(e.getNombre())&& this.edad == e.edad){
			return true;
		 }
		 return false;
	}
	@Override
	public String toString(){
		return super.toString()+ "\nSueldo Empleado:"+ salario;
	}
}
