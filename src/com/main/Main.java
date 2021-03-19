package com.main;

import java.util.Scanner;

import lavadoras.LavadoraUno;
import poobj.POOmain;
import usothis.ARmain;

public class Main {

    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String resp = "Si";
        int caso = 0;

        do {
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("Prácticas Curso de programación en java Intermedio");
            System.out.println("--------------------------------------------------");
            System.out.println("");
            System.out.println("Seleccione la práctica que desea ver: ");
            System.out.println("");
            System.out.println("1.Probando tu lógica de programación");
            System.out.println("2.Palabras reservadas en Java");
            System.out.println("3.Comentarios");
            System.out.println("4.POO+");
            System.out.println("5.Uso de la palabra reservada this");
            System.out.println("6.Uso del encapsulamiento");
            System.out.print("-> ");
            caso = teclado1.nextInt();

            switch (caso) {

                case 1:
                    System.out.println("");
                    System.out.println("Probando tu lógica de programación");
                    System.out.println("");
                    ProbandoLogica A = new ProbandoLogica();
                    A.Xl();
<<<<<<< HEAD

=======
>>>>>>> be51987 (NewVlog about encapsulation, classes of encapsulation were created and added to the main switch-case structure, one mistake was notified, I was working on the master branch, this is pendiente to be corrected)
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Palabras reservadas en Java");
                    System.out.println("");
                    PalabrasReservadas B = new PalabrasReservadas();
                    B.Palabras();
<<<<<<< HEAD

=======
>>>>>>> be51987 (NewVlog about encapsulation, classes of encapsulation were created and added to the main switch-case structure, one mistake was notified, I was working on the master branch, this is pendiente to be corrected)
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Cometarios");
                    System.out.println("");
                    Comentarios C = new Comentarios();
                    C.Comments();
<<<<<<< HEAD

=======
>>>>>>> be51987 (NewVlog about encapsulation, classes of encapsulation were created and added to the main switch-case structure, one mistake was notified, I was working on the master branch, this is pendiente to be corrected)
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("POO+");
                    System.out.println("");
                    POOmain D = new POOmain();
                    D.POOm();
<<<<<<< HEAD

=======
>>>>>>> be51987 (NewVlog about encapsulation, classes of encapsulation were created and added to the main switch-case structure, one mistake was notified, I was working on the master branch, this is pendiente to be corrected)
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Uso de la palabra reservada this");
                    System.out.println("");
                    ARmain E = new ARmain();
                    E.armaina();
<<<<<<< HEAD

=======
                    break;

                case 6:
                    System.out.println("");
                    System.out.println("Uso del encapsulamiento");
                    System.out.println("");
                    LavadoraUno F = new LavadoraUno();
                    F.LavadoraDatos();
>>>>>>> be51987 (NewVlog about encapsulation, classes of encapsulation were created and added to the main switch-case structure, one mistake was notified, I was working on the master branch, this is pendiente to be corrected)
                    break;

                default:
                    System.out.println("");
                    System.out.println("Opción inválida");
<<<<<<< HEAD

=======
>>>>>>> be51987 (NewVlog about encapsulation, classes of encapsulation were created and added to the main switch-case structure, one mistake was notified, I was working on the master branch, this is pendiente to be corrected)
                    break;

            }

            resp = "No";
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("¿Desea continuar?");
            System.out.println("Si/Continuar  No/Salir");
            System.out.print("-> ");
            resp = teclado2.nextLine();

        } while (resp.equals("Si") || resp.equals("si"));


    }
}
