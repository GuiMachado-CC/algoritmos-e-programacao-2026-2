import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroUm;
        int numeroDois;
        int numeroTres;
        int resultado;

        System.out.println("Média aritmética de três números");

        System.out.println("Digite o primeiro numero: ");
        numeroUm = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeroDois = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numeroTres = input.nextInt();

        resultado = (numeroUm + numeroDois + numeroTres)/3;

        System.out.println("Resultado: " + resultado);


    }
}