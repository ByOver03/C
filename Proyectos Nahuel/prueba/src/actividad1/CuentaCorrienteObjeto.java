package actividad1;

public class CuentaCorrienteObjeto {
	
	//Declaramos los Atributos que nos piden en el ejercicio
	String dni;
	String nombre;
	double saldo;
	
	//Creamos un constructor para ponerle valores en la clase main
	CuentaCorrienteObjeto(String dni, String nombre){
		this.dni= dni;
		this.nombre= nombre;
		this.saldo= 0;
	}
	//Creamos un Metodo para hacer la operacion de sacar dinero
	public void sacarDinero(double dinero) {
		System.out.println("La operacion ha sido adecuada");
		this.saldo -=dinero;
		if(this.saldo<0){
			System.out.println("No hay suficiente saldo");
			this.saldo+=dinero;
		}
	}
	//Creamos un metodo para hacer la operacion de ingresar dinero
	public void ingresarDinero(double ingreso) {
		System.out.println("Has ingresado dinero en la cuenta");
		this.saldo+= ingreso;
	}
	//Creamos un metodo para mostrar el estado de la cuenta corriente
	public void mostrarInformacion() {
		System.out.println("");
		System.out.println("Este es el estado acutal de la cuenta");
		System.out.println("Saldo actual: "+ saldo);
		System.out.println("Nombre: "+ nombre);
		System.out.println("DNI: "+ dni);
	}
}
