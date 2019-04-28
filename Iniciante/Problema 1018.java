import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(N);
        int[] notas = new int[7];
        int[] valores = {100, 50, 20, 10, 5, 2, 1};
        for(int i = 0; i <= 6; i++){
            notas[i] = N/valores[i];
            N = N - (notas[i] * valores[i]);
            System.out.println(notas[i] + " nota(s) de R$ " + valores[i] + ",00");
        } 
    }
 
}