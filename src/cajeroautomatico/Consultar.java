package cajeroautomatico;

public class Consultar extends OperacionesF{

    @Override
    public void Movimientos(){
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Su saldo actual es: " + getsaldoactual());
        System.out.println("---------------------------------------");
    }
}
