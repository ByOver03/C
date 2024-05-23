package stream;

import java.time.*;

public class Cliente implements Comparable<Cliente> {
	
	String nombre;
	final String DNI;
	final int anyoNacimiento;
	
	public Cliente(String nombre, String DNI, int anyoNacimiento) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.anyoNacimiento = anyoNacimiento;
		
	}
	
	public int edad() {
		return LocalDateTime.now().getYear()-anyoNacimiento;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+" - DNI: "+DNI+" - Edad: "+edad();
	}

	@Override
	public int compareTo(Cliente o) {
		return this.DNI.compareTo(o.DNI);
	}
}
