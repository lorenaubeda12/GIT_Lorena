package Thread;

import java.util.Random;

public class Jugador extends Thread {
    private int dinero;
    private String nombre;
    private int numeroElegido;
    private boolean estoyArruinado;
    private Random generadorNumero;
    private Casino casino;
    private boolean  yaAposte;

    private  Jugador apostar() {
        this.numeroElegido = this.generadorNumero.nextInt(37) + 1;
        System.out.println(this.nombre+" mi numero es: "+this.numeroElegido);
        this.yaAposte=true;
        return this;
    }

    public Jugador(String nombre, Casino casino) {
        this.dinero = 1000;
        this.generadorNumero = new Random();
        this.nombre = nombre;
        this.casino = casino;
        this.estoyArruinado = false;
        this.yaAposte=false;
    }

    public int getDinero() {
        return dinero;
    }

    public int getNumeroElegido() {
        return numeroElegido;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        while (this.casino.estoyEnBancarota==false && this.estoyArruinado == false) {
            if (this.dinero <= 0) {
                this.estoyArruinado = true;
                System.out.println(this.nombre+": ESTOY ARRUINADO, NO JUEGO MAS");
            }
            if (casino.isSePuedeAportar() && this.yaAposte==false) {
                casino.recibirApuestas(this.apostar());
                try {
                    //System.out.println("Ya aposte, estoy esperando a la jugada "+this.nombre);
                    this.sleep(7000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                   // System.out.println("No puedo apostar aun "+this.nombre);
                    this.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.yaAposte=false;
        }
    }
}
