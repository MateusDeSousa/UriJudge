import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int valor1, valor2, valor3, maior;
		valor1 = input.nextInt();
		valor2 = input.nextInt();
		valor3 = input.nextInt();

		if(valor1 > valor2){
			if(valor1 > valor3){
				maior = valor1;
			}else{
				maior = valor3;
			}
		}else if(valor2 > valor3){
			maior = valor2;
		}else{
			maior = valor3;
		}

		System.out.println(maior + " eh o maior");
	}
}
