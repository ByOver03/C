package examen1.cajas;
public class TestCajas {
    public static void main(String[] args) {
        
        //Declaramos las clases Caja
        Caja c1 = new Caja(1, 2, 3, Unidad.M);
        Caja c2 = new Caja(4, 5, 6, Unidad.CM);

        //Pedimos que muestren su volumen
        System.out.println(c1.getVolumen());
        System.out.println(c2.getVolumen());

        //Las comparamos
        System.out.println(c1.equals(c2));


        //Establecemos el valor de sus etiquetas
        c1.setEtiqueta("31233434354");
        c2.setEtiqueta("13564313431");

        //Mostramos la informacion de estas
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        //Declaramos las clases CajaCarton
        CajaCarton cc1 = new CajaCarton(165456, 2354354, 3354354);
        CajaCarton cc2 = new CajaCarton(143564, 2, 3354354);

        //Calculamos sus volumenes
        System.out.println(cc1.getVolumen());
        System.out.println(cc2.getVolumen());
    }
}
