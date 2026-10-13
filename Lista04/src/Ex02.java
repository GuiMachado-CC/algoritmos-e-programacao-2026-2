import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;
        int filhos;
        double somaFilhos = 0;
        String encerrar = "";
        double maiorSalario = 0;
        double somaSalario = 0;
        int contadorSalarioMinimo = 0;
        double contadorPopulacao = 0;
        double mediaSalario = 0;
        double mediaFilhos = 0;
        double percentualSalarioMinimo = 0;

        while (!encerrar.equalsIgnoreCase("n")) {

            System.out.println("Tecle \"s\" para continuar \"n\" para encerrar: ");
            encerrar = input.next();


            if (encerrar.equalsIgnoreCase("n")) {
                break;
            }

            contadorPopulacao++;

            System.out.println("Sálario:");
            salario = input.nextDouble();

            somaSalario += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 1621){
                contadorSalarioMinimo++;
        }

            System.out.println("Número de filhos:");
            filhos = input.nextInt();

            somaFilhos += filhos;


        }

        if (encerrar.equals("n")) {

            System.out.println("População: " + (int) contadorPopulacao    );

        mediaSalario = somaSalario / contadorPopulacao;
        System.out.println("Média salarial: " + mediaSalario);

        mediaFilhos = somaFilhos / contadorPopulacao;
        System.out.println("Média de filhos por pessoa: " + mediaFilhos);

        System.out.println("Maior salário: " + maiorSalario);

        percentualSalarioMinimo = (contadorSalarioMinimo / contadorPopulacao) * 100;

        System.out.println("Percentual de salário mínimo: " + percentualSalarioMinimo + "%");

        }
    }
}

