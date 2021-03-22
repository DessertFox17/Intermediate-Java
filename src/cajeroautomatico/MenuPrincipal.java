package cajeroautomatico;


public class MenuPrincipal {


    public void MenuP() {

        Consultar mensajeroview = new Consultar();
        Depositar mensajeropluss = new Depositar();
        Retirar mensajeroless = new Retirar();

        do {
            mensajeroless.Menuopciones();

            switch (mensajeroless.opcion) {

                case 1:
                    mensajeroview.Movimientos();
                    break;
                case 2:
                    mensajeroless.Movimientos();
                    break;
                case 3:
                    mensajeropluss.Movimientos();
                    break;
                case 4:
                    mensajeroless.Salir();
                    break;
                default:
                    mensajeroless.Error();
                    break;
            }


        } while (mensajeroless.continuar == true);

    }

}
