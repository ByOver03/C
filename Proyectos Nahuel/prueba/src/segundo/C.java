package segundo;

class C {

	int numeroC;
	//El private sirve para que solo se vea en la misma clase
	//Es decir que las clases vecinas o externas, por mucho que se llamen no podran ver el atributo
	private String nombre;
	
	C(int numeroC, String nombre){
		this.numeroC= numeroC;
		this.nombre= nombre;
	}
	
	void info() {
		System.out.println("NumeroC: "+numeroC);
		System.out.println("Nombre: "+nombre);
	}
}
