package interfaces;

public interface Sonido extends SonidoSuenyo {
    
    int VERSION = 1;
    void voz();//Metodo de la interfaz
    //Metodos por defecto

    default void vozDurmiendo(){
        System.out.println("ZZZ");
    }

    //Metodos estaticos(pueden ser publicos o privados)

    static void bostezo(){
        bosteza();
    }

    private static void bosteza(){
        System.out.println("aaaaauuuuuaaaaaah!");
    }
}
