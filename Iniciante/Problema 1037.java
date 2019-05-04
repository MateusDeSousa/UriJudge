import java.util.Scanner;
//import java.io.IOException;

public class Main {
 
    public static void main(String[] args) /*throws IOException*/{
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        if ((a <= 25) & (a >= 0)) {
            System.out.println("Intervalo [0,25]");
        }else if((a <= 50) & (a >= 25.01)){
            System.out.println("Intervalo (25,50]");
        }else if((a <= 75) & (a >= 50.01)){
            System.out.println("Intervalo (50,75]");
        }else if ((a <= 100) & (a >= 75.01)) {
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}