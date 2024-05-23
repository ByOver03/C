package examen1.cajas;

public class CajaCarton extends Caja {
    
    //Constructor
    CajaCarton(int alto, int ancho, int fondo){
        super(ancho, alto, fondo);
    }

    //Metodo para determinar el volumen de la caja
    @Override
    double getVolumen(){
        double volumenreal;
        //Calculamos el volumen real y despues le pedimos que nos de el 80% de este para no romper las cajas
        volumenreal= (this.alto*this.ancho*this.fondo)/100;
        double volumen= (volumenreal*0.8);
        
        return volumen;
    }
    
}
