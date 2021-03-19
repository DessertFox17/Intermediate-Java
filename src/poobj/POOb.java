package poobj;

public class POOb {

    private int v1, v2, result;

    public POOb(int val1, int val2) {

       this.v1 = val1;
       this.v2 = val2;

    }

    public void Operacion (){

        result = v1 + v2;

    }

    public void imprimir(){

        Operacion();
        System.out.println("El resultado de la suma es: " + result);

    }
}
