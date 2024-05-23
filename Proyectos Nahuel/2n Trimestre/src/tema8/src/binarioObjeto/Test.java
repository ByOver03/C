package tema8.src.binarioObjeto;


public class Test {
    public static void main(String[] args) {
        String estrofa="con diez camiones por banda, \n";
        estrofa +="viento en popa a toda vela, \n";
        estrofa +="no corta el mar, sino vuela \n";
        estrofa +="un velero bergantin.";
        String fichero= "cancionPirata.dat";


        GestionFicheros.escribeFicheroStringToObject(estrofa, fichero);

        String fichero2= "fichero.dat";

        String estrofa2="SILENCIO, \n";
        estrofa2 +="No confundas mi silencio con falta de duelo \n";
        estrofa2 +="Llorala a tu manera y yo la llorare a la mia...";

        GestionFicheros.escribeFicheroStringToObject(estrofa2, fichero2);

        String cancion="";
        String ficheroNumeros= "datos.dat";
        cancion = GestionFicheros.leeFicheroObjectToString(ficheroNumeros);

        System.out.println(cancion);

        
    }
}
