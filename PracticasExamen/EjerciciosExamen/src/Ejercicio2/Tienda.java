package Ejercicio2;

public class Tienda extends Thread {
    private int movilesDisponibles;
    private boolean estaLibre;
    private boolean hayUnidades;


    public Tienda() {
        this.estaLibre = true;
        this.movilesDisponibles = 100;
        this.hayUnidades = true;
    }

    public boolean venderMovil() {
        if (movilesDisponibles - 1 == 0) {
            this.movilesDisponibles =0;
            this.hayUnidades = false;
            return true;
        } else if (movilesDisponibles > 0) {
            this.hayUnidades = true;
            this.movilesDisponibles -= 1;
            return true;
        } else {
            this.hayUnidades = false;
            return false;
        }
    }

    public synchronized void salir() {
        this.estaLibre = true;
    }

    public synchronized boolean entrar() {
        if(this.estaLibre){
            this.estaLibre=false;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            String nombre = "Cliente " + i;
            Cliente cliente = new Cliente(nombre, 10, this);
            System.out.println("Ha llegado el cliente "+nombre);
            cliente.start();
        }

    }
}

