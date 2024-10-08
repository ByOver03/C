package exercici1_4;


public class LeerNombre {
    public static void main(String[] args) {
        for (String string : args) {
            System.out.println(string);
        }
        
        if(args.length==0 ){
            System.exit(-1);
        }else{
            
            System.exit(1);
        }
    }
}
