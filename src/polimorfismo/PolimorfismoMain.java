package polimorfismo;

public class PolimorfismoMain {

    public void Polimain(){
        HijaSuma mensajeroSuma = new HijaSuma();
        System.out.println("Suma");
        System.out.println();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        mensajeroSuma.MostrarResultado();
        System.out.println();

        HijaResta mensajeroResta = new HijaResta();
        System.out.println("Resta");
        System.out.println();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.MostrarResultado();
        System.out.println();

    }

}
