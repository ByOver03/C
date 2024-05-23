package tema5;

public class TestCoche {
	public static void main(String[]args) {
		
		Coche c= new Coche();
		
		c.caballos= 1500;
		c.marca="Toyota";
		c.modelo="Celica";
		
		System.out.println("Marca: "+ c.marca);
		System.out.println("Modelo: "+ c.modelo);
		System.out.println("Caballos: "+ c.caballos);
		
		c.acelera();
		c.frena();
		c.gira();
	}
}
