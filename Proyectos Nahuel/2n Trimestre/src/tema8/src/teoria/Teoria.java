package tema8.src.teoria;

public class Teoria {
    int a;
    int b;

    Teoria(int a, int b){
        this.a= a;
        this.b= b;
    }
    void division(){
        
        try{
        int resultado= (int)this.a/this.b;
        System.out.println("El resultado es: " + resultado);
        }catch(Exception e){
            System.out.println("Error:" + e.getMessage());
            
        }
    }
}
