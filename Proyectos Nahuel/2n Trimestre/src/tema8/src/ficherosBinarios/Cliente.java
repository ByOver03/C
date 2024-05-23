package tema8.src.ficherosBinarios;

public class Cliente {
    //Atributos
    int id;
    String nombre, telefono;

    Cliente(String nombre, String telefono){
        this.id +=1;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String toString(){
        return "ID: "+ this.id + "Nombre: " + this.nombre + "Telefono: " + this.telefono;
    }
}
