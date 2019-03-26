import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numFuncionario = input.nextInt();
		int horasTrabalhadas = input.nextInt();
		double valorHoraTrabalhada = input.nextDouble();
		double salario = valorHoraTrabalhada * horasTrabalhadas;
		System.out.println("NUMBER = " + numFuncionario);
		System.out.println(String.format("SALARY = U$ %.2f", salario));
	}
}
