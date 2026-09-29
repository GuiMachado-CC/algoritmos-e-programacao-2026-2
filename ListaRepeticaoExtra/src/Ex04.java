import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double paisA = 80000;
        double paisB = 200000;
        int ano = 0;
        double diferenca;

        while(paisA <= paisB){
//            System.out.println("Digite quantos anos:");
//            ano = input.nextInt();

                paisA *= 1.03;
                paisB *= 1.015;
                ano ++;

        }

        diferenca = paisA - paisB;

    System.out.println("País A passou com " + diferenca + " a mais que País B em " + ano + " anos");




    }
}
