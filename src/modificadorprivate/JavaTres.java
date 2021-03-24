package modificadorprivate;

public class JavaTres {

    private int val1 = 0, val2 = 0, val3 = 0;

    public void funcionprivate() {

        AtributosMetodosprivate mensajero = new AtributosMetodosprivate();

        mensajero.setVal1(30);
        mensajero.setVal2(35);
        mensajero.setVal3(40);
        this.val1 = mensajero.getVal1();
        this.val2 = mensajero.getVal2();
        this.val3 = mensajero.getVal3();

        System.out.println("El valor uno es: " + val1);
        System.out.println("El valor dos es: " + val2);
        System.out.println("El valor tres es: " + val3);

    }
}