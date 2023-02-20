import java.util.Random;

public class Animal extends Thread {
    private String raza;
    private int pasos;
    private int pasosTotales;
    private Random generadorPasos;
    private String nombre;
    private Carrera carrera;

    public Animal(String raza, String nombre, Carrera carrera) {
        this.raza = raza;
        this.nombre = nombre;
        this.generadorPasos = new Random();
        this.carrera = carrera;
        this.pasosTotales = 0;
    }

    @Override
    public void run() {
        while (this.carrera.getHayGanador() == false) {
            if (this.pasosTotales < this.carrera.getMETA()) {
                this.pasos = this.generadorPasos.nextInt(15) + 1;
                this.pasosTotales += this.pasos;
                String carrera = "Soy: " + this.nombre + " he avanzado " + this.pasos + " y llevo en total: " + this.pasosTotales;
                System.out.println(carrera);

            } else if (this.pasosTotales == this.carrera.getMETA()) {
                this.carrera.setGanador(this);
                this.carrera.setHayGanador(true);
                System.out.println(this.nombre + ": he cruzado la meta el primero!!!!!");
            }

        }
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public Random getGeneradorPasos() {
        return generadorPasos;
    }

    public void setGeneradorPasos(Random generadorPasos) {
        this.generadorPasos = generadorPasos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
