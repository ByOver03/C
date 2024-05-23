package examenes;
import java.util.*;
public class Temperatura {
public static void main(String[]args) {
	
	//Iniciamos un Scaner para registrar las respuestas del usuario
	Scanner sc=new Scanner(System.in);
	
	//Declaramos las siguientes variables para poder ejecutar el programa debidamente
	String explicacion="En este programa te pediremos que indiques la temperatura del agua en grados celcius\na continuacion te diremos si es excelente adecuada o muy fria para la pesca";
	String pedirnumero="Introduce la temperatura del agua:";
	int numerousuario;
	String salida;
	
	//A continuacion con las vaiables anteriores le explicamos de que va la aplicacion al usuario y le pedimos que introduzca una temperatura
	System.out.println(explicacion+"\n\n"+pedirnumero);
	numerousuario=sc.nextInt();
	
	//Con un if le pedimos si la temperatura es mayor a 25(incluyendo el 25) grados le diremos que la temperatura es excelente
	if(numerousuario>=25) {
		salida="La temperatura es ecelente para la pesca";
		System.out.println(salida);
	//Si la temperatura se encuentra entre 25 y 18 (incluyendo el 18)le diremos que la temperatura es adecuada 
	}else if(numerousuario<25 && numerousuario>=18){
		salida="La temperatura es adecuada para la pesca";
		System.out.println(salida);
	//En caso de que la temperatura sea menor a 18 le diremos que la temperatura es demasiado baja.
	}else if (numerousuario<18){
		salida="La temperatura es demasiado baja para la pesca";
		System.out.println(salida);
		
	}
	sc.close();
}
}
