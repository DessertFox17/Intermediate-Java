package com.company;

import java.util.Scanner;

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
            System.out.print("-> ");
            caso = teclado1.nextInt();

            switch (caso) {

                case 1:

                    System.out.println("");
                    System.out.println("Probando tu lógica de programación");
                    System.out.println("");
                    ProbandoLogica A = new ProbandoLogica();
                    A.Xl();
                    System.out.println("");
                    System.out.println("--------------------------------------");
                    System.out.println("");

                    break;

                case 2:

                    System.out.println("");
                    System.out.println("Palabras reservadas en Java");
                    System.out.println("");
                    PalabrasReservadas B = new PalabrasReservadas();
                    B.Palabras();
                    System.out.println("");
                    System.out.println("--------------------------------------");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("");
                    System.out.println("Cometarios");
                    System.out.println("");
                    Comentarios C = new Comentarios();
                    C.Comments();
                    System.out.println("");
                    System.out.println("--------------------------------------");
                    System.out.println("");
                    break;

                default:

                    System.out.println("");
                    System.out.println("Opción inválida");
                    System.out.println("--------------------------------------");
                    System.out.println("");
                    break;

            }

            resp = "No";
            System.out.println("");
            System.out.println("¿Desea continuar?");
            System.out.println("Si/Continuar  No/Salir");
            System.out.print("-> ");
            resp = teclado2.nextLine();

        }while(resp.equals("Si")||resp.equals("si"));



    }
}
