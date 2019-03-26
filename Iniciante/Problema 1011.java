import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double raioEsfera = input.nextDouble();
		double PI = 3.14159;
		double volumeEsfera = (4/3.0) * PI * Math.pow(raioEsfera, 3);
		System.out.println(String.format("VOLUME = %.3f", volumeEsfera));
	}
}
