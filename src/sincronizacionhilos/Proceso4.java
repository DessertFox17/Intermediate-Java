package sincronizacionhilos;

public class Proceso4 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("K");
            try {
                Proceso4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Proceso 4" + e);
            }
        }
    }
}
