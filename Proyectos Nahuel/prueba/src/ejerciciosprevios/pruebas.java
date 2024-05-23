package ejerciciosprevios;
import java.util.*;
public class pruebas {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que introduzca el primer número
    System.out.print("Introduce el primer número: ");
    double base = scanner.nextDouble();

    // Solicitar al usuario que introduzca el segundo número (exponente)
    System.out.print("Introduce el segundo número (exponente): ");
    int exponente = scanner.nextInt();

    // Calcular la elevación a la potencia y mostrar el resultado
    double resultado = calcularPotencia(base, exponente);
    System.out.println("El resultado de " + base + " elevado a la potencia " + exponente + " es: " + resultado);

    // Cerrar el scanner
    scanner.close();
}

// Función pública para calcular la elevación a la potencia sin Math.pow
public static double calcularPotencia(double base, int exponente) {
    double resultado = 1;

    for (int i = 0; i < exponente; i++) {
        resultado *= base;
    }

    return resultado;
}
}