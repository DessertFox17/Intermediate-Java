package modificadorprivate;

public class AtributosMetodosprivate {

    private int val1=7;
    private int val2=8;
    private int val3=9;//modificador de acceso private

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal3() {
        return val3;
    }

    public void setVal3(int val3) {
        this.val3 = val3;
    }

    /*
     *Estos valores que acabamps de declarar con modificador de acceso private
     *solo pueden ser accedidos a través de métodos get y set.
     */

}