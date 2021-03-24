package lavadoras;

import llfunciones.LLFunciones;
import java.util.Scanner;

public class LavadoraUno {

    public void LavadoraDatos() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de ropa");
        System.out.println("Presiona: 1 - Blanca / 2 - Color");
        System.out.print("-> ");
        int tipoRopa = entrada.nextInt();
        System.out.println("¿Cuantos kilos de ropa desea lavar?");
        System.out.print("-> ");
        int kilos = entrada.nextInt();
        System.out.println();
        LLFunciones mensajero = new LLFunciones(kilos,tipoRopa);

        mensajero.CicloFinalizado();
    }
}
