package clasemath;

import java.util.Scanner;

public class Conversiones {

    public void Conv(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        //Deg to Rad
        //Solicitud de datos
        System.out.println("Ingrese el valor del ángulo en °: ");
        System.out.print("-> ");
        double angulodg1 = entrada.nextDouble();
        //Conversión
        double angulorad1 = Math.toRadians(angulodg1);
        System.out.println();
        System.out.println("El angulo en radianes es: " + angulorad1 + " rad");
        System.out.println();

        //Rad to Deg
        //Solicitud de datos
        System.out.println("Ingrese el valor del ángulo en rad: ");
        System.out.print("-> ");
        double angulorad2 = entrada.nextDouble();
        //Conversión
        double angulodg2 = Math.toDegrees(angulorad2);
        System.out.println();
        System.out.println("El angulo en ° es: " + angulodg2 + " °");
        System.out.println();
    }
}
