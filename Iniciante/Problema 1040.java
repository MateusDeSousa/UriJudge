import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1)/ 10;        
        

        System.out.println("Media: " + df.format(media));
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if(media < 5){
            System.out.println("Aluno reprovado.");
        }else if(media >= 5 && media <= 6.9){
            System.out.println("Aluno em exame.");
            double nExame = input.nextDouble();
            System.out.println("Nota do exame: " + df.format(nExame));
            media = (nExame + media)/2;
            if(media >= 5){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + df.format(media));
            }else if(media < 5){
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + df.format(media));
            }
        }   
    }
}