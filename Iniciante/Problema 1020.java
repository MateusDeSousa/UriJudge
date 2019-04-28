import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] tempo = new int[3];
        int[] divisao = {365, 30, 1};
        for(int i = 0; i < 3; i++){
            tempo[i] = N/divisao[i];
            N = N - (tempo[i] * divisao[i]);
        } 
        System.out.println(tempo[0] + " ano(s)");
        System.out.println(tempo[1] + " mes(es)");
        System.out.println(tempo[2] + " dia(s)");
    }
 
}