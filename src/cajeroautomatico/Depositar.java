package cajeroautomatico;


public class Depositar extends OperacionesF{


    @Override
    public void Movimientos() {
        Depositar();
        transacciones = getsaldoactual();
        setsaldoactual(transacciones + saldopluss);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Acabas de depositar: " + saldopluss);
        System.out.println("Su nuevo saldo es: " + getsaldoactual());
        System.out.println("---------------------------------------");
    }
}
