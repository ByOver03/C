package ejerciciosprevios;
	import java.util.Scanner;
public class TemperaturaYDistancia {
	public static void main (String[] args) {
		
		//Declaramos e iniciamos una entrada de datos
		Scanner sc= new Scanner (System.in);
		//este syso nos pide que introduzcamos un dato
		System.out.println("introdueix una temperatura farenhite per pasar-la a celcius");
		
		//gradosFarenhite nos permite introducir un dato en la consola
		double gradosFarenhite= sc.nextDouble();
		//introducimos la variable gradosCelcius como double y hacemos que con una simple formula haga la conversión
		double gradosCelcius= ((gradosFarenhite-32)*5)/9;
		//hacemos un syso para obtener el resultado de la operacion anterior
		System.out.println(gradosCelcius + "ºC");
		
		//este syso nos pide que introduzcamos un dato
		System.out.println("introdueix una medida per passarla a centimetres y metros");
		//metros nos permite introducir un dato en la consola
		double metros;
		metros= sc.nextDouble() ;
		//introducimos la variable centimetros y hacemos que con una simple formula haga la conversion
		double centimetros= metros*100;
		//introducimos la variable kilometros y hacemos que con una simple formula haga la conversion
		double kilometros= metros/1000;
		//hacemos un syso para obtener el resultado
		System.out.println(centimetros + "cm");
		//hacemos un syso para obtener el resultado
		System.out.println(kilometros + "km");
		sc.close();
	}
}
