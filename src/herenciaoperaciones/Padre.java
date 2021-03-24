package herenciaoperaciones;
import java.util.Scanner;

public class Padre {

    protected int val1,val2,resultado;
    public final String OE = "Fogue";
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.println("Ingrese el primer valor: ");
        System.out.print("-> ");
        val1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        System.out.print("-> ");
        val2 = entrada.nextInt();
    }

    public void MostrarResultado(){
        System.out.println();
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
