package examen1.banco;

public class Persona implements Cliente,Empleado{
    //Atributos
    String dni;
    String nombre;
    boolean cliente;
    boolean empleado;

    int horasdiarias;
    double saldo;

    //Constructor
    Persona(String dni, String nombre, boolean cliente, boolean empleado, int horasdiarias, double saldo){
        this.dni= dni;
        this.nombre= nombre;
        this.cliente= cliente;
        this.empleado= empleado;
        this.horasdiarias= horasdiarias;
        this.saldo= saldo;
    }

    //Metodo para mostrar el numero de horas trabajadas
    @Override
    public int numerodehorastrabajadas() {
        if(empleado == true){
            int horas = this.horasdiarias * 27;
            return horas;
        }
        return 0;
    }

    //Metodo para mostrar el saldo de la cuenta
    @Override
    public double saldodelacuenta() {
        if(cliente == true){
            return saldo;
        }
        return 0;
    }
    
    //Metodo para mostrar la informacion de la persona
    public String toString(){
        return "DNI: " + this.dni + "Nombre: " + this.nombre + "Horas Mensuales: " + numerodehorastrabajadas() + "Saldo: " + saldodelacuenta() + "\n";
    }
    
    //Metodo para incrementar las horas mensuales trabjadas
    int incrementahoras(int incremento){
        incremento= numerodehorastrabajadas() + incremento;
        
        return incremento;
    }

    //Metodo para incrementar las horas trabajadas
    double incrementasaldo(double incremento){
        incremento = saldodelacuenta() +incremento;

        return incremento;
    }
}
