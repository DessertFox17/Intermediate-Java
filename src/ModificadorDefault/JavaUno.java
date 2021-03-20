package ModificadorDefault;

public class JavaUno {

    public int val1 = 1, val2 = 2, val3 = 3;

    public void funcion(){

        AtributosMetodos mensajero = new AtributosMetodos();
        mensajero.val1 = this.val1;
        mensajero.val2 = this.val2;
        mensajero.val3 = this.val3;

        System.out.println("El valor uno es: " + val1);
        System.out.println("El valor dos es: " + val2);
        System.out.println("El valor tres es: " + val3);

    }

}
