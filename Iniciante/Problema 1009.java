import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String nomeVendedor = input.nextLine();
		double salarioFixo = input.nextDouble();
		double valorTotalVendas = input.nextDouble();
		double salarioMaisComissao = salarioFixo + valorTotalVendas * 0.15;		
		System.out.println(String.format("TOTAL = R$ %.2f", salarioMaisComissao));
	}
}
