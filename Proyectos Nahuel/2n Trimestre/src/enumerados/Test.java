package enumerados;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        DiasSemana padel= DiasSemana.LUNES;

        System.out.println(padel);

        Scanner sc= new Scanner(System.in);


        System.out.println("Introduzca el dia de la semana que tiene padel:");
        String dia= sc.nextLine();

        System.out.println(dia);

        DiasSemana diaPadel = DiasSemana.valueOf(dia);

        System.out.println(diaPadel);

        sc.close();
    }
}
