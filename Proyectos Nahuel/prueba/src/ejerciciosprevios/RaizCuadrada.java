package ejerciciosprevios;
import java.util.*;
public class RaizCuadrada {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String explicacion;
		String bienvenida;
		String salida;
		String error;
		int numerousuario;
		
		
		explicacion="Aqui te mostraremos la raiz cuadrada de un numero que tu quieras introducir. \nEn caso de que el numero que hayas introducido no sea entero te mostraremos lo que le falta para que pueda hacerse la raiz cuadrada.";
		bienvenida="Introduce un numero para hacerle la raiz cuadrada";
		
		salida="La raiz cuadrada es: ";
		System.out.println(explicacion+ "\n"+"\n"+ bienvenida);
		numerousuario=sc.nextInt();
		sc.close();
		
		if(calculoraizentero(numerousuario)<0) {
			error="Lo siento pero el valor que has introducido no es correcto";
			System.out.println(error);
	
		}else if(calculoraizentero(numerousuario)== numerousuario) {
			salida= "Resultado " + (int)Math.pow(calculoraizentero(numerousuario),0.5)+ salida+numerousuario;	
			System.out.println(salida);
		}else {
			salida="Resultado "+(int)Math.pow(calculoraizentero(numerousuario),0.5)+ salida + numerousuario + 
					"(" + numerousuario + " - " + calculoraizentero(numerousuario) + " = " + (numerousuario - calculoraizentero(numerousuario)) + ")";
			System.out.println(salida);
		}
	}
	public static int calculoraizentero(int raiz){
		int n=1;
		int m;
		
		if(raiz<=0) {
			
			return -1;

		}else {
			
			do{
				m=(int)Math.pow(n, 2);
				n +=1;
			}while(m<raiz);
			if(m==raiz) {
				return m;
			}else {
				return calculoraizentero(raiz-1);
			}
		}
		
	}
}
