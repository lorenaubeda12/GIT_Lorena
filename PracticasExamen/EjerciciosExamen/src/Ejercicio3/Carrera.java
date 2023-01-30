package Ejercicio3;

public class Carrera extends Thread {
    private final int META = 100;
    private Corredor[] corredores;
    private Avisador[] avisadores;
    private boolean hayGanadores;
    private int equipos;
    private int posicionGanadores;

    public Carrera(int equipos) {
        this.avisadores = new Avisador[equipos];
        this.corredores = new Corredor[equipos];
        this.hayGanadores = false;
        this.equipos = equipos;
    }

    public synchronized void revisar(int pasos, int posicion) {
       this.posicionGanadores=posicion;
        if (this.META <= pasos) {
            this.hayGanadores = true;

        } else {
            this.hayGanadores = false;
        }
    }

    public boolean hayGanadores() {
        return this.hayGanadores;
    }

    @Override
    public void run() {
        for (int i = 0; i < equipos; i++) {
            String nombreCorredor = "Corredor " + i;
            String nombreAvisador = "Avisador " + i;

            Corredor corredor = new Corredor(nombreCorredor, this, i);
            Avisador avisador = new Avisador(corredor, nombreAvisador, i,this);
            corredores[i] = corredor;
            avisadores[i] = avisador;


            corredor.start();
            avisador.start();
        }

        while (hayGanadores == false) {
            try {
                this.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Los ganadores son: " + this.corredores[this.posicionGanadores].getNombre() + " y " + this.avisadores[this.posicionGanadores].getNombre());
    }
}
