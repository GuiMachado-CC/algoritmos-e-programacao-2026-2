import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vendas = new double[5];
        double somaVendas = 0;
        double media;
        double diff;
        String[] dias = {"Segunda-Feira: ", "Terça-Feira: ", "Quarta-Feira: ", "Quinta-Feira: ", "Sexta-Feira: "};

        for (int i = 0; i < vendas.length; i++) {
            System.out.println(dias[i]);
            vendas[i] = input.nextDouble();
            somaVendas += vendas[i];
        }
        System.out.println("Faturamento total: " + somaVendas);

        media = somaVendas / vendas.length;
        System.out.println("Média diária de vendas: "+ media);

        for (int i = 0; i < vendas.length; i++){
            if (vendas[i] < media) {
                diff = media - vendas[i];
                System.out.println(dias[i] + " Ficou com " + "R$ " + diff + " abaixo da média");
            }
        }

    }
}
