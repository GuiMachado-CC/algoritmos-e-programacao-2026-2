import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] palpites = new int[100];

        int numeroSecreto = 22;
        int numero = 0;
        int contador = 0;


        while (numero != numeroSecreto) {
            contador++;

            System.out.println("Digite um numero: ");
            numero = input.nextInt();

            palpites[contador] = numero;

            if (numero != numeroSecreto) {
                if (numero < numeroSecreto){
                    System.out.println("Maior");
                } else {
                    System.out.println("Menor");
                }
            }
        }
        System.out.println("Parabéns, você adivinhou! O número secreto é 22!");
        System.out.println("");

        System.out.println("Tentativas: " + contador);
        System.out.println("");

        System.out.println("Palpites: ");
        for (int i = 1; i <= contador; i++) {
            System.out.println(palpites[i]);
        }

    }
}
