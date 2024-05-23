package abstractopractica;

public class TestEspacial {
    public static void main(String[] args) {
    
        //Declaramos las constantes
        TipusPlaneta planeta= TipusPlaneta.GASÓS;
        TipusPlaneta planeta2= TipusPlaneta.GELAT;

        //Declaramos las naves esploradoras
        NauExploradora a = new NauExploradora("Nahuel", 1, planeta);
        NauExploradora b = new NauExploradora("Nahuel", 1, planeta2);

        //Declaramos las naves de guerra
        NauGuerra c= new NauGuerra("Yoshwa", 1, 1);
        NauGuerra d= new NauGuerra("Yoshwa", 1, 1);

        //Hacemos despegar las naves
        a.enlairar();
        b.enlairar();
        System.out.println("===========================");
        c.enlairar();
        d.enlairar();
        System.out.println("===========================");

        //Mostramos la informacion de las naves
        System.out.println(a.toString());
        System.out.println("===========================");
        System.out.println(b.toString());
        System.out.println("===========================");
        System.out.println(c.toString());
        System.out.println("===========================");
        System.out.println(d.toString());
        System.out.println("===========================");

        //Comparamos las armas
        System.out.println(a.equals(b));
        System.out.println("===========================");
        System.out.println(c.equals(d));
    }
    
    
}
