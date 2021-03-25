package sumarestamatrices;

public class ClasPpal {

    public void SumaRestaMatrices() {

        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizresutsuma[][] = new int[3][3];
        int matrizresutresta[][] = new int[3][3];
        //Llenado de la primer matríz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * 5 + 0);
            }
        }
        //Llenado de la segunda matríz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random() * 5 + 0);
            }
        }
        //Suma de matrices
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizresutsuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        //Resta de matrices
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizresutresta[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        //Imprimiendo la smatrices de suma
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }

            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < matrizresutsuma.length; j++) {
                System.out.print("[" + matrizresutsuma[i][j] + "]");
            }

            System.out.println();
        }

        System.out.println();

        //Resta de matrices
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            if (i == 1) {
                System.out.print(" - ");
            } else {
                System.out.print("   ");
            }

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }

            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            for (int j = 0; j < matrizresutresta.length; j++) {
                System.out.print("[" + matrizresutresta[i][j] + "]");
            }

            System.out.println();
        }

        System.out.println();

    }
}
