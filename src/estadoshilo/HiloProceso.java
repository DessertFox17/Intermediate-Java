package estadoshilo;

public class HiloProceso extends Thread {

    public HiloProceso(String Nombrehilo) {
        super(Nombrehilo);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + this.getName());
            try {
                HiloProceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error dentro dela clase" + e);
            }
        }
    }
}
