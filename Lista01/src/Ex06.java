import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salarioAtual;
        float porcentagemDeAumento;
        float diferenca;
        float salarioFinal;

        System.out.println("Aumento salarial");

        System.out.println("Digite o salário atual: ");
        salarioAtual = input.nextFloat();

        System.out.println("Digite a porcentagem de aumento: ");
        porcentagemDeAumento = input.nextFloat();

        salarioFinal = salarioAtual * porcentagemDeAumento;
        diferenca = salarioFinal - salarioAtual;

        System.out.println("O salário aumentou: " + diferenca);
        System.out.println("O salário final com o reajuste: " + salarioFinal);


    }
}