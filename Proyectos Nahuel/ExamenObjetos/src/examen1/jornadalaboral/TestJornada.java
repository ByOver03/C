package examen1.jornadalaboral;

public class TestJornada {
    public static void main(String[] args) {
        
        //Declaramos los objetos
        Jornada j1 = new Jornada("41513352P", "06-02-2024 18:24", "06-02-2024 21:30");
        Jornada j2 = new Jornada("41513352P", "07-02-2024 18:24", "07-02-2024 21:30");
        
        //Mostramos cuanto tiempo han trabajado
        System.out.println(j1.minutosTrabajadosJornada());
        System.out.println(j2.minutosTrabajadosJornada());

        //Mostramos la diferencia que tienen
        System.out.println(j1.compareTo(j2));

        //Mostramos la informacion de cada uno de ellos
        System.out.println(j1.toString());
        System.out.println(j2.toString());


    }
}
