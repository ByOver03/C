package actividad1;
import java.lang.Math;
public class Equaciones {
	
	//Inicializamos los Atributos para hacer las operaciones
	int valor1;
	int valor2;
	int valor3;
	
	
	//Declaramos el constructor para poder registrar los valores que ha introducido el usuario
	Equaciones(int x1, int x2, int x3){
		this.valor1= x1;
		this.valor2= x2;
		this.valor3= x3;
	}
	
	//Declaramos el Metodo discriminante para saber el resultado de la primera operacion para saber el numero de resultados finales
	public double discriminante(){
		
		double primerCalculo= (valor2*valor2)-(4*valor1*valor3);

		//en caso de que el calculo sea igual a 0 le pediremos que devuelva ese mismo valor
		if(primerCalculo == 0) {
			return 0;
		//En caso de que el valor sea menor a  le pedimos que devuelva -1
		}else if(primerCalculo<0){
			return -1;
		}
		//en caso de que el resultado sea positivo le pediremos que devuelva eso mismo 
		return primerCalculo;
	}
	//declaramos el segundo metodo para que este termine de hacer el calculo necesario para completar la formula
	public void calculo2() {
		
		//preguntamos si e resultado es mayor a -1, y en caso de que sea cierto haremos la s operaciones necesarias
		if(discriminante()>-1) {
		double raiz= Math.sqrt(discriminante());
		
			double resultado1= (-valor2+raiz)/2*valor1;
			double resultado2= (-valor2-raiz)/2*valor1;
			//en caso de que los dos resultados de las operaciones sean iguales le diremos que imprima como que hay un unico resultado
			if(resultado1==resultado2) {
				System.out.println("Este es el resultado de la equacion: " + resultado1);
			//en caso contrario le pediremos que imprima los dos resultados
			}else {
				String salida= "Este es el primer resultado: "+resultado1+ "\n"+"Este es el segundo resultado: "+ resultado2;
				System.out.println(salida);
			}
		//en caso de que el resultado sea inferior al anteriormente introducido le diremos al usuario que es imposible calcular su operacion
		}else {
			System.out.println("Lo siento la equacion no tiene solucion con los valores que has introducido");
		}
		
		
		
	}
}