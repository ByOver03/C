package actividad1;

public class Alumne {
	
	//Atributos
	private String nombre;
	private int intentosTeorico;
	private int intentosPractico;
	private boolean teorico;
	private boolean practico;
	private boolean carnet;

	
	//Constructor
	Alumne(String nombre){
		this.nombre= nombre;
	}
	//getters
	public String getNombre() {
		return nombre;
	}

	public int getIntentosTeorico() {
		return intentosTeorico;
	}	

	public int getIntentosPractico() {
		return intentosPractico;
	}
	
	public boolean getTeorico() {
		return teorico;
	}
	
	public boolean getPractico() {
		return practico;
	}
	
	public boolean getCarnet() {
		return carnet;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setIntentosTeorico(int intentosTeorico) {
		this.intentosTeorico = intentosTeorico;
	}
	
	public void setIntentosPractico(int intentosPractico) {
		this.intentosPractico = intentosPractico;
	}
	
	public void setTeorico(boolean teorico) {
		this.teorico = teorico;
	}
	
	public void setPractico(boolean practico) {
		this.practico = practico;
	}
	
	public void setCarnet(boolean carnet) {
		this.carnet = carnet;
	}
}
