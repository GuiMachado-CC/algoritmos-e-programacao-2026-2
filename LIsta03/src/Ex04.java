import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println("Praticando lógica de programação!");
        }


    }
}
