package Thread;

import java.util.ArrayList;
import java.util.Random;

public class Casino extends Thread {
    public int dinero;
    public static Casino instance;

    public boolean sePuedeAportar;
    public boolean estoyEnBancarota;
    public int numero;
    public Random generadorNumeros;
    public ArrayList<Jugador> apostadores;

    private Casino() {
        this.dinero = 5000;
        this.generadorNumeros = new Random();
        this.sePuedeAportar = true;
        this.estoyEnBancarota = false;
        this.apostadores = new ArrayList<Jugador>();
    }

    public static Casino getInstance() {
        if (instance == null) {
            instance = new Casino();
        }
        return instance;
    }

    public void abrirApuestas() {
        System.out.println("Se abren  las apuestas");
        this.sePuedeAportar = true;
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void cerrarApuestas() {
        this.sePuedeAportar = false;
        System.out.println("Se cierran  las apuestas");
    }

    public boolean isSePuedeAportar() {
        return sePuedeAportar;
    }

    public synchronized void recibirApuestas(Jugador jugador) {
        jugador.setDinero(jugador.getDinero() - 10);
        this.apostadores.add(jugador);
        this.dinero += 10;
    }

    public synchronized void comprobarGanadores() {
        int numeroElegido;
        if (this.numero == 0) {
            System.out.println("Casino: El numero es el 0, asi que gano yo");
        } else {
            for (int i = 0; i < apostadores.size(); i++) {
                numeroElegido = this.apostadores.get(i).getNumeroElegido();
                if (numeroElegido == this.numero) {
                    if (this.dinero > 0 || (this.dinero - 360) > 0) {
                        System.out.println("Casino: El jugador " + this.apostadores.get(i).getNombre() + "  ha ganado con su numero: " + numeroElegido + " y " +
                                "se le ha pagado 360, su saldo actual es de: " + this.apostadores.get(i).getDinero() + " €");
                        this.apostadores.get(i).setDinero(this.apostadores.get(i).getDinero() + 360);
                        this.dinero -= 360;
                    } else {
                        System.out.println("Casino: El jugador " + this.apostadores.get(i).getNombre() + " no ha ganado con su numero: " + numeroElegido +
                                "su saldo actual es de: " + this.apostadores.get(i).getDinero() + " €");
                    }
                }
            }
        }
        this.apostadores.clear();
    }

    private void iniciarJugadores(int cantidadJugadores) {
        for (int i = 0; i < cantidadJugadores; i++) {
            String nombre = "Jugador " + i;
            Jugador jugador = new Jugador(nombre, this);
            jugador.start();
        }
    }

    @Override
    public void run() {
        this.iniciarJugadores(4);
        while (this.estoyEnBancarota == false) {
            this.abrirApuestas();
            this.cerrarApuestas();
            this.numero = this.generadorNumeros.nextInt(37);
            System.out.println("Casino: El numero que ha salido es..." + this.numero);
            this.comprobarGanadores();

            if (this.dinero <= 0) {
                this.estoyEnBancarota = true;
                System.out.println("Casino: ESTOY EN BANCAROTA, NO SE PUEDE JUGAR MAS");
            } else {
                System.out.println("Casino: ¡Sigamos jugando!");
            }

        }

    }
}
