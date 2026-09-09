import  java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numUm;
        int numDois;
        int numTres;


        System.out.println("Determinação do Maior entre Três Elementos Inteiros\n");

        System.out.println("Digite o primeiro número inteiro: ");
        numUm = input.nextInt();


        System.out.println("Digite o segundo número inteiro: ");
        numDois = input.nextInt();


        System.out.println("Digite o terceiro número inteiro: ");
        numTres = input.nextInt();


        if(numUm > numDois && numUm > numTres){
            System.out.print("O maior número é: " + numUm);
        } else if (numDois > numUm && numDois > numTres){
            System.out.print("O maior número é: " + numDois);
        } else {
            System.out.print("O maior número é: " + numTres);
        }

    }
}
