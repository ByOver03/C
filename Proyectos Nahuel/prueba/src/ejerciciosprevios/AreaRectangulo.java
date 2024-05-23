package ejerciciosprevios;
	import java.util.Scanner;
public class AreaRectangulo {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduceme la medida de un lado de tu parcela:");
		
		double ladoA= sc.nextDouble();
		double ladoB= sc.nextDouble();
		
		double area= (ladoB *ladoA);
		
		System.out.println(area);
		sc.close();
	}	
}
