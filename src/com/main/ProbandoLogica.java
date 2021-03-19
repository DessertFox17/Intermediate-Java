package com.main;

import java.util.Scanner;

public class ProbandoLogica {

    public void Xl() {

        Scanner teclado = new Scanner(System.in);
        String palabra = "", palabrainv = "";
        int numCad = 0, desde = 0, hasta = 0;

        // write your code here
        System.out.println("-----------------------------");
        System.out.println("         Bienvenido");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("Ingrese una cadena de carácteres: ");
        System.out.print("->");
        palabra = teclado.nextLine();
        System.out.println();

        numCad = palabra.length();

        while (numCad != 0) {

            palabrainv += palabra.substring(numCad - 1, numCad);
            numCad--;

        }

        System.out.println(palabrainv);

    }
}
