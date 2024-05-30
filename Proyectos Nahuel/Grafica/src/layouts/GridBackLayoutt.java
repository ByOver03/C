package layouts;

import java.awt.*;
import javax.swing.*;
public class GridBackLayoutt {
    public static void main(String[] args) {
        /*Atributos de la clase
         * 
         *  -gridx: indica el numero de columna donde se encuentra el componente
         *  -gridy: indica la posicion de la fila
         *  -gridwith: indica cuantas celdas en horizontal ocupa el componente
         *  -gridheight: Lo mismo pero en vertical
         *  -weigthx, weighty: los valores van entre 0 y 1, esetira todo lo que pueda la columna/fila
         *  -fill: hace que el componente ocupe la celda -> none, vertical, horizontal, both
         *  -ipadx, ipady: espacio interno adicional dentro del componente
         *  -insets: es un espacio extra externo
         *  -anchor: va a ser util cuando el componente no ocupa toda la celda, nos dice donde se encuentra exactamente de toda la celda
         *          puede estar en -> north, east, south, west y las combinaciones de estos
         */

        JFrame frm = Funciones.creaFormulario("GridBackLayout", 300, 200);
        JPanel pnl = (JPanel) frm.getContentPane();
        pnl.setLayout(new GridBagLayout());

        //Definimos los valores que vamos a utilizar

        /* Seguiremos el constructor:
         * GridBagConstrains(
         * int gridx,                               //Numero de columnas donde se coloca el componente
         * int grigy,                               //Numero de filas donde se cloca el componente
         * int gridwidth,                           //Numero de celdas en Horizontal que ocupa
         * int gridheigth,                          //Numero de celdas en vertical
         * double weigthx,                          //Lo que estira la celda en vertical
         * double weigthy,                          //Lo que estira la celda en horizontal
         * int anchor, (GridBagConstrains.CENTER)   //La situacion del componente en la celda
         * int fill, (GridBagConstraints.BOTH)      //Como estira el componente la celda
         * Insets insets , (a, b, c, d)             //Relleno externo a la celda
         * int ipadx,                               //Relleno interno en horizontal
         * int ipady,                               //Rellendo interno vertical de la celda
         */

         //JTextArea

        JTextArea txtArea = new JTextArea("Area de texto");

        GridBagConstraints gbcValores = new GridBagConstraints();

        gbcValores.gridx = 0;
        gbcValores.gridy = 0;
        gbcValores.gridwidth = 2;
        gbcValores.gridheight = 2;
        gbcValores.weightx = 0.0;//No es necesario ponerlo en 0.0 ya que es su valor por defecto
        gbcValores.weighty = 1.0;
        gbcValores.anchor = GridBagConstraints.CENTER;
        gbcValores.fill = GridBagConstraints.BOTH;
        pnl.add(txtArea, gbcValores);

        JButton btn1 = new JButton("Frances si lo pulsas");
        gbcValores.gridx = 2;
        gbcValores.gridy = 0;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;//No es necesario ponerlo en 0.0 ya que es su valor por defecto
        gbcValores.weighty = 0.0;
        gbcValores.anchor = GridBagConstraints.NORTH;
        gbcValores.fill = GridBagConstraints.NONE;

        pnl.add(btn1, gbcValores);

        JButton btn2 = new JButton("Si lo pulsas te gusta el pito");
        pnl.add(btn2, new GridBagConstraints(2,1,1,1,0,0,GridBagConstraints.NORTH, GridBagConstraints.NONE, new Insets(0,0,0,0), 0,0));

        JButton btn3 = new JButton("Boton 3");
        gbcValores.gridx = 0;
        gbcValores.gridy = 2;
        gbcValores.gridwidth = 1;
        gbcValores.gridheight = 1;
        gbcValores.weightx = 0.0;//No es necesario ponerlo en 0.0 ya que es su valor por defecto
        gbcValores.weighty = 0.0;
        gbcValores.anchor = GridBagConstraints.CENTER;
        gbcValores.fill = GridBagConstraints.NONE;

        pnl.add(btn3, gbcValores);
        frm.setVisible(true);

    }
}
