package futbolista;
import java.util.Arrays;
public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //Array de futbolistas
        Futbolista f1= new Futbolista("41513352p","Nahuel",20,1);
        Futbolista f2= new Futbolista("41513353q","Iker",18,1);
        Futbolista f3= new Futbolista("41513354r","Robo",17,1);
        Futbolista f4= new Futbolista("41513355s","Yoshwa",16,1);
        Futbolista f5= new Futbolista("41513356t","Ametller",18,1);

        Futbolista[] fArray= {f1,f2,f3,f4,f5};
        
        //Ordenados por nombre
        ComparaNombreFutbolistas c2 = new ComparaNombreFutbolistas();
        Arrays.sort(fArray,c2);
        System.out.println(Arrays.deepToString(fArray));
        //Ordenados por edad
        ComparaEdadFutbolistas c3= new ComparaEdadFutbolistas();
        Arrays.sort(fArray,c3);
        System.out.println(Arrays.deepToString(fArray));

        //Comparamos la edad y los nombres de los futbolistas para que en caso de que la edad sea la misma lo ordene por orden alfabetico
        ComparaEdadYNombreFutbolistas c1= new ComparaEdadYNombreFutbolistas();
        Arrays.sort(fArray, c1);
        System.out.println(Arrays.deepToString(fArray));
    }
}
