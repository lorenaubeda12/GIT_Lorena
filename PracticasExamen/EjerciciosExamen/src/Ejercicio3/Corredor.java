package Ejercicio3;

import java.util.Random;

public class Corredor extends Thread {
    private int pasos;
    private int pasosRecorridos;
    private boolean estoyCorriendo;
    private int posicion;

    private String nombre;
    private Carrera carrera;

    public Corredor(String nombre, Carrera carrera, int posicion) {
        this.nombre = nombre;
        this.estoyCorriendo = false;
        this.carrera = carrera;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estoyCorriendo() {
        return this.estoyCorriendo;
    }

    public void oir(int pasos) {
        this.pasos = pasos;
    }

    @Override
    public void run() {
        while (carrera.hayGanadores() == false) {
            if (this.pasos == 0) {
                try {
                    this.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (carrera.hayGanadores() == false) {
                this.pasosRecorridos += this.pasos;
                this.estoyCorriendo = true;
                this.carrera.revisar(this.pasosRecorridos, this.posicion);
                System.out.println(this.nombre + " estoy corriendo, mi total recorrido es de : " + this.pasosRecorridos);
                this.estoyCorriendo = false;
                System.out.println(this.nombre + " ya pare");

                this.pasos = 0;
            }
        }

    }


}
