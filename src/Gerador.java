import java.util.Random;

import Bananas.CompradorBananas;
import Bananas.FornecedorBananas;
import Ceasa.Ceasa;
import Macas.CompradorMacas;
import Macas.FornecedorMacas;

public class Gerador extends Thread {
    public int tempo;
    public int dado;
    public Random aleatorio;
    public Ceasa buffer;
    
    public Gerador(Ceasa buffer)
    {
        this.buffer = buffer;
        aleatorio = new Random();
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                // Gera duas threads aleatórias de compradores e fornecedores.
                GeraThreadsCeasa();
                tempo = aleatorio.nextInt(500);
                Thread.sleep(tempo);
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Gera threads aleatórias.
     */
    public void GeraThreadsCeasa() {
        Random aleatorio = new Random();
        int opcoes = aleatorio.nextInt(3);

        if (opcoes == 0) {
            FornecedorMacas fornecedorMacas = new FornecedorMacas(buffer);
            fornecedorMacas.start();
        } else if (opcoes == 1) {
            CompradorMacas compradorMacas = new CompradorMacas(buffer);
            compradorMacas.start();
        } else if (opcoes == 2) {
            FornecedorBananas fornecedorBananas = new FornecedorBananas(buffer);
            fornecedorBananas.start();
        } else if (opcoes == 3) {
            CompradorBananas compradorBananas = new CompradorBananas(buffer);
            compradorBananas.start();
        }

        opcoes = aleatorio.nextInt(3);
        if (opcoes == 0) {
            FornecedorMacas fornecedorMacas = new FornecedorMacas(buffer);
            fornecedorMacas.start();
        } else if (opcoes == 1) {
            CompradorMacas compradorMacas = new CompradorMacas(buffer);
            compradorMacas.start();
        } else if (opcoes == 2) {
            FornecedorBananas fornecedorBananas = new FornecedorBananas(buffer);
            fornecedorBananas.start();
        } else if (opcoes == 3) {
            CompradorBananas compradorBananas = new CompradorBananas(buffer);
            compradorBananas.start();
        }
    }
    
}
