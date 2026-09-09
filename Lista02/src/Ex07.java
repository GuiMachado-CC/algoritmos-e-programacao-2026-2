import java.util.Objects;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double renda;
        double prestacao;
        double limitePrestacao;
        String termos;

        System.out.println("Vizualizar termos");
        System.out.println("Digite 1 para visualizar termos: ");
        System.out.println("Digite qualquer tecla para pular termos: \n");
        termos = input.nextLine();

        if (Objects.equals(termos, "1")){
            System.out.println("O valor da prestação não pode ultrapassar 30% da sua renda mensal.\n" +
                    "Além disso, se a prestação for muito alta (mais de R$ 3.000,00), também exigir que a renda mensal seja pelo menos R$ 10.000,00.\n");
        }else{
            System.out.println("Sem termos\n");
        }

        System.out.println("Verificação de elegibilidade para financiamento bancário\n");

        System.out.println("Digite o renda: ");
        renda = input.nextDouble();

        System.out.println("Digite a prestação desejada (%): ");
        prestacao = input.nextDouble();

        limitePrestacao = renda * 0.3;

        if (prestacao > 30){
            System.out.println("Financiamento negado por alta prestação");
        } else if (prestacao > limitePrestacao && renda < 10000){
            System.out.println("Financiamento negado por baixa renda");
        } else if (prestacao > limitePrestacao && renda >= 10000) {
            System.out.println("Financiamento aprovado");
        } else {
            System.out.println("Financiamento aprovado");
        }

    }
}