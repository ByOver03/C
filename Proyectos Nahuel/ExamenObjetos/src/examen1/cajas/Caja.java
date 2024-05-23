package examen1.cajas;

public class Caja {
    //Atributos
    int ancho;
    int alto;
    int fondo;

    Unidad unidad;

    String etiqueta;

    //Constructores
    Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho= ancho;
        this.alto= alto;
        this.fondo= fondo;
        this.unidad= unidad;
    }

    Caja(int ancho, int alto, int fondo){
        this.ancho= ancho;
        this.alto= alto;
        this.fondo= fondo;
    }

    //Metodo para obtener el volumen de la caja
    double getVolumen(){
        int volumen;
        //En caso de que las unidades sean centimetros le pedimos que lo divida entre 100 para que lo de en metros
        if(unidad == Unidad.CM){
            this.ancho/=100;
            this.fondo/=100;
            this.alto/=100;
            volumen= this.ancho*this.alto*this.fondo;
            return volumen;
        }
        
        volumen= this.ancho*this.alto*this.fondo;
        return volumen;
    }

    //Establecemos el valor de la etiqueta de la caja
    void setEtiqueta(String etiqueta){

        this.etiqueta= etiqueta;
        System.out.println("La etiqueta tiene el valor de: " + etiqueta);
    }

    //Metodo para dar la informacion de la caja
    public String toString(){
        return "La caja tiene un volumen de: " + getVolumen() + " metros cubicos y su etqueta seria: " + this.etiqueta;
    }

    //Metodo para determinar si dos cajas son iguales
    public boolean equals(Object o){
        Caja c = (Caja)o;
        if((this.ancho == c.ancho)&&(this.alto == c.alto)&&(this.fondo == c.fondo)&&(this.etiqueta == c.etiqueta))
        return false;
        return false;
    }
}
