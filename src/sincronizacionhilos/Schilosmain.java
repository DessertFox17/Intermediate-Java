package sincronizacionhilos;

public class Schilosmain {

    public void SCronhilos() {

        Proceso1 hilo1 = new Proceso1();
        Proceso2 hilo2 = new Proceso2();
        Proceso3 hilo3 = new Proceso3();
        Proceso4 hilo4 = new Proceso4();

        //Hilo 1
        hilo1.start();
        try {
            hilo1.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error hilo 1" + e);
            //Hilo 2
            hilo2.start();
        }
        //Hilo 2
        hilo2.start();
        try {
            hilo2.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error hilo 2" + e);
        }
        //Hilo 3
        hilo3.start();
        try {
            hilo3.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error hilo 3" + e);
        }
        //Hilo 4
        hilo4.start();
        try {
            hilo4.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Error hilo 4" + e);
        }

        try{ Thread.sleep(12000);}
        catch(InterruptedException e){}

    }
}