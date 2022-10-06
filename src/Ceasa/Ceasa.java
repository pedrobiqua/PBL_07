package Ceasa;

public class Ceasa {
    
    private int NB;
	private int bufferBananas[];
	private int frontBananas = 0;
	private int rearBananas = 0;
	private int countBananas = 0;

    private int NA;
	private int bufferApple[];
	private int frontApple = 0;
	private int rearApple = 0;
	private int countApple = 0;

    public Ceasa(int NB, int NA) {
        this.NB = NB;
        bufferBananas = new int[NB];

        this.NA = NA;
        bufferApple = new int[NA];
    }

    public synchronized void insere_bananas(int dado) throws InterruptedException {
		/* Exemplo do professor
		while ( countBananas == NB ) wait();
		bufferBananas[rearBananas] = dado;
		rearBananas = (rearBananas + 1) % NB;
		countBananas++;
		System.out.println( "Fornece bananas: " + dado + "[" + countBananas + "]" );
		notifyAll();
		*/
		
		while ( countBananas == NB ) wait();
		bufferBananas[rearBananas] = dado;
		rearBananas = (rearBananas + 1) % NB;
		countBananas = countBananas + dado;
		System.out.println( "Fornece bananas: " + dado + "[" + countBananas + "]" );
		notifyAll();


    }

    public synchronized void retira_bananas(int numeroDeFrutas) throws InterruptedException {
		/* Exemplo do professor
		while ( countBananas == 0 ) wait();
		int dado = bufferBananas[frontBananas];
		frontBananas = (frontBananas + 1) % NB;
		countBananas--;
		System.out.println( "Comprando bananas: " + dado + "[" + countBananas + "]" );
		notifyAll();
		*/

		while ( countBananas <= numeroDeFrutas) wait();
		frontBananas = (frontBananas + 1) % NB;
		countBananas = countBananas - numeroDeFrutas;
		System.out.println( "Comprando bananas: " + numeroDeFrutas + "[" + countBananas + "]" );
		notifyAll();

		
    }

    public synchronized void insere_macas(int dado) throws InterruptedException {
		/* Exemplo do professor
		while ( countApple == NA ) wait();
		bufferApple[rearApple] = dado;
		rearApple = (rearApple + 1) % NA;
		countApple++;
		System.out.println( "Fornece macas: " + dado + "[" + countApple + "]" );
		notifyAll(); 
		*/

		while ( countApple == NA ) wait();
		bufferApple[rearApple] = dado;
		rearApple = (rearApple + 1) % NA;
		countApple++;
		System.out.println( "Fornece macas: " + dado + "[" + countApple + "]" );
		notifyAll();
        
    }

    public synchronized void retira_macas(int numeroDeFrutas) throws InterruptedException {
        /* Exemplo do professor
		while ( countApple == 0 ) wait();
		int dado = bufferApple[frontApple];
		frontApple = (frontApple + 1) % NA;
		countApple--;
		System.out.println( "Compra macas: " + dado + "[" + countApple + "]" );
		notifyAll();
		*/

		while ( countApple <= numeroDeFrutas) wait();
		frontApple = (frontApple + 1) % NA;
		countApple = countApple - numeroDeFrutas;
		System.out.println( "Comprando bananas: " + numeroDeFrutas + "[" + countApple + "]" );
		notifyAll();
    }
}
