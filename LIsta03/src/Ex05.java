import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num = input.nextInt();

        System.out.println("Tabuada de 1 a 10 do número escolhido: ");

        for(int i=1; i<=10; i++){
            System.out.println(i * num);
        }

    }
}