package cajeroautomatico;

public class Retirar extends OperacionesF {


    @Override
    public void Movimientos() {
        Retirar();
        transacciones = getsaldoactual();
        if(saldoless<=transacciones){
            setsaldoactual(transacciones - saldoless);
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("Acabas de retirar: " + saldoless);
            System.out.println("Su nuevo saldo es: " + getsaldoactual());
            System.out.println("---------------------------------------");
        }
        else{
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("     Error: Fondos insuficientes");
            System.out.println("---------------------------------------");
        }
    }
}
