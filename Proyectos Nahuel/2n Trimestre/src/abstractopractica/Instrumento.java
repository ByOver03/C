package abstractopractica;
import java.util.*;
public abstract class Instrumento {

    Nota[] Melodia;

    void ADD(Nota nota){
        Melodia= Arrays.copyOf(Melodia, Melodia.length + 1);
        Melodia[Melodia.length -1]= nota;
    }

    abstract void interpretar();
}
