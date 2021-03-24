package modificadordefault;

public class JavaUno {

    public int val1 = 0, val2 = 0, val3 = 0;

    public void funcion(){

        AtributosMetodos mensajero = new AtributosMetodos();
        this.val1 = mensajero.val1;
        this.val2 = mensajero.val2;
        this.val3 = mensajero.val3;

        System.out.println("El valor uno es: " + val1);
        System.out.println("El valor dos es: " + val2);
        System.out.println("El valor tres es: " + val3);

    }

}
