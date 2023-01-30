package Ejercicio3;

import java.util.Random;

public class Avisador extends Thread {
    private Random generadorPasos;
    private Corredor Compañero;
    private String nombre;
    private Carrera carrera;
    private int posicion;

    public Avisador(Corredor compañero, String nombre, int posicion, Carrera carrera) {
        this.Compañero = compañero;
        this.nombre = nombre;
        this.posicion = posicion;
        this.carrera = carrera;
        this.generadorPasos = new Random();
    }



    public String getNombre() {
        return nombre;
    }

    public int gritarNumero() {
        int pasos = generadorPasos.nextInt(30) + 1;
        System.out.println(this.nombre + " tienes que correr " + pasos);
        return pasos;
    }

    @Override
    public void run() {
        while (carrera.hayGanadores() == false && this.Compañero.estoyCorriendo() == false) {
            Compañero.oir(gritarNumero());
            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
