package constructor;

import java.util.Scanner;

public class conContructor {

    private Scanner entradac = new Scanner(System.in);
    String nombre = "";

    public conContructor() {

        System.out.println("Ingrese su nombre: ");
        System.out.print("-> ");
        nombre = entradac.nextLine();
        System.out.println();
        System.out.println("Usted ingresó: " + nombre);
        System.out.println();


    }

}
