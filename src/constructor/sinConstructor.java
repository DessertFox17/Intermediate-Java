package constructor;

import java.util.Scanner;

public class sinConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";

    public void Pedirdatos(){
        System.out.println("Ingrese su nombre: ");
        System.out.print("-> ");
        nombre = entrada.nextLine();
        System.out.println();

    }

    public void imprimir(){
        System.out.println("Usted ingresó: " + nombre);
        System.out.println();
    }
}
