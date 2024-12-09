package Examenes.examenGlobosNahuel;

public class Lanzador {
    public static void main(String[] args) {
        //Declaramos la clase Globos
        Globus g = new Globus();

        //Declaramos las Clases PunxarGlobus
        PunxarGlobus[] pg = new PunxarGlobus[10];
        for (int i = 0; i < 9; i++) {
            pg[i] = new PunxarGlobus(g, i+1);
            pg[i].start();
        }

        //Declaramos las clases InflarGlobus
        InflarGlobus[] ig= new InflarGlobus[10];
        for (int i = 0; i < 9; i++) {
            ig[i] = new InflarGlobus(g, i+1);
            ig[i].start();
        }
        
        
    }
}
