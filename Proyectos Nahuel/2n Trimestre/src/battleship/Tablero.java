package battleship;

public class Tablero {
    //Array bidimensional para tablero
    static String[][] tablero=new String[10][10];
    

    //Metodos para posicionar barcos
    void introducirPortaaviones(){

    }

    void introducirSubmarino(){

    }

    void introducirDestructor(){

    }

    void introducirFragata(){

    }

    //Creo un metodo para darle valor a cada casilla del tablero
    void iniciarTablero(){
        for(int i =0; i <tablero.length; i ++){
            for(int j = 0; j < tablero[i].length; j++){
                //con estos valores le doy valor a cada cassilla
                //Siendo la primera linea de codigo el valor de las letras aprovechando el codigo asci
                char letra = (char) ('A' + i);
                //Y este lo que hace es que muestra las letras y el numero necesario
                tablero[i][j] = letra + "" + (j +  1);
            }
        }
    }

    void estadodeljuego(){
        //Con este bucle imprimimos el tablero
        for(int i= 0; i < tablero.length; i++){
            //Con este syso en cada vez que una linea alcance el numero maximo de valores haga un salto de linea para dar paso al siguiente valor
            System.out.println("");
            //En este segundo bucle imprimimos cada valor del tablero uno por uno
            for(int j = 0; j <tablero[0].length; j++){
                System.out.print(tablero[i][j] + " | ");
            }
        }
    }

    void atacarbarcos(){

    }
}
