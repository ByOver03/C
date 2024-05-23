package tema5;

public class test {
	
	public static void main(String[]args) {
		
		Persona p= new Persona("Mario", 42, 2.00);
		@SuppressWarnings("unused")
		Persona q= new Persona();
		Persona r= new Persona("Nahuel");
		Persona s= new Persona(20);
		Persona t= new Persona(1.94);
//		p.nombre = "Nahuel";
//		p.altura= 2.72;
//		p.edad= 20;
		
		System.out.println("Nombre: "+ p.nombre);
		System.out.println("Altura: "+ p.altura);
		System.out.println("Edad: "+ p.edad);
		
		p.saludar();
		p.caminar();
		p.cumple();
		System.out.println("Edad: "+ p.edad);
		System.out.println("Nombre r: "+ r.nombre);
		System.out.println("Edad s: "+ s.edad);
		System.out.println("Altura t: "+ t.altura);
		}
	}


