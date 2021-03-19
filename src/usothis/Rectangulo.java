package usothis;

public class Rectangulo {

    private int base, altura, area;

    public Rectangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

    }

    public void CalculoArea(){

        area = (base/2)*altura;

    }

    public void Imprimir(){

        CalculoArea();
        System.out.println("");
        System.out.println("El área del trinagulo es: " + area);
    }

}
