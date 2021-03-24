package numerosaleatorios;

public class ClaseunoJava {

    public void C1aleatorio() {
        int aleatorio = 0;

        //(int)(double) casting, ordena a cambiar a otro tipo.
        aleatorio = (int)(Math.random() * 100);//El 100 es el rango máximo
        System.out.println();
        System.out.println(aleatorio);
        System.out.println();
    }
}
