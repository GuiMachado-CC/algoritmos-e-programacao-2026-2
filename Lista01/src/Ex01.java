import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero;
        double resultado;

        System.out.println("Multiplicação por dois");

        System.out.println("Digite um numero: ");
        numero = input.nextDouble();

        resultado = numero * 2;

        System.out.println("O resultado é: " + resultado);
    }
}