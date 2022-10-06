import Bananas.CompradorBananas;
import Bananas.FornecedorBananas;
import Ceasa.Ceasa;
import Macas.FornecedorMacas;
import Macas.CompradorMacas;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Adicionei no buffer 1000 de espaço.
        Ceasa ceasa = new Ceasa( 1000 , 1000);
		FornecedorBananas FB1 = new FornecedorBananas( ceasa );
		CompradorBananas CB1 = new CompradorBananas( ceasa );

        FornecedorMacas FA1 = new FornecedorMacas( ceasa );
        CompradorMacas CA1 = new CompradorMacas( ceasa );
		FB1.start();
        FA1.start();
		CB1.start();
        CA1.start();
    }
}
