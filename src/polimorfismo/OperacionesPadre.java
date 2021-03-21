package polimorfismo;

import java.util.Scanner;

public abstract class OperacionesPadre {

    protected int val1, val2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {
        System.out.println("Ingrese el primer valor: ");
        System.out.print("-> ");
        val1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        System.out.print("-> ");
        val2 = entrada.nextInt();
    }

    /*
     *Este método será el que lleve el polimorfismo,
     *Si este método se comunica con la clase HijaSuma, deberá sumar.
     *Si se comunica con la clase HijaResta, deberá restar.
     */

    public abstract void Operaciones();

    public void MostrarResultado(){
        System.out.println();
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
