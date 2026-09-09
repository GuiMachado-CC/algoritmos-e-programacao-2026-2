import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura;
        double peso;
        double resultado;

        System.out.println("Cálculo de IMC");

        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();

        System.out.println("Digite o seu peso: ");
        peso = input.nextDouble();

        resultado = peso/(altura*altura);

        System.out.println("Resultado: " + resultado);


    }
}