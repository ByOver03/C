package tema8.src.teoriabinarios;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

    public static void main(String[] args) {
        
        //Clases basicas: bytes individuales
        //FileOutputStream
        //FileInputStream


        //Necesitamos trabajar con conjuntos de bytes
        //Procesoss de : serializacion y deserielizacion

        //Para ello utilizamos flujos "envoltorio":
        //ObjectOutputStream
        //ObjectInputStream
        //creados a partir de FileOutputStream y FileInputStream.

        /*Metodos de ObjectOutputStream
         * void writeBoolean(boolean b):escribe valor booleano en el flujo
         * void writeChar(chat c):escribe valor char que ocupa los dos bytes menos significativos del valor entero que se le pasa por parametro
         * void writeInt (int i): escribe un valor entero en el flujo.
         * void writeLong (long l): escribe un valor largo en el flujo
         * void writeDouble (double d): escribe un valor booleano en el flujo
         * void writeObject (Object o): escribe un objeto SERIALIZABLE.
         */
        
        int[] t = {0,1,2,3,4,5,6,7,8,9};

        ObjectOutputStream flujoZalida = null;

        try {
            flujoZalida = new ObjectOutputStream(new FileOutputStream("datos.dat"));

            for(int n:t){
                flujoZalida.writeInt(n);
            }
        } catch (IOException e) {
            e.getMessage();
        }finally{
            if (flujoZalida != null){
                try{
                    flujoZalida.close();
                }catch(IOException e){
                    e.getMessage();
                }
            }
        }
        
        
        // try{

        // FileOutputStream fos = new FileOutputStream("enteros.dat");
        // ObjectOutputStream ous = new ObjectOutputStream(fos);
        // }catch(FileNotFoundException e){
        //     System.out.println("Error al generar el fos");
        //     e.getMessage();
        // }catch(IIOException e){
        //     System.out.println("Error al generar el ous");
        //     e.getMessage();
        // }

    }
}