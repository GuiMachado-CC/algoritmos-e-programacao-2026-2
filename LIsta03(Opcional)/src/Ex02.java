import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int varA;
       int varB;
       int varC;
       int delta;

        System.out.println("Função de 2° grau");
        System.out.println("Digite o valor das variáveis a, b e c da função de 2° grau: ax²+bx+c");

        System.out.println("Digite a variável  'a' :");
        varA = input.nextInt();

        System.out.println("Digite a variável  'b' :");
        varB = input.nextInt();

        System.out.println("Digite a variável  'c' :");
        varC = input.nextInt();

        delta = (varA * varA) - 4 * varB * varC;

        if (varA != 0) {
            if (delta < 0) {
                System.out.println("Não existem raízes reais");
            } else if (delta > 0){
                System.out.println("Existem duas raízes reais diferentes");
            } else {
                System.out.println("Existem duas raízes reais iguais");
            }
        } else {
            System.out.println("Não se trata de uma equação do segundo grau");
        }

    }
}