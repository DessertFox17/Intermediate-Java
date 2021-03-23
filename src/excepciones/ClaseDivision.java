package excepciones;

import java.util.Scanner;

public class ClaseDivision {

    public void principal() {

        try {
            //En esta parte va el código que se desea ejecutar sin considerar errores
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el valor 1: ");
            System.out.print("-> ");
            int val1 = entrada.nextInt();
            System.out.println("Ingrese el valor 2: ");
            System.out.print("-> ");
            int val2 = entrada.nextInt();
            int result = val1 / val2;
            System.out.println();
            System.out.println("El resultado de la divisón es: " + result);
        } catch (Exception e) {
            //Si se detecta un error inesperado, se ejecuta este bloque de código
            System.out.println();
            System.out.println("Error..." + e);
        } finally {
            //Sin importar que parte del código se ejecuta este se ejecuta al final
            System.out.println("Operación concluida");
        }
    }
}
