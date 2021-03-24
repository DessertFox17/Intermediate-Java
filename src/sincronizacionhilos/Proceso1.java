package sincronizacionhilos;

public class Proceso1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + ": G");
            try {
                Proceso1.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Proceso 1" + e);
            }
        }

    }
}
