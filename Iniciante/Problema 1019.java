import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] tempo = new int[3];
        int[] divisao = {3600, 60, 1};
        for(int i = 0; i < 3; i++){
            tempo[i] = N/divisao[i];
            N = N - (tempo[i] * divisao[i]);
        } 
        System.out.println(tempo[0] + ":" + tempo[1] + ":" + tempo[2]);
    }
 
}