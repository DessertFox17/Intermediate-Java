package ambitodevariables;

public class AVmain {

    public void VMain(){
        int par = 10;
        System.out.println("El valor de la variable estática es: " + VariablesEstaticas.variableEstatica);
        VariablesGlobales Vglobal= new VariablesGlobales();
        System.out.println("El valor d ela variable global es: "+Vglobal.variableGlobal);
        VariablesLocales Vlocal = new VariablesLocales();
        Vlocal.miMetodo(10);
    }
}
