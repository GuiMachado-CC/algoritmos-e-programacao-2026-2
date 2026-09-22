import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota = 0;
        float soma= 0;
        int quant = 0;

        System.out.println("Acumulador e cálculo de média");
        System.out.println("Digite um número negativo para encerrar o programa");



            while (nota >= 0 || quant < 1) {
                System.out.println("Digite uma nota: ");
                nota = input.nextFloat();

                if (nota >= 0) {
                    soma += nota;
                    quant++;
                }
            }

        System.out.println("Quantidade de notas: "+ quant );
        System.out.println("Média: " + soma/quant);

    }
}
