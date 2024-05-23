package tema8.src.ficherosBinarios;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Atributos cliente
        /*ID
         * nombre
         * telefono
         */
        Cliente[] c = new Cliente[0];
        int opcion;
        String nombre, telefono;
        @SuppressWarnings("unused")
        String fichero, path, carpeta;
        
        @SuppressWarnings("unused")
        boolean respuesta;
        fichero="datosclientes.dat";
        carpeta="ficherosBinerios\\";
        path="Proyectos Nahuel\\tema8\\src";
        //añadir cliente nuevo
        //Modificar datos
        //Dar de baja a cliente
        //dar lista clientes
        //salir
        
        System.out.println("Introduzca la opcion \n"+
        "[1] Añadir nuevo cliente \n"+
        "[2] Modificar datos de un cliente\n"+
        "[3] Dar de baja a un cliente\n"+
        "[4] Dar lista de clientes\n"+
        "[5] Salir");
        do{
        opcion= sc.nextInt();
        if(opcion == 1){
            
            System.out.println("Introduzca el Nombre y el Telefono del nuevo cliente");
            nombre= sc.next();
            telefono = sc.next();
            c[0] = new Cliente(nombre, telefono);
            c = Arrays.copyOf(c, c.length +1);
            c[c.length-1]= new Cliente(nombre, telefono);
            
        }else if (opcion ==2){
            System.out.println("introduce la id del cliente al que quieres modificar");
        }else if(opcion == 3){

        }else if(opcion == 4){

        }else{
            System.out.println("Has introducido un valor no adecuado");
        }
        System.out.println("¿Que quieres hacer ahora?: \n"+
        "[1] Añadir nuevo cliente \n"+
        "[2] Modificar datos de un cliente\n"+
        "[3] Dar de baja a un cliente\n"+
        "[4] Dar lista de clientes\n"+
        "[5] Salir");
        }while(opcion !=5);
        System.out.println("Has salido del programa");
        sc.close();
    }

    
    
}
