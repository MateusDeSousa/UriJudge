import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int distanciaPercorrida = input.nextInt();
		double combGasto = input.nextDouble();
		double consumo = distanciaPercorrida / combGasto;

		System.out.println(String.format("%.3f km/l", consumo));
	}
}
