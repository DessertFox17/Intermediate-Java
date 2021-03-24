package cajeroautomatico;

import java.util.Scanner;

public abstract class OperacionesF {

    protected int opcion, saldopluss, saldoless, transacciones;
    private static int saldoactual;
    boolean continuar = true;
    Scanner entradaO = new Scanner(System.in);
    Scanner entradaT = new Scanner(System.in);

    public void Menuopciones() {

        System.out.println();
        System.out.println("Cajero automático");
        System.out.println();
        System.out.println("1.Consultar saldo");
        System.out.println("2.Retirar saldo");
        System.out.println("3.Depositar saldo");
        System.out.println("4.Salir");
        System.out.print("-> ");
        opcion = entradaO.nextInt();
    }

    public abstract void Movimientos();

    public void Retirar() {
        System.out.println();
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        System.out.print("-> ");
        saldoless = entradaT.nextInt();
    }

    public void Depositar() {
        System.out.println();
        System.out.println("Ingrese la cantidad de dinero que desea depositar: ");
        System.out.print("-> ");
        saldopluss = entradaT.nextInt();
    }

    public void Error() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("        Error: opción inválida");
        System.out.println("Por favor seleccione una de las opciones");
        System.out.println("----------------------------------------");
    }

    public void Salir() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("¡Gracias por confiar en nosotros!");
        System.out.println("         Vuelva pronto");
        System.out.println("----------------------------------------");
        System.out.println();
        continuar = false;
    }


    public int getsaldoactual() {
        return saldoactual;
    }

    public void setsaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }
}
