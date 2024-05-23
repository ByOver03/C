package ejerciciosprevios;

public class GothamCity {
	public static void main(String[] args) {
	boolean esCapital; 
	//introduzco la variable esCapital como boolean
	int nombreDeCiutadans=100000; 
	//introduzco la variable nombreDeCiutadans como int y le doy el valor 230458
	double impostPerCiutada=3600; 
	//introduzco la variable impostPerCiutada como double 
	
	double impostAnual=impostPerCiutada*nombreDeCiutadans*12;
	//introduzco la variable impostAnual como doubley hago que haga un calculo para obtener el impuesto anual total suponiendo que el impostPeriutada es mensual
	esCapital = (nombreDeCiutadans>=100000);
	//hago que la variable "esCapital" sea verdadera si la variable nombreDeCiutadans tiene valor indicado
	boolean esMetropoli =((nombreDeCiutadans>=200000)&&(impostAnual>=720000000))||(esCapital);
	//Añado una nueva variable como boolean y le pongo el nombre de esMetropoli
	//Hago que la variable de true en caso de que se cumplan las opciones que le doy sean verdaderas
	
	System.out.println("¿Es una metropolis?: "+esMetropoli);
	//imprimo la variable para saber si estas opciones se cumplen
	}
}
