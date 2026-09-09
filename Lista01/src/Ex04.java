import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco;
        double desconto;

        System.out.println("Desconto de 10%");

        System.out.println("Digite o preço do produto");
        preco = input.nextDouble();

        desconto = preco * 0.9;

        System.out.println("Preço com desconto de 10% = " + desconto);
    }
}