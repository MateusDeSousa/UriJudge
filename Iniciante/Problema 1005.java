import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double notaA = input.nextDouble();
		double notaB = input.nextDouble();
		double media = ((notaA * 3.5) + (notaB * 7.5))/11;
		System.out.println(String.format("MEDIA = %.5f", media));
	}
}
