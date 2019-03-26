import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double areaTriangulo = (A * C)/2;
		double areaCirculo = 3.14159 * Math.pow(C, 2);
		double areaTrapezio = ((B + A) * C)/2;
		double areaQuadrado = Math.pow(B, 2);
		double areaRetangulo = A * B;

		System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
		System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
		System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
		System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
		System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));
	}
}
