package usogetset;

public class LLFuncionesmod {

    private int kilos = 0;
    private int llenadoComp = 0;
    private int tipoRopa = 0;
    private int lavadoComp = 0;
    private int secadoComp = 0;

    public LLFuncionesmod(int kilos, int tipoRopa) {
        this.setKilos(kilos);
        this.setTipoRopa(tipoRopa);
    }

    private void llenado() {
        if (getKilos() <= 12) {
            System.out.println("Llenando...");
            setLlenadoComp(1);
            System.out.println("Llenado completo");
        } else {
            System.out.println("La carga de ropa excede el límite de 12 Kg");
        }
    }

    private void lavado() {
        llenado();
        if (getLlenadoComp() == 1) {
            if (getTipoRopa() == 1) {
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("Lavando");
                setLavadoComp(1);
            } else if (getTipoRopa() == 2) {
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando");
                setLavadoComp(1);
            } else {
                System.out.println("Tipo de ropa no disponible");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                setLavadoComp(1);
            }
        } else {
            System.out.println("Error");
        }

    }

    private void secado() {
        lavado();
        if (getLlenadoComp() == 1) {
            System.out.println("Secando");
            setSecadoComp(1);
        }
    }

    public void CicloFinalizado() {
        secado();
        if (getSecadoComp() == 1) {
            System.out.println("Tu ropa está lista");
        }

    }

    //Uso de los métodos setter y getter

    public int gettipoRopa() {
        return getTipoRopa();
    }

    public void settipoRopa(int tipoRopa) {
        this.setTipoRopa(tipoRopa);
    }


    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public int getLlenadoComp() {
        return llenadoComp;
    }

    public void setLlenadoComp(int llenadoComp) {
        this.llenadoComp = llenadoComp;
    }

    public int getTipoRopa() {
        return tipoRopa;
    }

    public void setTipoRopa(int tipoRopa) {
        this.tipoRopa = tipoRopa;
    }

    public int getLavadoComp() {
        return lavadoComp;
    }

    public void setLavadoComp(int lavadoComp) {
        this.lavadoComp = lavadoComp;
    }

    public int getSecadoComp() {
        return secadoComp;
    }

    public void setSecadoComp(int secadoComp) {
        this.secadoComp = secadoComp;
    }
}
