package llfunciones;

public class LLFunciones {

    private int kilos = 0, llenadoComp = 0, tipoRopa = 0, lavadoComp = 0, secadoComp = 0;

    public LLFunciones(int kilos, int tipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }

    private void llenado() {
        if (kilos <= 12) {
            System.out.println("Llenando...");
            llenadoComp = 1;
            System.out.println("Llenado completo");
        } else {
            System.out.println("La carga de ropa excede el límite de 12 Kg");
        }
    }

    private void lavado() {
        llenado();
        if (llenadoComp == 1) {
            if (tipoRopa == 1) {
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("Lavando");
                lavadoComp = 1;
            } else if (tipoRopa == 2) {
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando");
                lavadoComp = 1;
            } else {
                System.out.println("Tipo de ropa no disponible");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                lavadoComp = 1;
            }
        } else {
            System.out.println("Error");
        }

    }

    private void secado() {
        lavado();
        if (llenadoComp == 1) {
            System.out.println("Secando");
            secadoComp = 1;
        }
    }

    public void CicloFinalizado(){
        secado();
        if(secadoComp == 1){
            System.out.println("Tu ropa está lista");
        }
    }
}