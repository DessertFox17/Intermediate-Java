package hilosconparametros;

public class Proceso extends Thread {

    int numint;

    public Proceso(String Nombrehilo){

        super(Nombrehilo);//Se usa el constructor para darle nombre al hilo

    }

    @Override
    public void run() {
        for (int i = 0; i <= numint; i++) {
            System.out.println(i + this.getName());// Obtiene el nombre del hilo que lo corre
        }
        System.out.println();
    }

    public void Valor(int valor){
        this.numint = valor;
    }
}
