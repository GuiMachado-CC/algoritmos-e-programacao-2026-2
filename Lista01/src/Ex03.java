import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int resultado;

        System.out.println("Idade em meses");

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        resultado = idade * 12;

        System.out.println("Resultado: " + resultado);


    }
}