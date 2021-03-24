package limitardecimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CPrincipal {

    public void LimitDecimls() {

        double num = 2;
        double raiz = Math.sqrt(num);

        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);

        //Clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("La raiz cuadrada de " + num + " es: " + df.format(raiz));
        //String Format
        System.out.println("La raiz cuadrada de " + num + " es: " + String.format("%.3f", raiz));
        //Clase Math.round
        System.out.println("La raiz cuadrada de " + num + " es: " + (double)Math.round(raiz*1000d)/1000);
        //BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de " + num + " es: " + bd.doubleValue());

    }
}
