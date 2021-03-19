package poobj;

import java.util.Scanner;

public class POOmain {

    public void POOm() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Igrese el valor 1: ");
        System.out.print("-> ");
        int val1 = entrada.nextInt();
        System.out.println("Igrese el valor 2: ");
        System.out.print("-> ");
        int val2 = entrada.nextInt();
        POOb valores = new POOb(val1, val2);
        System.out.println("");
        valores.imprimir();

    }
}
