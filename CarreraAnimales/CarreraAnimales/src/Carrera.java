import java.util.ArrayList;

public class Carrera extends  Thread{

    private final int META=300;
    private boolean hayGanador;
    private Animal ganador;

    private ArrayList<Animal>corredores;

    public Carrera() {
        this.corredores=new ArrayList<>();
        this.hayGanador=false;
    }

    public synchronized int getMETA() {
        return META;
    }

    public synchronized boolean getHayGanador() {
        return hayGanador;
    }

    public synchronized  Animal getGanador() {
        return ganador;
    }

    public synchronized void setHayGanador(boolean hayGanador) {
        this.hayGanador = hayGanador;
    }

    public synchronized void setGanador(Animal ganador) {
        this.ganador = ganador;
    }
public  synchronized void inscribirse(Animal animal){
        this.corredores.add(animal);
}
    @Override
    public void run() {
        for (int i = 0; i < corredores.size(); i++) {
            corredores.get(i).start();
        }
    }
}
