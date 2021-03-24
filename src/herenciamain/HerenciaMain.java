package herenciamain;

import herenciaoperaciones.HijaResta;
import herenciaoperaciones.HijaSuma;
import herenciaoperaciones.Padre;

public class HerenciaMain extends Padre {

    public void SumaResta() {
        HijaSuma mensajerosuma = new HijaSuma();
        System.out.println("Suma");
        System.out.println();
        mensajerosuma.PedirDatos();
        mensajerosuma.Suma();
        mensajerosuma.MostrarResultado();
        System.out.println();

        HijaResta mensajeroresta = new HijaResta();
        System.out.println("Resta");
        System.out.println();
        mensajeroresta.PedirDatos();
        mensajeroresta.Resta();
        mensajeroresta.MostrarResultado();

    }
}
