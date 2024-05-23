package socios;

import java.util.Arrays;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Socio s1= new Socio(3, "Nahuel", "17-02-2003");
        Socio s2 =new Socio(1, "Yoshwa", "27-01-2004");
        Socio s3 =new Socio(10,"Robo", "01-01-2005");

        Socio[] misSocios= {s1, s2, s3};

        ComparaEdades c = new ComparaEdades();
        
        Arrays.sort(misSocios, c);
        System.out.println(Arrays.deepToString(misSocios));
    }
    
}
