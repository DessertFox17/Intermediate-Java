package com.main;

import java.util.Scanner;
import lavadoras.LavadoraUno;
import poobj.POOmain;
import usothis.ARmain;
import usogetset.modLavadorasamsung;

public class Main {

    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String resp;
        int caso;

        do {
            System.out.println();
            System.out.println("Prácticas Curso de programación en java Intermedio");
            System.out.println();
            System.out.println("Seleccione la práctica que desea ver: ");
            System.out.println("1.Probando tu lógica de programación");
            System.out.println("2.Palabras reservadas en Java");
            System.out.println("3.Comentarios");
            System.out.println("4.POO+");
            System.out.println("5.Uso de la palabra reservada this");
            System.out.println("6.Uso del encapsulamiento");
            System.out.println("7.Uso de los métodos getter y setter");
            System.out.print("-> ");
            caso = teclado1.nextInt();

            switch (caso) {

                case 1:
                    System.out.println("Probando tu lógica de programación");
                    ProbandoLogica A = new ProbandoLogica();
                    A.Xl();
                    break;

                case 2:
                    System.out.println("Palabras reservadas en Java");
                    PalabrasReservadas B = new PalabrasReservadas();
                    B.Palabras();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Cometarios");
                    System.out.println();
                    Comentarios C = new Comentarios();
                    C.Comments();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("POO+");
                    System.out.println();
                    POOmain D = new POOmain();
                    D.POOm();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Uso de la palabra reservada this");
                    System.out.println();
                    ARmain E = new ARmain();
                    E.armaina();
                    break;


                case 6:
                    System.out.println();
                    System.out.println("Uso del encapsulamiento");
                    LavadoraUno F = new LavadoraUno();
                    System.out.println();
                    F.LavadoraDatos();
                    break;

                case 7:
                    System.out.println();
                    System.out.println("Uso de los métodos getter y setter");
                    modLavadorasamsung G = new modLavadorasamsung();
                    System.out.println();
                    G.LavadoraDatosmod();
                    break;


                default:
                    System.out.println();
                    System.out.println("Opción inválida");
                    break;

            }

            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println();
            System.out.println("¿Desea continuar?");
            System.out.println("S - Continuar / N - Salir");
            System.out.print("-> ");
            resp = teclado2.nextLine();

        } while (resp.equals("S") || resp.equals("s"));
    }
}
