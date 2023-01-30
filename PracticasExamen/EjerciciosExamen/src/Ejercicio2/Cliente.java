package Ejercicio2;

public class Cliente extends Thread {
    private String nombre;
    private int intentos;
    private boolean pudeComprar;
    private Tienda tienda;
    private int contador;


    public Cliente(String nombre, int intentos, Tienda tienda) {
        this.nombre = nombre;
        this.intentos = intentos;
        this.tienda = tienda;
        this.pudeComprar=false;
    }

    @Override
    public void run() {
        while (contador <intentos) {
            if (tienda.entrar() ) {
                System.out.println(this.nombre+" : He entrado en la tienda");
                this.pudeComprar = tienda.venderMovil();
                if (this.pudeComprar == false) {
                    System.out.println(this.nombre+" : no hay unidades, que pena");
                } else {
                    System.out.println(this.nombre+" :me voy  contento con mi movil nuevo");
                }
                this.tienda.salir();
                this.contador =intentos;
            } else {
                this.pudeComprar = false;
                this.contador++;
                System.out.println(this.nombre+" : tendre que esperar mas");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if( this.contador==this.intentos&&!pudeComprar){
            System.out.println(this.nombre+" me marcho, he esperado demasiado!!!!");
        }
    }
}
