package generador;
import scanner.Scan;

public class GeneradorDeMenus {

    //Metodo que Imprime un menu de forma visual
    public static void generaMenus(String[] menu){
        menu[0]= "Indique La opcion que usted quiera";

        int i= 1;
        System.out.println("*********************************************************");
        for (String string : menu) {
            if(string.equals(menu[0])){
                System.out.println(string);
            }else{
                    
                    System.out.println("[" +i +"] " + string);
                    i++;
            }  
        }
        System.out.println("*********************************************************");
    }
    /**
     * Este metodo es todo el cerebo del menu, tienes que añadir previamente los metodos que quieras establecer
     * El primer parametro que establezcas en el array de String no se mostrara ya que por defecto el primer parametro se establecera como introduce una opcion
     * @param <T>
     * introduce un array de Strings y un parametro que sera el necesario para inicializar los metodos
     * @param menu
     * @param parametro
     */
    public static <T>void chichaMenu(String[] menu,T parametro){
        int usuario=0;
        
        
        do {
            System.out.println("Introduzca un parametro para confirmar la operacion");
            generaMenus(menu);
            usuario= Scan.ScannerInteger(usuario);
            if(MetodoDevuelve.getRegistro().containsKey(usuario)){
                MetodoDevuelve.ejecutar(usuario, parametro);
            }else if(MetodoVoid.getMetodos().containsKey(usuario)){
                MetodoVoid.ejecutarMetodo(usuario, parametro);
            }
        } while (menu.length-1!=usuario);
        
        
    }
}

    