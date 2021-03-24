package sincronizacionhilos;

public class Proceso3 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.print("E");
            try {
                Proceso3.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Proceso 3" + e);
            }
        }
    }
}
