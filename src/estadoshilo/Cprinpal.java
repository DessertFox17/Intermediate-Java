package estadoshilo;

public class Cprinpal {


    public void PPalh() {
        HiloProceso hilo1 = new HiloProceso(" Hilo 1");
        HiloProceso hilo2 = new HiloProceso(" Hilo 2");

        hilo1.start();

        try {
            hilo1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error hilo" + e);
        }

        hilo2.start();
        hilo2.stop();

        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error hilo" + e);
        }

    }
}

