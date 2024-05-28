package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Funciones {
    static void agregaBotonAPanel(String caption, JPanel pnl){
        JButton btn = new JButton(caption);
        pnl.add(btn);
    }

    /**
     * Crea un formulario
     * @param caption nombre del formulario
     * @param ancho establece el ancho de la pantalla en pixeles
     * @param alto establece el alto de la pantalla en pixeles
     * @param pnl introduce el panel con el que haras operaciones
     * @return
     */
    static JFrame creaFormulario(String caption, int ancho, int alto){
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setSize(ancho, alto);
        frm.setLocationRelativeTo(null);
        return frm;

    }
    
}
