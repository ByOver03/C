package Casino.RuletaBien;

public class Jugador extends Thread {
    int saldoInicial = 1000;
    int apuesta = 10;
    int id;
    Banca banca;
    int numA;
    int numS;
    Juego juego;

    Jugador(Banca banca, int id, Juego juego) {
        this.banca = banca;
        this.id = id;
        this.juego = juego;
    }

    void apostarAleatorio() {
        synchronized (banca) {
            numS = banca.obtenerNumeroGanador();
            numA = (int) (Math.random() * 36) + 1;
            saldoInicial -= apuesta;

            if (numS == 0) {
                numero0();
            } else if (numA == numS) {
                ganar();
            } else {
                perder();
            }
            if (banca.jugadoresEsperando == 0) {
                Ruleta.disponible = false;
                banca.notifyAll();
            }
        }
    }

    void apostarMartingala() {

        synchronized (banca) {
            numS = banca.obtenerNumeroGanador();
            numA = (int) (Math.random() * 36) + 1;
            saldoInicial -= apuesta;
            if (numS == 0) {
                numero0();
            } else if (numA == numS) {
                ganar();
            } else {
                perder();
                apuesta *= 2;
            }
            if (banca.jugadoresEsperando == 0) {
                Ruleta.disponible = false;
                banca.notifyAll();
            }
        }

    }

    void apostarParImpar() {
        synchronized (banca) {
            numS = banca.obtenerNumeroGanador()%2;
            numA = (int) (Math.random()*2);
            saldoInicial -= apuesta;
            if (numS == 0) {
                ganar();
            } else {
                perder();
                apuesta *= 2;
            }
            if (banca.jugadoresEsperando == 0) {
                Ruleta.disponible = false;
                banca.notifyAll();
            }
        }
    }

    @Override
    public void run() {
        while (saldoInicial > 0 && banca.dinero > 0) {
            if (juego == Juego.ALEATORIO) {
                apostarAleatorio();
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                }
            } else if (juego == Juego.MARTINGALA) {
                apostarAleatorio();
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                }
            } else if (juego == Juego.PARIMPAR) {
                apostarAleatorio();
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("El jugador o la banca se quedaron sin dinero");
    }

    void ganar() {
        synchronized (banca) {
            if (juego == Juego.ALEATORIO && juego == Juego.MARTINGALA) {
                banca.perderDinero(apuesta*36);
                saldoInicial += 360;
            }else if(juego == Juego.PARIMPAR){
                banca.perderDinero(apuesta*2);
                saldoInicial += 360;
            }
        }
        
        System.out.println("Ludópata " + id + " ha ganado la apuesta normal con el número " + numA
                + " Dinero actual: " + saldoInicial);
    }

    void perder() {
        synchronized (banca) {
            banca.ganarDinero(10);
        }
        System.out.println(
                "Ludópata " + id + " ha perdido la apuesta con el número " + numA + ", Dinero actual: " + saldoInicial);
    }

    void numero0() {
        System.out.println("Ha salido 0, ludópata " + id + " ha perdido Dinero actual " + saldoInicial);
        synchronized (banca) {
            banca.ganarDinero(10);
        }
    }
}

enum Juego {
    ALEATORIO, MARTINGALA, PARIMPAR
}
