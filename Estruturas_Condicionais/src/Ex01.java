import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if(numero > 0) {
            System.out.println("O número é positivo!");
        } else if (numero < 0) {
            System.out.println("O número é negativo!");
        } else {
            System.out.println("O número é nulo!");
        }

    }
}