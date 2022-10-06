package Macas;

import java.util.Random;

import Ceasa.Ceasa;

public class FornecedorMacas extends Thread {
    private Ceasa buffer;
	private Random aleatorio;
	
	public FornecedorMacas(Ceasa buffer)
	{
		this.buffer = buffer;
		aleatorio = new Random();
	}

    @Override
    public void run() {
        while (true)
		{
			try {
				int dado = aleatorio.nextInt(10);
				buffer.insere_macas( dado );
				int tempo = aleatorio.nextInt(500);
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
    }
    
}
