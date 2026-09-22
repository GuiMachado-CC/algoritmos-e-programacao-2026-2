import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valor = 0;
        float soma = 0;
        int quant = 0;
        float maior = 0;
        float menor = 0;

        System.out.println(" Estatísticas de coleta e maior/menor valor");
        System.out.println("Digite um número negativo para encerrar o programa");


        while (valor >= 0) {
            System.out.println("Digite o valor da doação (R$): ");
            valor = input.nextFloat();

            if (valor >= 0) {
                soma += valor;
                quant++;

                if (quant == 1) {
                    maior = valor;
                    menor = valor;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                }
            }

            System.out.println("Quantidade de doações: " + quant);
            System.out.println("Valor total arrecadado: " + soma);
            System.out.println("Maior valor doado: " + maior);
            System.out.println("Menor valor doado: " + menor);

        }
    }
}
