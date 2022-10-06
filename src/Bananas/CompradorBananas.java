package Bananas;
import java.util.Random;
import Ceasa.Ceasa;

public class CompradorBananas extends Thread {
    private Ceasa buffer;
	private Random aleatorio;
	
	public CompradorBananas(Ceasa buffer)
	{
		this.buffer = buffer;
		aleatorio = new Random();
	}

    @Override
    public void run() {

        while (true) {
            try {
                int dado = aleatorio.nextInt(50);
                buffer.retira_bananas(dado);
                int tempo = aleatorio.nextInt(1000);
                Thread.sleep(tempo);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
