package com.main;

import java.util.Scanner;

import ambitodevariables.AVmain;
import cajeroautomatico.MenuPrincipal;
import estadoshilo.Cprinpal;
import excepciones.ClaseDivision;
import hilos.CPrincipal;
import hilosconparametros.ClasePpal;
import lavadoras.LavadoraUno;
import modificadorprivate.JavaTres;
import palabrarsuper.Clasemain;
import polimorfismo.PolimorfismoMain;
import poobj.POOmain;
import sincronizacionhilos.Schilosmain;
import usothis.ARmain;
import usogetset.modLavadorasamsung;
import modificadordefault.JavaUno;
import modificadorpublic.JavaDos;
import modificadorprivate.JavaTres;
import modificadorprotected.JavaCuatro;
import herenciamain.HerenciaMain;

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
            System.out.println("8.Uso del modificador de acceso por defecto o default");
            System.out.println("9.Uso del modificador de acceso public");
            System.out.println("10.Uso del modificador de acceso private");
            System.out.println("11.Uso del modificador de acceso protected");
            System.out.println("12.Uso de la herencia");
            System.out.println("13.Uso del polimorfismo");
            System.out.println("14.Uso de la palabra reservada Super");
            System.out.println("15.Uso del ámbito de las variables");
            System.out.println("16.Ejercicio práctico Cajero Automático");
            System.out.println("17.Exepciones try-catch-finally");
            System.out.println("18.Hilos");
            System.out.println("19.Hilos con parámetros");
            System.out.println("20.Estados de un hilo");
            System.out.println("21.Sincronización de hilos");
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

                case 8:
                    System.out.println();
                    System.out.println("Modificador de acceso por defecto o default");
                    JavaUno H = new JavaUno();
                    System.out.println();
                    H.funcion();
                    break;

                case 9:
                    System.out.println();
                    System.out.println("Modificador de acceso public");
                    JavaDos I = new JavaDos();
                    System.out.println();
                    I.funcionpublic();
                    break;

                case 10:
                    System.out.println();
                    System.out.println("Modificador de acceso private");
                    JavaTres J = new JavaTres();
                    System.out.println();
                    J.funcionprivate();
                    break;

                case 11:
                    System.out.println();
                    System.out.println("Modificador de acceso protected");
                    JavaCuatro K = new JavaCuatro();
                    System.out.println();
                    K.funcionprotected();
                    break;

                case 12:
                    System.out.println();
                    System.out.println("Herencia");
                    HerenciaMain L = new HerenciaMain();
                    System.out.println();
                    L.SumaResta();
                    break;

                case 13:
                    System.out.println();
                    System.out.println("Polimorfismo");
                    PolimorfismoMain M = new PolimorfismoMain();
                    System.out.println();
                    M.Polimain();
                    break;

                case 14:
                    System.out.println();
                    System.out.println("Palabra reservada Super");
                    Clasemain N = new Clasemain();
                    System.out.println();
                    N.Principal();
                    break;

                case 15:
                    System.out.println();
                    System.out.println("Ámbito de variables");
                    AVmain O = new AVmain();
                    System.out.println();
                    O.VMain();
                    break;

                case 16:
                    System.out.println();
                    System.out.println("Ejercicio práctico Cajero automático");
                    MenuPrincipal P = new MenuPrincipal();
                    System.out.println();
                    P.MenuP();
                    break;

                case 17:
                    System.out.println();
                    System.out.println("Excepciones try - catch - end");
                    ClaseDivision Q = new ClaseDivision();
                    System.out.println();
                    Q.principal();
                    break;

                case 18:
                    System.out.println();
                    System.out.println("Hilos");
                    CPrincipal R = new CPrincipal();
                    System.out.println();
                    R.Cppal();
                    break;

                case 19:
                    System.out.println();
                    System.out.println("Hilos con parámetros");
                    ClasePpal S = new ClasePpal();
                    System.out.println();
                    S.MMain();
                    break;

                case 20:
                    System.out.println();
                    System.out.println("Sincronización de hilos");
                    Cprinpal T = new Cprinpal();
                    System.out.println();
                    T.PPalh();
                    break;

                case 21:
                    System.out.println();
                    System.out.println("Estados de un hilo");
                    Schilosmain U = new Schilosmain();
                    System.out.println();
                    U.SCronhilos();
                    break;

                default:
                    System.out.println();
                    System.out.println("Opción inválida");
                    break;

            }
            System.out.println("----------------------------------------");
            System.out.println();
            System.out.println("   ¿Desea continuar?");
            System.out.println("S - Continuar / N - Salir");
            System.out.print("-> ");
            resp = teclado2.nextLine();

        } while (resp.equals("S") || resp.equals("s"));
    }
}
