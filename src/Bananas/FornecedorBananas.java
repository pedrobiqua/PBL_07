package Bananas;
import java.util.Random;
import Ceasa.Ceasa;

public class FornecedorBananas extends Thread {
    private Ceasa buffer;
	private Random aleatorio;
	
	public FornecedorBananas(Ceasa buffer)
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
				buffer.insere_bananas( dado );
				int tempo = aleatorio.nextInt(500);
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
    }
}
