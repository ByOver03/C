package actividad1;

public class CuentaCorrienteII {
	//Declaramos los Atributos que nos piden en el ejercicio
		String dni;
		String nombre;
		double saldo;
		
		//Creamos un constructor para ponerle valores en la clase main
		CuentaCorrienteII(String dni, String nombre, double saldo){
			this.dni= dni;
			this.nombre= nombre;
			this.saldo= saldo;
		}
		CuentaCorrienteII(String dni, double saldo){
			this(dni, "Yoshwa", saldo);
		}
		public void sacarDinero(double dinero) {
			System.out.println("La operacion ha sido adecuada");
			this.saldo -=dinero;
			if(this.saldo<0){
				System.out.println("No hay suficiente saldo");
				this.saldo+=dinero;
	}
}

		public void ingresarDinero(double ingreso) {
			System.out.println("Has ingresado dinero en la cuenta");
			this.saldo+= ingreso;
}

		public void mostrarInformacion() {
			System.out.println("");
			System.out.println("Este es el estado acutal de la cuenta");
			System.out.println("Saldo actual: "+ saldo);
			System.out.println("Nombre: "+ nombre);
			System.out.println("DNI: "+ dni);
}
}
