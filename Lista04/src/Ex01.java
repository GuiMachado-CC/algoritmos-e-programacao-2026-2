import java.util.Scanner;

public class
Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        long fatorial = 1;

        System.out.println("Digite um numero inteiro: ");
        x = input.nextInt();

        System.out.println("Fatorial: ");

        for (int i = x; i >= 1; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado:");
        System.out.println(fatorial);
    }
}
