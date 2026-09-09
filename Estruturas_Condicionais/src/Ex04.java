import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valor;
        double desconto = 0.9;
        double resultado;

        System.out.println("Digite o valor da compra: ");
        valor = input.nextFloat();

        if (valor >= 100) {
            resultado = valor * desconto;
            System.out.println("Desconto disponível");
            System.out.println("Valor com desconto: " + resultado);

        } else{
            System.out.println("Desconto indisponível");
            System.out.println("Valor final: " + valor);
        }

    }
}