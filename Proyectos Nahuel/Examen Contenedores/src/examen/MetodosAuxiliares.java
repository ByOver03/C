package examen;

public class MetodosAuxiliares {
    Posicion establecerPosicion(String posicion){
        posicion= posicion.toLowerCase();
        switch (posicion) {
            case "delantero":
                return Posicion.DELANTERO;
            case "centrocampista":
                return Posicion.CENTROCAMPISTA;
            case "defensa":
                return Posicion.DEFENSA;
            case "portero":
                return Posicion.PORTERO;
            default:
                System.out.println("Posicion del usuario no correcta");
                return null;
        }
    }
}
