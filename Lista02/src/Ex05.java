import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius;
        double opcoes;
        double conversao;

        System.out.println("Conversor de Unidades de Temperatura\n");
        System.out.println("Digite uma temperatura em Celcius:");
        celcius = input.nextDouble();

        System.out.println("Tecle 1 para converter para Fahrenheit");
        System.out.println("Tecle 2 para converter para Kelvin");
        opcoes = input.nextDouble();

        if(opcoes == 1) {
            conversao = celcius * 1.8 + 32;
            System.out.println("Fahrenheit = " + conversao);
        } else if(opcoes == 2) {
            conversao = celcius  + 273.15;
            System.out.println("Kelvin = " + conversao);
        } else {
            System.out.println("Opção inválida");
        }
    }
}