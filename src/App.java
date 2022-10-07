import Ceasa.Ceasa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("PBL_07 - Ceasa");
        System.out.println("Alunos: Pedro B., Lukas J., Lucas K., Thiago K.");

        // Adicionei no buffer 1000 de espaço.
        Ceasa ceasa = new Ceasa( 1000 , 1000);
		Gerador gerador = new Gerador(ceasa);

        gerador.start();
    }
}
