import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Proceso> proces= new ArrayList<>();
        
        proces.add(new Proceso(1, 2000));
        proces.add(new Proceso(2, 5000));
        proces.add(new Proceso(3, 4000));
        proces.add(new Proceso(4, 3000)); 
        
        System.out.println("FIFO");
        for (Proceso proceso : proces) {
            System.out.println(proceso.toString());
        }

        System.out.println("Round Robin");
    }
    public static class Proceso {
        int id;
        int tiempo;

        Proceso(int id, int tiempo){
            this.id= id;
            this.tiempo= tiempo;
        }

        @SuppressWarnings("static-access")
        @Override
        public String toString() {
            String string="";
            return string.valueOf(id);
        }
    
    }
}

