package herencia1;

public class Test {

	public static void main(String[] args) {
//		Empleado e= new Empleado("Nahuel", 20, 170.5, 55, 5000.05, true);
//		Persona p = e;
//		p.mostrarinformacion();
//		e.mostrarinformacion();
		Empleado e1 = new Empleado("Nahuel", 18,12.2, 155.1, 5000.5, true);
		Empleado e2 = new Empleado("Nahuel", 18, 12.2 , 155.1, 5000.5, false);
		
		System.out.println(e1.toString());
		// System.out.println(e2.toString());

		// System.out.println(e1==e2);

		System.out.println(e1.equals(e2));
		// System.out.println(3.5*2.5==(8.0 + 0.75));
	}

}
