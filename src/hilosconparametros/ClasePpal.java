package hilosconparametros;

public class ClasePpal {

    public void MMain() {
        Proceso hilo1 = new Proceso(" hilo1");// Se para por parámetros el nombre del hilo
        Proceso hilo2 = new Proceso(" hilo2");
        Proceso hilo3 = new Proceso(" hilo3");


        hilo1.Valor(5);
        hilo2.Valor(10);
        hilo3.Valor(15);


        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
