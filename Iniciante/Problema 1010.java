import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int codigoPeca1 = input.nextInt();
		int numeroPecas1 = input.nextInt();
		double valorUnitPeca1 = input.nextDouble();

		int codigoPeca2 = input.nextInt();
		int numeroPecas2 = input.nextInt();
		double valorUnitPeca2 = input.nextDouble();

		double precoTotal = (numeroPecas1 * valorUnitPeca1) + (numeroPecas2 * valorUnitPeca2);

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", precoTotal));
	}
}
