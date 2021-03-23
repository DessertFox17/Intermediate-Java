package clasemath;

import java.util.Scanner;

public class FuncionesTrigonometricas {

    Scanner entrada = new Scanner(System.in);
    double angulodg, sindg, cosdg, tandg, asindg, acosdg, atandg;

    public void Funciones() {
        System.out.println("Ingrese un angulo en °: ");
        System.out.print("-> ");
        angulodg = entrada.nextDouble();
        System.out.println();
        sindg = Math.sin(angulodg);
        cosdg = Math.cos(angulodg);
        tandg = Math.tan(angulodg);
        asindg = Math.asin(angulodg);
        acosdg = Math.acos(angulodg);
        atandg = Math.atan(angulodg);
        System.out.println("El seno del ángulo " + angulodg + "° es: " + sindg);
        System.out.println("El coseno del ángulo " + angulodg + "° es: " + cosdg);
        System.out.println("La tangente del ángulo " + angulodg + "° es: " + tandg);
        System.out.println();
        System.out.println("El arco seno del ángulo " + angulodg + "° es: " + asindg);
        System.out.println("El arco coseno del ángulo " + angulodg + "° es: " + acosdg);
        System.out.println("La arco tangente del ángulo " + angulodg + "° es: " + atandg);
    }
}
