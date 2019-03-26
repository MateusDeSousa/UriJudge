import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner imput = new Scanner(System.in);
		int tempoGasto = imput.nextInt();
		int velocidadeMedia = imput.nextInt();
		double consumoCarro = 12.0;
		int distanciaPercorrida = tempoGasto * velocidadeMedia;
		double combustivelNecessario = distanciaPercorrida / consumoCarro;
		System.out.println(String.format("%.3f", combustivelNecessario));
    }
 
}