package usogetset;


import java.util.Scanner;

public class modLavadorasamsung {

    public void LavadoraDatosmod() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de ropa");
        System.out.println("Presiona: 1 - Blanca / 2 - Color");
        System.out.print("-> ");
        int tipoRopa = entrada.nextInt();
        System.out.println("¿Cuantos kilos de ropa desea lavar?");
        System.out.print("-> ");
        int kilos = entrada.nextInt();
        System.out.println();
        LLFuncionesmod mensajero = new LLFuncionesmod(kilos, tipoRopa);
        mensajero.settipoRopa(2);
        System.out.println("El tipo de ropa es: " + mensajero.gettipoRopa());
        mensajero.CicloFinalizado();
    }
}
