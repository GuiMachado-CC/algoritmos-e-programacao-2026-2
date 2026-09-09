import  java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int quadrado;
        int cubo;

        System.out.println("Análise de Número Inteiro: Paridade, Quadrado e Cubo");

        System.out.println("Insira um número inteiro: ");
        numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número escolhido é par!");
        } else {
            System.out.println("O número escohido é ímpar!");
        }

        quadrado = numero * numero;
        cubo = numero * numero * numero;

        System.out.println("O quadrado do numero escolhido é: " + quadrado);
        System.out.println("O cubo do número escolhido é: " + cubo);

    }
}