package actividad1;

public class Autoescuela {
	//Objeto para poder operar y saber los resultados de los examenes
	Alumne alumne=new Alumne("Nahuel");
	
	//Metodos para saber los intentos del teorico y practico y saber si has aprovado
	public boolean examenTeorico() {
		
		alumne.setIntentosTeorico(alumne.getIntentosPractico()+1);
		double random= (int)(Math.random()*2+1);
		return (random==1)?true:false;
	}
	public boolean examenPractic() {
		double random= (int)(Math.random()*2+1);
		alumne.setIntentosPractico(alumne.getIntentosPractico()+1);
		return  (random==1)?true:false;
	}
	
	//Bucles para generar los intentos del examen
	public void buclesCarnet() {
		do {
			examenTeorico();
			examenPractic();
		}while(examenTeorico()==false&& examenPractic()==false);
		
		
	}
	
	//Metod para saber si el usuario ha obtenido el carnet o no
	public boolean donarCarnet() {
		if(examenTeorico()== true && examenPractic()== true) {
			
				
			return true;
			
		}
			return false;
		
	}
	//Metod para que nos muestra la informacion de los examenes
	public void mostrarinfo() {
		System.out.println("Este es tu numero de intentos en el examen teorico: "+alumne.getIntentosTeorico());
		System.out.println((examenTeorico()==true)?"Aprovado":"Suspendido");
		System.out.println("Este es tu numero de intentos en el examen Practico: "+alumne.getIntentosPractico());
		System.out.println((examenPractic()==true)?"Aprovado":"Suspendido");
		System.out.println((donarCarnet()==true)?"Has obtenido el carnet":"No has obtenido el carnet");
	}
}
