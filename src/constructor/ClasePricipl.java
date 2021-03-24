package constructor;

public class ClasePricipl {

    public void Principl() {
        // Sentencias necesarias con constructor
        conContructor mensajerocc = new conContructor();

        //Sentencias necesarias sin constructor
        sinConstructor mensajerosc = new sinConstructor();
        mensajerosc.Pedirdatos();
        mensajerosc.imprimir();
    }
}
