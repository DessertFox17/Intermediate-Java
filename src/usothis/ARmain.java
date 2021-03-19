package usothis;

import java.util.Scanner;

public class ARmain {

    public void armaina() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la base");
        System.out.print("-> ");
        int base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura");
        System.out.print("-> ");
        int altura = entrada.nextInt();

        Rectangulo mensajero = new Rectangulo(base, altura);

        mensajero.Imprimir();

    }
}
