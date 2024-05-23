package ejerciciosprevios;
import java.util.*;
public class Elevado {
	public static void main(String[]args) {
	
		// iniciamos un Scanner para registrar las respuestas del usuario
		Scanner sc=new Scanner(System.in);
	//Declaramos los siguientes Strings para decirle los mensajes necesarios al usuario	
	String explicacion="Bienvenido, en esta aplicacion te pediremos que introduzcas un numero y que lo eleves a un numero que tu quieras \ny despues te haremos la operacion de dos maneras diferentes.";
	String introduccionnumero="Introduce el primer numero:";
	String introduccionelevacion="Elevalo a otro numero entero:";
	//Le introducimos al usuario la aplicacon y le pedimos que introduzca un numero
	System.out.println(explicacion+"\n\n"+ introduccionnumero);
	double numerousuario=sc.nextInt();
	//Posteriormente le pedimos que introduca otro numero para elevar el anterior
	System.out.println(introduccionelevacion);
	int elevacionusuario=sc.nextInt();
	//Despues de esto le damos el resultado con dos tipos de operaciones diferentes
	System.out.println("Aqui tienes el resultado hecho con una funcion recursiva: "+calculorecursivo(numerousuario,elevacionusuario));
	System.out.println("Aqui tienes el resultaso hecho con una funcion no recursiva: "+ calculonorecursivo(numerousuario,elevacionusuario));
	sc.close();
}
	
	//Declaramos el primer tipo de funcion que seria recursivo
	public static double calculorecursivo(double numero1, int numeroelevado) {
		//le pedimos que si el numero al que hay que elevarlo le devolvemos 1
		if(numeroelevado==0) {
			return 1;
		//en cualquier otro caso le decimos que multiplique el numero introducido por si mismo las veces que ha introducido el usuario
		}else {
			return numero1*calculorecursivo( numero1, numeroelevado-1);	
		}
		
	}
	//Despues hacemos una funcion no recursiva para hacer el calculo
	public static double calculonorecursivo(double base, int elevacion) {
		//Introducimos las variables para hacer el calculo posteriormente
		int resultado=1;
		int i=0;
		/*le pedimos que multiplique el resultado y sume 1 a i
		 * mientras i sea diferente a el numero elevado introducido por el usuario
		 */
		do {
			resultado *=base;
			 i ++;
		}while(i!=elevacion);
		return resultado;
	}
}
