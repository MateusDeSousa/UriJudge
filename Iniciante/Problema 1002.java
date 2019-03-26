import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
double Raio = in.nextDouble();
double Area = 3.14159 * Math.pow(Raio,2);
System.out.println(String.format("A=%.4f",Area));
}
}