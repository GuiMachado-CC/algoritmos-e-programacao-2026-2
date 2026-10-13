import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        double[] numeros = new double[5];

        System.out.println("Segunda-Feira: ");
        numeros[0] = input.nextDouble();
        System.out.println("Terça-Feira: ");
        numeros[1] = input.nextDouble();
        System.out.println("Quarta-Feira: ");
        numeros[2] = input.nextDouble();
        System.out.println("Quinta-Feira: ");
        numeros[3] = input.nextDouble();
        System.out.println("Sexta-Feira: ");
        numeros[4] = input.nextDouble();

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        media = soma / numeros.length;

        System.out.println("Média da temperatura: " + media);

        if (numeros[0] > media) {
            System.out.println("Segunda-Feira aciama da média");
        }

        if (numeros[0] > media) {
            System.out.println("Segunda-Feira acima da média");
        }

        if (numeros[1] > media) {
            System.out.println("Terça-Feira acima da média");
        }

        if (numeros[2] > media) {
            System.out.println("Quarta-Feira acima da média");
        }

        if (numeros[3] > media) {
            System.out.println("Quinta-Feira acima da média");
        }

        if (numeros[4] > media) {
            System.out.println("Sexta-Feira acima da média");
        }



    }
}