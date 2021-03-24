package multiplicacionmatrices;

public class Multiplicacion {

    int matr1[][] = new int[2][3], matr2[][] = new int[3][2], matrresult[][] = new int[2][2];


    //Llenado de las matrices en el constructor de la clase
    public Multiplicacion() {
        //Matriz 1 dimesiones 2x3
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matr1[i][j] = (int) (Math.random() * 5 + 0);
            }
        }
        //Matriz 2 dimesiones 3x2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matr2[i][j] = (int) (Math.random() * 5 + 0);
            }
        }
    }

    public void imprimirMatrices() {
        //Matriz 1
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matr1[i][j] + "]");
                }
                if (i == 1) {
                    System.out.print(" x ");
                } else {
                    System.out.print("   ");
                }

            } else {
                System.out.print("            ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matr2[i][j] + "]");
            }

            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + matrresult[i][j] + "]");
                }
            }
            System.out.println();
        }
    }

    public void multip() {
        for (int i = 0; i < 4; i++) {

            if (matrresult[0][0] == 0) {
                int tempo = (matr1[0][0] * matr2[0][0]) + (matr1[0][1] * matr2[1][0]) + (matr1[0][2] * matr2[2][0]);
                matrresult[0][0] = tempo;
            } else if (matrresult[0][1] == 0) {
                int tempo = (matr1[0][0] * matr2[0][1]) + (matr1[0][1] * matr2[1][1]) + (matr1[0][2] * matr2[2][1]);
                matrresult[0][1] = tempo;
            } else if (matrresult[1][0] == 0) {
                int tempo = (matr1[1][0] * matr2[0][0]) + (matr1[1][1] * matr2[1][0]) + (matr1[1][2] * matr2[2][0]);
                matrresult[1][0] = tempo;
            } else if (matrresult[1][1] == 0) {
                int tempo = (matr1[1][0] * matr2[0][1]) + (matr1[1][1] * matr2[1][1]) + (matr1[1][2] * matr2[2][1]);
                matrresult[1][1] = tempo;
            }
        }
    }

    public void Calcuar(){
        multip();
        imprimirMatrices();
    }
}
